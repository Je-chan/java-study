package usingThis;

public class Person {
	String name;
	int age;
	
	// 인자로 아무것도 안 들어온 경우 생성자 호출의 경우,
	// 이미 만들어 놓은 게 있기 때문에 초기화를 만드는 것
	// this 를 이용해 생성자도 호출할 수 있다.
	// this 는 이 클래스가 만들어지고 나서 참조 값이 존재하는 heap 메모리의 주소를 가리키게 된다.
	public Person() 
	{
		// this 로 생성자를 호출한 경우, 이 코드 이전 줄에 코드를 작성하게 되면, 아직 인스턴스 생성 전이기에 에러가 발생한
		this("no name", 1);
	}
	
	public Person(String name, int age) 
	{
		this.name = name;
		this.age = age;
	}
	
	
	public void showPerson ()
	{
		System.out.println(name + ", " + age);
	}
	
	public static void main(String[] args) {
		
		Person person = new Person();
		person.showPerson();
		
		System.out.println(person);
		
		Person person2 = person.getPerson();
		// person과 동일한 주소 값을 반환하게 된다.
		System.out.println(person2);
	}
	
	public Person getPerson() {
		// this 는 저장된 힙 메모리의 주소를 가리키게 될 것 
		return this;
	}
}
