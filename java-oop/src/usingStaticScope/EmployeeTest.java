package usingStaticScope;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee employeeLee = new Employee();
		employeeLee.setEmployeeName("이익준");

		Employee employeeKim = new Employee();
		employeeKim.setEmployeeName("김명준");
		
		System.out.println(Employee.getSerialId());
		
		System.out.println(employeeLee.getEmployeeName() + "님의 사번은 " + employeeLee.getEmployeeId() + "입니다.");
		System.out.println(employeeKim.getEmployeeName() + "님의 사번은 " + employeeKim.getEmployeeId() + "입니다.");
		
		System.out.println(Employee.getSerialId());
		
	}

}
