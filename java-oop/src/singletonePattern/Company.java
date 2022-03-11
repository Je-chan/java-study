package singletonePattern;
// 싱글톤 패턴은 인스턴스가 단 한개만 생성돼야 하는 경우에 사용하는 디자인 패턴이다.
// static 을 활용해서 구현할 수 있다.

public class Company {
	
	// 이렇게 만든 게 유일한 인스턴
	private static Company instance = new Company();
	
	// 생성자를 만들어서 default 생성자를 없애 버린다.
	// 그리고 private modifier 를 줘서 생성자를 사용할 수 없게 만든다.
	private Company() {}
		
	// 일반 메소드라면 인스턴스를 생성하고 접근이 가능한데, 우리가 그걸 막아버렸다.
	// 그렇기 때문에 static 메소드로 만들어서 클래스에 바로 접근할 수 있도록 만든다.
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
}
