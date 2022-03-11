package singletonePattern;

import java.util.Calendar;

public class CompanyTest {

	public static void main(String[] args) {

		// 두 개의 값은 동일한 주소를 가리킨다. 두개지만 결국 하나의 인스턴스 
		Company company = Company.getInstance();
		Company company2 = Company.getInstance();
		
		System.out.println(company);
		System.out.println(company2);
		
		// 싱글톤 패턴이 적용된 java util 사례 
//		Calendar calendar = new Calendar();
		Calendar calendar = Calendar.getInstance();
	}

}
