package ASC;

public class OrderInfoDTO {
	private int no;
	private int sup_name;
	private int dem_name;
	private String pro_name;
	private String h_many;
	private String tot_price;
	private String ore_date;
	
	public OrderInfoDTO(int no, int sup_name, int dem_name, String pro_name, String h_many, String tot_price,
			String ore_date) {
		this.no = no;
		this.sup_name = sup_name;
		this.dem_name = dem_name;
		this.pro_name = pro_name;
		this.h_many = h_many;
		this.tot_price = tot_price;
		this.ore_date = ore_date;
	}



	public OrderInfoDTO(int sup_name) {
		this.sup_name = sup_name;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getSup_name() {
		return sup_name;
	}

	public void setSup_name(int sup_name) {
		this.sup_name = sup_name;
	}

	public int getDem_name() {
		return dem_name;
	}

	public void setDem_name(int dem_name) {
		this.dem_name = dem_name;
	}

	public String getPro_name() {
		return pro_name;
	}

	public void setPro_name(String pro_name) {
		this.pro_name = pro_name;
	}

	public String getH_many() {
		return h_many;
	}

	public void setH_many(String h_many) {
		this.h_many = h_many;
	}

	public String getTot_price() {
		return tot_price;
	}

	public void setTot_price(String tot_price) {
		this.tot_price = tot_price;
	}
	
	public String getOre_date() {
		return ore_date;
	}


	public void setOre_date(String ore_date) {
		this.ore_date = ore_date;
	}


	
	
	
	
	

	
	
}
