package array;

public class BookTest {

	public static void main(String[] args) {
		
		// 객체를 배열로 만들 경우 타입 역시 해당 클래스의 이름을 넣어준다.
		// 항상 Array 를 생성할 때는, 값이 들어가기 위한 메모리를 확보할 뿐이지 그 안에 값이 들어가는 것이 아니다.
		// 단, 기본 자료형과의 차이점은, 기본 자료형은 몇 바이트가 들어갈 것인지 명확해서 그에 맞는 메모리를 확보하지만
		// 객체의 경우 그렇지 않기 때문에 null 로 들어간다.
		
		Book[] library = new Book[5];
		
		// 객체를 만들어서 배열에 직접 넣어야 한다.
		library[0] = new Book("태백산맥1", "조정래");
		library[1] = new Book("태백산맥2", "조정래");
		library[2] = new Book("태백산맥3", "조정래");
		library[3] = new Book("태백산맥4", "조정래");
		library[4] = new Book("태백산맥5", "조정래");
		
		for(Book book : library) {
			System.out.println(book);
			book.showInfo();
		}
		
		
	}

}
