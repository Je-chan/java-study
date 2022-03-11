package encapsulation;

public class MakeReport {
	// String 클래스를 쭉 이어서 쓰는 방법 중 하나로 Buffer 를 이용해 String 을 연결
	// 내부적으로 제공되고 있는 것
	StringBuffer buffer = new StringBuffer();
	
	private String line = "===============================\n";
	private String title = "   이름\t   주소 \t\t  전화번호  \n";
	
	// 객체 지향에서는 이 정보를 공개할 것인가 말 것인가를 설계하는 것이 중요한 이슈.
	// 메소드와 속성을 모두 공개하는 것이 아니라, 사용하는 쪽으로 하여금 어떻게 효율적으로 정보를 제공하고, 객체를 보호할 것인지에 대한 고민
	
	private void makeHeader() 
	{
		buffer.append(line);
		buffer.append(title);
		buffer.append(line);
	}
	
	private void generateBody()
	{
		// 나중에 배열과 for 를 이용해서 유용하게 사용할 수 있다.
		buffer.append("James \t");
		buffer.append("Seoul Korea \t");
		buffer.append("010-2222-3333\n");
	
		buffer.append("Tomas \t");
		buffer.append("NewYork US \t");
		buffer.append("010-7777-0233\n" );
	}
	
	private void makeFooter()
	{
		buffer.append(line);
	}
	
	
	// Client 는 레포트를 받기만 하면 되고 그 안의 로직은 참고하지 않아도 된다.
	// 오히려 참조를 하고 수정을 가하게 되면 에러를 발생할 여지를 남겨두는 
	
	public String getReport() 
	{
		makeHeader();
		generateBody();
		makeFooter();
		return buffer.toString();
	}
}
