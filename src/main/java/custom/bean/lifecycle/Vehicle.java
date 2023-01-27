package custom.bean.lifecycle;

public class Vehicle {
	String companyName;
	int id;
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vehicle(String companyName, int id) {
		super();
		this.companyName = companyName;
		this.id = id;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Vehicle [companyName=" + companyName + ", id=" + id + "]";
	}
	
	public void init()
	{
		System.out.println("inside init()");
	}
//	
//	public void myInit()
//	{                                       we can change the name of init and destroy method
//		System.out.println("inside myinit()");  but we cant change its syntax
//	}
	
	
	public void destroy()
	{
		
		System.out.println("calling destroy.....");
	}
	
//	public void myDistroy()
//	{
//		System.out.println("calling mydestroy.....");
//	}
}
