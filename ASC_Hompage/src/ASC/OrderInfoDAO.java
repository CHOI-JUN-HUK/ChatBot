package ASC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class OrderInfoDAO {

	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;
	private CallableStatement cstmt;

	private void getConnection() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String db_url = "jdbc:oracle:thin:@JNOTEBOOK:1521:xe";
			String db_id = "hr";
			String db_pw = "hr";
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
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
			if (cstmt != null) {
				cstmt.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	
	public ArrayList<OrderInfoDTO> select(int cus_num) {
		getConnection();
		ArrayList<OrderInfoDTO>info = new ArrayList<OrderInfoDTO>();
		
		String sql = "select * from orderinfo where sup_name = ?";
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, cus_num);
			
			rs = psmt.executeQuery();
			
			
			while(rs.next()) {
				int no = rs.getInt(1);
				int sup_name = rs.getInt(2);
				int dem_name = rs.getInt(3);
				String pro_name = rs.getString(4);
				String h_many = rs.getString(5);
				String tot_price = rs.getString(6);
				String ore_date = rs.getString(7);
				
				OrderInfoDTO dto = new OrderInfoDTO(no, sup_name, dem_name, pro_name, h_many, tot_price, ore_date);
				info.add(dto);
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return info;
	}
}
