package overriding;

public class VIPCustomer extends Customer{
	double salesRatio;
	private String agentID;
	
	public VIPCustomer() {
		bonusRatio = 0.05;
		salesRatio = 0.1;
		customerGrade = "VIP";
	}
	
	// 애노테이션. Override 된 메소드임을 컴파일에게 알려주는 것 
	@Override 
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		price -= (int)(price * salesRatio);
		return price;
	}
	
	public String getAgentID() {
		return agentID;
	}
}
