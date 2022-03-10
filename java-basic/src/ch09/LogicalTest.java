package ch09;

public class LogicalTest {

	public static void main(String[] args) {
		
		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 += 10) < 10) && ((i += 2) < 10);
		
		System.out.println(value);
		System.out.println(num1);
		// i 값은 변하지 않는다. 앞의 항이 이미 false 이기 때문에 이뤄지지 않음 
		System.out.println(i);
		
		boolean value1 = ((num1 += 10) < 10) || ((i += 2) < 10);

		System.out.println(value1);
		System.out.println(num1);
		// i 값은 변하게 된다. 앞의 값이 false 이기 때문에 뒤의 연산도 진행하는 
		System.out.println(i);
	}

}
