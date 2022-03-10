package ch03;

public class VariableTes {
	public static void main(String[] args) {
//		byte bnum = 128; 128까지 담을 수 없는 메모리 사이즈 
		byte bnum = 127;
		
		System.out.println(bnum);
//		int num = 12345678900;
//		long lnum = 12345678900;
		long lnum = 12345678900L;
		System.out.println(lnum);
	}
}
