package polymorphism;

import java.util.ArrayList;

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}

}

class Human extends Animal {
	@Override
	public void move() {
		System.out.println("사람이 두 발로 걸어 다닙니다.");
	}

	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger extends Animal {
	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle extends Animal {
	@Override
	public void move() {
		System.out.println("독수리가 하늘을 날아 다닙니다.");
	}
	
	public void flying() {
		System.out.println("독수리가 양날개를 쭉 펴고 날아다닙니다.");
	}
}

public class AnimalTest {
	
	public static void main(String[] args) {
		
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		
		AnimalTest test = new AnimalTest();
		test.moveAnimal(hAnimal);
		test.moveAnimal(tAnimal);
		test.moveAnimal(eAnimal);
		
		ArrayList<Animal> animalList = new ArrayList<>();
		animalList.add(hAnimal);
		animalList.add(tAnimal);
		animalList.add(eAnimal);
		
		for (Animal animal : animalList) {
			animal.move();
		}
	}
	
	// 코드는 한 줄이지만 어떤 데이터, 인스턴스가 들어갔느냐에 따라 함수의 결과물이 달라진다.
	// 상속이 됐고 상속에서 Overriding 하고 형변환이 일어났다.
	// 상속을 하게 되면, 하위클래스들을 상위 클래스 하나로 핸들링할 수 있다.
	// 상위 클래스를 바꾸면 하위에도 영향을 주므로, 신중하게 신경써야 한다. 
	public void moveAnimal(Animal animal) {
		animal.move();
	}
}
