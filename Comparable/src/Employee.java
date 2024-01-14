
public class Employee implements Comparable<Employee> {

	private int empId;
	private String name;
	private String phone;
	
	@Override
	public int compareTo(Employee o) {
		return this.empId-o.empId;
	}

	public Employee() {

	}

	public Employee(int empId, String name, String phone) {
		this.empId = empId;
		this.name = name;
		this.phone = phone;
	}

	public int getEmpId() {
		return empId;
	}

	public String getName() {
		return name;
	}

	public String Phone() {
		return phone;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return " "+this.empId+" "+this.name+ " "+this.phone ;
	}

	
}
