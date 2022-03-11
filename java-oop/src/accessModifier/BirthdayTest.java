package accessModifier;

public class BirthdayTest {

	public static void main(String[] args) {

		Birthday date = new Birthday();
		
		date.setYear(2019);
		date.setMonth(13);
		date.setDay(30);
		
		date.showDate();
		
		Birthday correctDate = new Birthday();
		
		correctDate.setYear(2019);
		correctDate.setMonth(12);
		correctDate.setDay(30);
		
		correctDate.showDate();
		
		// 만약 public 으로 열어둘 경우, 멤버 변수의 오용을 막을 수 있다.
		// private 로 직접적인 데이터 전환을 방지하고 오염되는 것을 막는다.
		// 아래와 같은 잘못된 경로를 막아낼 수 있다.
//		correctDate.month = 100
		
		// 추가적으로 디버깅할 때 편하다.
	}

}
