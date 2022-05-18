package entities;

public class Company extends User{
	private String CompanyName;

	public Company(){
		
	}
	public Company(int id,String email,String companyName) {
		this();
		this.id=id;
		this.email=email;
		this.CompanyName = companyName;
	}

	public String getCompanyName() {
		return CompanyName;
	}

	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}

}
