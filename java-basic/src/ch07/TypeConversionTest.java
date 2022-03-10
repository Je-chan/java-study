package ch07;

public class TypeConversionTest {
	public static void main(String[] args) {
		byte bNum = 125;
		int iNum = bNum; 
		
		System.out.println(iNum);
		
		int iNum2 = 255;
		byte bNum2 = (byte)iNum2;
		
		// 원하는 값이 나올 수가 없음 
		System.out.println(bNum2);
		
		double dNum = 3.14;
		int inum = (int)dNum;
		
		System.out.println(inum);
		
		
		double dNum2 = 1.2;
		float fNum = 0.9F;
		
		int iNum3 = (int)dNum2 + (int)fNum;
		int iNum4 = (int)(dNum2 + fNum);
		
		System.out.println(iNum3);
		System.out.println(iNum4);
	}
}