package ch12;

public class NestedLoopTest {

	public static void main(String[] args) {


		// for 를 이용한 구구단 
		for (int dan = 2 ; dan <= 9; dan++ ) {
			for( int count = 1; count <= 9; count++ ) {
				
				System.out.println( dan + "X" + count + "=" + dan * count);
				
			}
			
			System.out.println();
		}
		
		
		// while 을 이용한 구구단 
		int dan = 2;
		
		while (dan <= 9) {
			
			int count = 1;
			
			while (count <= 9) {
				System.out.println(dan + "X" + count + "=" + dan*count);
				count++;
			}
			dan++;
			System.out.println();
		}
	}

}
