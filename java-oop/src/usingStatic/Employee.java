package usingStatic;

public class Employee {

	// static 을 사용하면 생성되는 각 인스턴스가 공유하는 static 값을 참조하게 된다. 

	public static int serialNum = 1000;
	
	public static int serialId = 1000;
	
	
	private int employeeId;
	private String employeeName;
	private String department;
	
	
	public Employee() {
		employeeId = serialId; 
		serialId++;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
}
