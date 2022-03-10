package ch07;

public class ConstantTest {
	public static void main(String[] args) {
		int MAX_NUM = 100;
		MAX_NUM = 20;
		
		final int MIN_NUMBER = 10;
//		MIN_NUMBER = 20;
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUMBER);

	}
}
