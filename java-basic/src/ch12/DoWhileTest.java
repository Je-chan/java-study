package ch12;

import java.util.Scanner;

public class DoWhileTest {
	
	public static void main (String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)) {
			int input;
			
			int sum = 0; 
					
			// do While 은 일단 do 에 있는 거 먼저 하고 while 조건에 부합하면 끝나는 
			do {
				input = scanner.nextInt();
				sum += input;
			} while (input != 0);
			
			
			System.out.println(sum);
		}
	}
} 
