package usingStaticScope;

public class Employee {

	// static 변수는 웬만하면 private 으로 사용한다.
	// 건들면 안 되기에 일부러 get 만 남긴다.

	// 멤버 변수가 많으면 인스턴스를 생성할 때 메모리를 많이 차지하게 된다.
	// 멤버 변수는 클래스의 속성이 될 것만 만들어 주는 게 낫다
	// static 은 프로그램이 메모리에 있는 동안 그 영역을 계속 차지하므로 큰 메모리 할당은 하지 않는 게 좋다.
	
	private static int serialId = 1000;
	private int employeeId;
	private String employeeName;
	private String department;
	
	

	public Employee() {
		employeeId = serialId; 
		serialId++;
	}
	
	// static 메소드(클래스 메소드) 를 사용하면 멤버 변수를 사용할 수 없다
	// static 은 인스턴스 생성과 무관하게 클래스 이름으로 호출될 수 있기 때문.
	// 지역 변수 사용은 상관이 없다.
	
	public static int getSerialId() {
	//	employeeName = "Lee";
		return serialId;
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
