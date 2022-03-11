package constructor;

public class Student {
	
	// 멤버 변수는 만들어지면 자동으로 초기화가 된다.
	// String 은 null 값으로 초기화가 되고 int는 0으 초기화가 된다. 
	public int studentNumber;
	public String studentName;
	public int grade;
	
	
	public Student() {};
	// 바로 아래의 코드는 우리가 직접 생성자 코드를 만든 것
	// 그러면 앞으로 기본 생성자를 사용할 수 없다.
	// 하지만 기본 생성자도 만들고 싶다면 기본 생성자와 같이 위의 코드로 만들면 된다
	// 이런 과정을 constructor Overloading 이라고 한다 
	
	public Student(int studentNumber, String studentName, int grade) {
//		아래와 같이 코드를 작성하면 안 된다. 아래의 코드는 그냥 매개 변수에 매개변수의 값을 재할당 하는 		
//		studentNumber = studentNumber;
// 		this 를 사용해서 멤버 변수임을 명시하는 
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.grade = grade;
	}
	
	public String showStudentInfo() {
		
		// 지역 변수의 경우, 자동으로 초기화가 되지 않는다.
		// int i;
		
		return studentName + "학생의 학번은 " + studentNumber + "이고, " + grade + "학년 입니다.";
	}
}
