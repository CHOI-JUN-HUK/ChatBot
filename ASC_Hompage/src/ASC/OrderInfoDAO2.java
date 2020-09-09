package ASC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class OrderInfoDAO2 {

	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;

	private void getConnection() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String db_url = "jdbc:sqlserver://172.30.1.100:1433;" + "databaseName=ASC_MES;";
			String db_id = "smart-mes";
			String db_pw = "mes";
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void close() {

		try {
			if (rs != null) {
				rs.close();
			}
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}


	public ArrayList<OrderInfoDTO2> select2(int cus_num, String from_date, String to_date) {
		getConnection();
		ArrayList<OrderInfoDTO2> info2 = new ArrayList<OrderInfoDTO2>();
		String sql = "select top 5\r\n" + 
				"	c.cust_name, c.tel, c.fax, c.addr, o.part_id, o.order_qty, o.order_date \r\n" + 
				"from TB_PART_ORDER o , TB_CUST c \r\n" + 
				"where o.PLANT_ID = c.PLANT_ID\r\n" + 
				"	and ?<=o.ORDER_DATE \r\n" + 
				"	and o.ORDER_DATE<=?\r\n" + 
				"	and o.PLANT_ID=?\r\n" + 
				"order by o.ORDER_DATE desc";
		try {
			psmt = conn.prepareStatement(sql);
			
			
			psmt.setString(1, from_date);
			psmt.setString(2, to_date);
			psmt.setInt(3, cus_num);
			
			
			rs = psmt.executeQuery();
			
			
			while(rs.next()) {
				String cust_name = rs.getString(1);
				String tel = rs.getString(2);
				String fax = rs.getString(3);
				String addr = rs.getString(4);
				String part_id = rs.getString(5);
				int order_qty = rs.getInt(6);
				String order_date = rs.getString(7);
				
				OrderInfoDTO2 dto = new OrderInfoDTO2(cust_name, tel, fax, addr, part_id, order_qty, order_date);
				info2.add(dto);
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return info2;

	}
}
