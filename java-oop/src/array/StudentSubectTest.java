package array;

public class StudentSubectTest {

	public static void main(String[] args) {

		Student studentLee = new Student(1001, "Lee");
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학", 90);
		studentLee.addSubject("영어", 100);
		studentLee.addSubject("사회", 90);

		Student studentKim = new Student(1002, "Kim");
		studentKim.addSubject("국어", 40);
		studentKim.addSubject("수학", 100);
		studentKim.addSubject("영어", 50);
		studentKim.addSubject("과학", 100);

		studentLee.showScoreInfo();
		System.out.println("==========================");
		studentKim.showScoreInfo();
	}

}
