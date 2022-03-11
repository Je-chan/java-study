package array;

public class ArrayTest {

	public static void main(String[] args) {

		int[] arr = new int[10]; // 10개 짜리 배열을 만듦. 값을 넣기 전까지는 초기화된 값으로 0이 들어간다. 
		int total = 0;
		int total2 = 0;
		
		for (int i = 0, num=1; i < arr.length; i++) {
			arr[i] = num++;			
		}
		
		// arr와 arr2 는 동일하다.
		int[] arr2 = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		// enhanced for loop은 모든 요소를 순회할 때 사용한다.
		for(int num : arr ) {
			// num 에 할당되는 값은 배열의 요소가 된다.
			total += num;
		}
		
		for(int num : arr2) {
			total2 += num;
		}
	
		System.out.println(total);
		System.out.println(total2);
		
		// 한 가지 주의점: 배열의 길이와 요소의 개수는 동일하지 않다.
		// 배열에 할당해준 length 값과 그 안에 추가한 요소의 값은 동일하지 않을 수 있다.
		// 그런 경우, 요소의 개수에 대한 변수(count 등)을 따로 유지해야 한다.
 	}

}
