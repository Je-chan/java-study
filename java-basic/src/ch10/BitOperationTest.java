package ch10;

public class BitOperationTest {

	public static void main(String[] args) {
	
		int num1 = 5;  // 00000101
		int num2 = 10; // 00001010
		
		// | 비트 연산자 
		System.out.println(num1 | num2); 
		// 비트 연산에서 둘 중 하나만 1 이면 1
		// 00001111 = 15
		
		// & 비트 연산
		System.out.println(num1 & num2); 
		// 둘 모두 1일 때만 1
		// 00000000 = 0
		
		// ^ 비트 연산 
		System.out.println(num1 ^ num2); 
		// 비트가 서로 다를 때 1
		// 00001111
		
		// ~ 비트 연산 
		System.out.println(~num1);
		// 0이면 1, 1이면 0
		// 11111010 = -6
		// 위의 숫자는 보수라는 개념 
		
		
		// << (숫자)
		System.out.println(num1 << 2);
		// 비트를 (숫자) 만큼 왼쪽으로 자릿수를 이동
		// 보통 2의 (숫자) 제곱만큼 값이 커진다. (위의 경우 2의 2제곱인 4배수)
		System.out.println(num1 <<= 2);
		// 이렇게 되면 num1 의 값이 비트가 옮겨진 값으로 재할당된다.
		
		// >> (숫자) 
		System.out.println(num1 >> 1);
		// 비트를 (숫자) 만큼 오른쪽으로 자릿수를 이동
		// 이건 2의 -(숫자) 제곱만큼 값이 곱해진다 (위의 경우 2의 -1제곱인 1/2 배수)
		
		
		// 연산자 우선순위
		// 1. 일차식 (), [] 
		// 2. 단항 !, ++, --
		// 3. 산술 %, /, * 
		// 4. 산술 +, -
		// 5. 비트 이동 >>, <<
		// 6. 관계 <, >, <=, >=
		// 7. 관계 ==, !=
		// 8. 비트 곱 &
		// 9. 비트 차 ^
		// 10. 비트 합 |
		// 11. 논리 곱 &&
		// 12. 논리 합 || 
		// 13. 조건 ? : 
		// 14. 대입 =, +=, -= ..

	}

}
