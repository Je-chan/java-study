package array;

import java.util.ArrayList;

public class ArrayListEg {

	public static void main(String[] args) {
		
		// 아무 명시도 안 해주면 기본적으로 10개의 인덱스가 마련된다.
		ArrayList<Book> library = new ArrayList<>();
		
		library.add(new Book("태백산맥1 ", "조정래"));
		library.add(new Book("태백산맥2 ", "조정래"));
		library.add(new Book("태백산맥3 ", "조정래"));
		library.add(new Book("태백산맥4 ", "조정래"));
		library.add(new Book("태백산맥5 ", "조정래"));
		
		// ArrayList 로 만들어서 length 가 아닌 size 를 하면 요소의 갯수만큼만 돌린다는 의미 
		// 원래는 기본 제공된 10개의 인덱스를 돌아야 하지만, 지금은 5개만 돈다.
		for(int i = 0 ; i < library.size(); i++) {
			// get 이 인자값으로 들어온 인덱스를 확인한다는 것을 의미한다.
			library.get(i).showInfo();
		}
	}

}
