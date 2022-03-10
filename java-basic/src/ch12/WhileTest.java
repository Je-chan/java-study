package ch12;

public class WhileTest {

	public static void main(String[] args) {
		
		int num = 1;
		int sum = 0;
		
		while(num <= 10) {
			// block 안의 지역 변수는 자동으로 초기화가 되지 않는다.
			// 지역 변수의 초기화는 중요한 이
			sum += num;
			num++;
			
		}
		
		System.out.println(sum);
		System.out.println(num);
	}

}
