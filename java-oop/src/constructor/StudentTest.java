package constructor;

public class StudentTest {
	
	public static void main(String[] args) {
		
		// 이렇게 사용할 수 있는 이유는 기본 생성자가 있기 때문.
		Student studentLee = new Student();
		
		System.out.println(studentLee.showStudentInfo());
		
		
		Student studentKim = new Student(123456, "kim", 3);
		System.out.println(studentKim.showStudentInfo());
	}
}
