package accessModifier;

public class Birthday {
	// private 을 사용하면 이 클래스 이외의 다른 곳에서 사용이 불가능
	private int day;
	private int month;
	private int year;
	
	// boolean의 default 값은 false 
	private boolean isValid;
	
	// 직접적인 사용은 불가능 하지만 private 으로 지정된 변수들을 수정하고 싶다면 get/set 사용

	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}
 
	public void setMonth(int month) {
		if(month < 1 || month > 12) {
			isValid = false;
		} else {		
		isValid = true;
		this.month = month;
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void showDate() {
		if(isValid) {
			System.out.println(year + "년 " + month + "월 "+ day + "일 입니다.");
		} else {
			System.out.println("유효하지 않은 날짜입니다.");
		}
	}

	
}
