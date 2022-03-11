package array;

import java.util.ArrayList;

public class Student {
	
	int studentId;
	String studentName;

	// 이 학생이 수강하는 과목을 배열로 갖자는 것.
	// array list 안으로 들어가는 게 Subject 객체
	// 이렇게 하면 입력 받는 Subject 의 개수가 가변적으로 변동될 수 있다.
	ArrayList<Subject> subjectList;
	
	
	Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		
		// 학생마다 배열은 따로 잡힌다.
		subjectList = new ArrayList<>();
	}
	
	public void addSubject(String name, int point) {
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScorePoint(point);
		
		// add 를 사용하면 요소로 객체가 들어가게 된다. 
		subjectList.add(subject);
	}
	
	public void showScoreInfo() {
		int total = 0;
		for (Subject subject : subjectList) {
			total += subject.getScorePoint();
			System.out.println(studentName + "학생의" + subject.getName() + " 과목의 성적은 " + subject.getScorePoint() + "입니다.");
		}
		
		System.out.println(studentName +"학생의 점수" + total +"점입니다.");
	}
}
