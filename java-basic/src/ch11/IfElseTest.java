package ch11;

public class IfElseTest {

	public static void main(String[] args) {

		int age = 9;
		
		if(age >= 8) {
			System.out.println("학교에 다닙니다.");
		} 
		else {
			System.out.println("학교에 다니지 않습니다.");
		}
		
		System.out.println("노는게 제일 좋아");
		
		
		
		int charge;
		
		if(age < 8) {
			charge = 1000;
			System.out.println("미 취학 아동입니다.");
		}
		else if(age < 14) {
			charge = 2000;
			System.out.println("초등학생입니다.");
		}
		else if(age < 20) {
			charge = 2500;
			System.out.println("중고등학생입니다.");
		}
		else {
			charge = 3000;
			System.out.println("어른입니다.");
		}
		
		System.out.println("입장료는 " + charge + "원입니다.");
	}

}
