package project;

public class MemberVO {
	/* DTO 만드는 방법
	 SELECT 'private String ' || lower(column_name) || ';'
	   FROM ALL_TAB_COLUMNS
	  WHERE TABLE_NAME = 'MEMBER'
	*/
	
	private String mem_id;
	private String mem_pass;
	private String mem_name;
	private String mem_add1;
	private String mem_add2;
	private String mem_hometel;
	private String mem_coltel;
	public String getMem_id() {
		return mem_id;
	}
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	public String getMem_pass() {
		return mem_pass;
	}
	public void setMem_pass(String mem_pass) {
		this.mem_pass = mem_pass;
	}
	public String getMem_name() {
		return mem_name;
	}
	public void setMem_name(String mem_name) {
		this.mem_name = mem_name;
	}
	public String getMem_add1() {
		return mem_add1;
	}
	public void setMem_add1(String mem_add1) {
		this.mem_add1 = mem_add1;
	}
	public String getMem_add2() {
		return mem_add2;
	}
	public void setMem_add2(String mem_add2) {
		this.mem_add2 = mem_add2;
	}
	public String getMem_hometel() {
		return mem_hometel;
	}
	public void setMem_hometel(String mem_hometel) {
		this.mem_hometel = mem_hometel;
	}
	public String getMem_coltel() {
		return mem_coltel;
	}
	public void setMem_coltel(String mem_coltel) {
		this.mem_coltel = mem_coltel;
	}
	
	
	
	
	
	
	
}