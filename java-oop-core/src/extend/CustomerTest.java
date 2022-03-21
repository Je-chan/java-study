package extend;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customerLee = new Customer();
		customerLee.setCustomerName("이익준");
		customerLee.setCustomerID(10010);
		customerLee.bonusPoint=1000;
		
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerKim = new VIPCustomer();
		customerKim.setCustomerName("김명준");
		customerKim.setCustomerID(10210);
		customerKim.bonusPoint=10000;
		System.out.println(customerKim.showCustomerInfo());

	}

}
