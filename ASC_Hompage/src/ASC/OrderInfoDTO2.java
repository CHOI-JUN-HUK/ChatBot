package ASC;

public class OrderInfoDTO2 {
	String cust_name;
	String tel;
	String fax;
	String addr;
	String part_id;
	int order_qty;
	String order_date;
	
	public OrderInfoDTO2(String cust_name, String tel, String fax, String addr, String part_id, int order_qty,
			String order_date) {
		this.cust_name = cust_name;
		this.tel = tel;
		this.fax = fax;
		this.addr = addr;
		this.part_id = part_id;
		this.order_qty = order_qty;
		this.order_date = order_date;
	}

	public String getCust_name() {
		return cust_name;
	}

	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getPart_id() {
		return part_id;
	}

	public void setPart_id(String part_id) {
		this.part_id = part_id;
	}

	public int getOrder_qty() {
		return order_qty;
	}

	public void setOrder_qty(int order_qty) {
		this.order_qty = order_qty;
	}

	public String getOrder_date() {
		return order_date;
	}

	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}
	
	
	
	
	
}
