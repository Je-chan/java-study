package array;

public class ObjectArrayCopy {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		Book[] shallowCopyLibrary = new Book[5];
		Book[] deepCopyLibrary = new Book[5];
			
		library[0] = new Book("태백산맥1", "조정래");
		library[1] = new Book("태백산맥2", "조정래");
		library[2] = new Book("태백산맥3", "조정래");
		library[3] = new Book("태백산맥4", "조정래");
		library[4] = new Book("태백산맥5", "조정래");
		
		// 아래와 같이 하는 게 주소를 복사한 얕은 복사. 
		// System.arraycopy(원본, 원본의 몇 번째 인덱스부터 복사할지, 복사본, 복사본의 몇 번째 인덱스부터 복사본을 저장할지, 복사 길이);
		// 아래의 코드를 해석하면 library 를 0 번째 인덱스부터 5 길이 만큼의 요소를 복사할 것이고, 그 복사된 값은 copyLibrary의 0번 째 인덱스부터 붙여넣기 할 것이다 라는 의미 
		System.arraycopy(library, 0, shallowCopyLibrary, 0, 5);
		
		// 지금부터 할 건 깊은 복사
		// 아예 인스턴스를 할당하고 그 안의 값만 바꾸는 것.
		// 인스턴스가 이미 있기 때문에 주소 값은 다르고, 값만 같게 된다.
		deepCopyLibrary[0] = new Book();
		deepCopyLibrary[1] = new Book();
		deepCopyLibrary[2] = new Book();
		deepCopyLibrary[3] = new Book();
		deepCopyLibrary[4] = new Book();
		
		for(int i = 0 ; i < library.length ; i++) {
			deepCopyLibrary[i].setAuthor(library[i].getAuthor());
			deepCopyLibrary[i].setTitle(library[i].getTitle());
		}
		
		
		// 여기서 원본 배열을 수정하면 같은 주소값을 참조하는 shallow copy 도 덩달아서 값이 바뀔 거고 deep 은 바뀌지 않는다.
		library[0].setAuthor("박완서");
		library[0].setTitle("나목");
		
		System.out.println("== library ==");
		
		for(Book book : library) {
			System.out.println(book);
			book.showInfo();
		}
		
	
		
		System.out.println("");
		System.out.println("");

		System.out.println("== shallow copy library ==");

		for (Book book : shallowCopyLibrary) {
			System.out.println(book);
			book.showInfo();
		}
		
		
		
		System.out.println("");
		System.out.println("");
		
		System.out.println("== deep copy library ==");

		for (Book book : deepCopyLibrary) {
			// 주소값이 다르다는 것도 확인할 수 있다.
			System.out.println(book);
			book.showInfo();
		}
	}

}

