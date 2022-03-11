package referenceType;

public class Student {
	
	int studentId;
	String studentName;
	
	Subject korea;
	Subject math;
	
	Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		
		korea = new Subject();
		math = new Subject();
	}
	
	// Subject 생성자에서 메소드로 사용할 수도 있고, 이렇게 할 수도 있고
	public void setKoreaSubject(String name, int score) {
		korea.subjectName = name;
		korea.score = score;
	}
	
	public void setMathSubject(String name, int score) {
		math.subjectName = name;
		math.score = score;
	}
	
	public void showScoreInfo() {
		int total = korea.score + math.score;
		System.out.println(studentName +"학생의 점수" + total +"점입니다.");
	}
}
