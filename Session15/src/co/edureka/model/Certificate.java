package co.edureka.model;

public class Certificate {
	
	Integer cid;
	String cname;
	String company;

	public Certificate(){
		
	}
	
	public Certificate(Integer cid, String cname, String company) {
		this.cid = cid;
		this.cname = cname;
		this.company = company;
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Certificate [cid=" + cid + ", cname=" + cname + ", company=" + company + "]";
	}
}
