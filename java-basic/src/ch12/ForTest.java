package ch12;

public class ForTest {

	public static void main(String[] args) {

		int count = 1;
		int sum = 0;
		
		for (int i = 0 ; i < 10 ; i++) {
			sum += count;
			count++;
		}
	
		System.out.println(sum);
	}

}
