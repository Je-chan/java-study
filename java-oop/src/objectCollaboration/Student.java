package objectCollaboration;

// 만들어 볼 예제.
// 1. James 와 Tomas 는 각각 버스와 지하철을 타고 학교에 간다.
// 2. James 는 5000원을 가지고 있고, 100번 버스를 타면서 1000원을 지불한다.
// 3. Tomas 는 10000원을 가지고 있고, 초록색 지하철을 타면서 1200원을 지불한다.

public class Student {
	String studentName;
	int money;
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1200);
		this.money -= 1200;
	}
	
	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은 " + money + "원 입니다.");
	}
}
