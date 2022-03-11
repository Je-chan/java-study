package example;

public class Student {

	// Class 의 이름은 대문자로 하는 것이 좋다.
	// class 는 여러 개 있을 수 있으나 public 이라는 클래스 이름을 가진 것은 단 하나 
	// public 클래스 이름과 자바 파일의 이름은 동일해야 한다

	public int studentId;
	public String studentName;
	public String address;

	int majorCode;
	String majorName;
	int grade;

	public void showStudentInfo() {
		System.out.println( studentId + "학번 학생의 이름은 " + studentName + "이고, 주소는 " + address + "입니다.");
	}


	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String name) {
		studentName = name;
	}
}
