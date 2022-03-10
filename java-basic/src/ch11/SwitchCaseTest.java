package ch11;

import java.util.Scanner;

public class SwitchCaseTest {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			int month = scanner.nextInt();
			
//		int day;
			
//		자바 14 이전 버전 
//		switch(month) {
//			
//			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
//				day = 31;
//				break;
//			case 2: 
//				day = 28;
//				break;
//
//			case 4: case 6: case 9: case 11:
//				day = 30;
//				break;
//
//			default:
//				System.out.println("존재하지 않는 달입니다.");
//				day = -1;
//			
//		}
			
			// 자바 14버전 이후 case 를 축약해서 화살표와 break 문을 없앨 수 있
			// switch 에서 반환되는 값을 바로 할당할 수 있도록 설정할 수 있다.
			int day = switch(month) {
			
			case 1, 3, 5, 7, 8, 10, 12 ->
				31;
			case 2 -> 
				28;

			case 4, 6, 9, 11 ->
				30;

			default -> {
				System.out.println("존재하지 않는 달입니다.");
				// yiled 를 사용하면 로직 실행문과 구분해서 반환하는 값이 무엇인지를 명시할 수 있다.
				yield -1;
			}
};

			
			System.out.println(month + "월은 " + day + "일 입니다.");
		}
	}

}
