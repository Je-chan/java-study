package array;

public class TwoDimensionArray {

	public static void main(String[] args) {
		
		// 아래의 코드를 자바 스크립트 구조로 본다고 하면 		
		// [[1, 2, 3], [4, 5, 6, 7]] 이다.
		// 선언 방식이. [][] 를 통해 배열 안에 배열을 만들겠다는 거고
		// 가장 바깥의 {} 이 1차원 배열이 되고
		// 안쪽의 {} 이 2차원 배열이 된다.
		 
		int [][] arr = {{1, 2, 3}, {4, 5, 6, 7}};
		
		// 아래와 같이 코드를 만든다면, 초기화된 배열의 모습을 자바스크립트로 만들 경우
		// [[0, 0, 0, 0],[0, 0, 0, 0],[0, 0, 0, 0]] 이다
		// 첫 번째 배열의 요소 길이 값이 3이 되니까 배열 세 개가 들어가는 거고
		// 두 번째 배열의 요소 길이 값이 4가 되니까 int 의 default 값인 0이 4개가 들어가는 것
		int [][] arr2 = new int[3][4]; 
		
		int i, j;
		
		for(i = 0; i < arr.length ; i++) {
			
			for(j = 0; j < arr[i].length ; j++) {
				System.out.println(arr[i][j] + ",");
			}
			
			System.out.println("\t" + arr[i].length);
		}
		
		System.out.println(arr.length);
	}

}
