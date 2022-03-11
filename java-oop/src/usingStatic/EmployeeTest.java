package usingStatic;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee employeeLee = new Employee();
		employeeLee.setEmployeeName("이익준");
		
		System.out.println("이익준님의 serialNum은" + employeeLee.serialNum);
		// 위의 serialNum 에 노란색 밑줄이 쳐지는 이유는, 인스턴스랑 상관없이 클래스에 존재하는 값이므로
		System.out.println(Employee.serialNum);
		// 위와 같이 그냥 클래스에 바로 접근하는 것이 옳은 방법이기 때문 (지금은 편의상 보여주기 위해 인스턴스에 사용)
		
		Employee employeeKim = new Employee();
		employeeKim.setEmployeeName("김명준");
		employeeKim.serialNum++;
		
		
		// 이렇게 하면 공유가 되고 있기 때문에 이익준의 serialNum 도 증가하게 된다.
		System.out.println("이익준님의 serialNum은" + employeeLee.serialNum);
		System.out.println("김명준님의 serialNum은" + employeeKim.serialNum);
		
		
		System.out.println(employeeLee.getEmployeeName() + "님의 사번은 " + employeeLee.getEmployeeId() + "입니다.");
		System.out.println(employeeKim.getEmployeeName() + "님의 사번은 " + employeeKim.getEmployeeId() + "입니다.");
		
		
	}

}
