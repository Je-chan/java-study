package templateMethod;

public class CarTest {
	
	public static void main(String[] args) {
		
		Car aiCar = new AICar();
		aiCar.run();
		
		Car myCar = new ManualCar();
		myCar.run();
	}
}
