package example;

public class StudentTest {

	public static void main(String[] args) {
		
		// class Student 를 이용해서 student 하나를 생성하라는 의미.
		// 이렇게 해서 만들어진 객체를 인스턴스라고 한다.
		Student studentLee = new Student();
		
		studentLee.studentId = 12345;
		studentLee.setStudentName("Lee");
		studentLee.address = "서울 강남구";
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student();
		studentKim.studentId = 54321;
		studentKim.studentName = "Kim";
		studentKim.address = "경기도 성남시";
		
		studentKim.showStudentInfo();
		
		// 각각의 객체가 지니는 주소값을 찍게 된다.
		// 지역 변수는 스택에 쌓이고, 거기에 저장되는 정보는 Heap 메모리에 쌓인다.
		// 스택에 쌓이는 것은 참조 변수(studentKim), 거기에 할당되는 것을 참조 값이라고 한
		
		System.out.println(studentKim);
		System.out.println(studentLee);


	}

}
