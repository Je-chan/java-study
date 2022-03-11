package array;

public class CharArrayTest {

	public static void main(String[] args) {
		char[] alphabets = new char[26]; // 문자열로 이루어진 배열을 만들겠다는 의미 
		
		char ch = 'A';
		
		for(int i = 0 ; i < alphabets.length ; i++) {
			// 문자열도 결국 정수기 때문에 더할 수 있다.
			alphabets[i] = ch++;
		}
		

		for(char alphabet : alphabets) {
			System.out.println(alphabet + "," + (int)alphabet);
		}
	}
} 
