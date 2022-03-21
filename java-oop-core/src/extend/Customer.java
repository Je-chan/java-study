package extend;

public class Customer {
			
	// protected 수식어는 하위 클래스에서는 접근이 가능하지만, 그 외의 외부 클래스에서는 접근이 불가능하도록 하는 것
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double  bonusRatio;
	
	public Customer ()
	{
		customerGrade = "SILVER";
		bonusRatio = 0.01;	
	}
	
	public int caclPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	};
	
	  
	
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public String showCustomerInfo() {
		return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
	}
}
