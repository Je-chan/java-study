package abstractClass;

public class ComputerTest {

	public static void main(String[] args) {
		Computer desktop = new Desktop();
		desktop.display();
		// 추상 클래스는 new 키워드를 사용할 수 없다.
//		Computer computer = new Computer();

	}

}
