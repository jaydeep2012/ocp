package que2_3_4;

public class Employee implements Comparable<Employee>{
	private String empid;
	private String name;
	private String city;
	

	public Employee(String empid, String name, String city) {
		super();
		this.empid = empid;
		this.name = name;
		this.city = city;
	}

	public String getEmpid() {
		return empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "employee [empid=" + empid + ", name=" + name + ", city=" + city + "]";
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public int compareTo(Employee emp) {
	
		int x=this.getName().compareTo(emp.getName());
		if(x==0){
			return this.getCity().compareTo(emp.getCity());
		}
		else return x;
	}

}
