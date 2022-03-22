package downCasting;

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

public class DownCastingAnimalTest  {
	
	public static void main(String[] args) {
		
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		
		DownCastingAnimalTest test = new DownCastingAnimalTest();
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
		
		test.testDownCasting(animalList);
	}
	
	// 코드는 한 줄이지만 어떤 데이터, 인스턴스가 들어갔느냐에 따라 함수의 결과물이 달라진다.
	// 상속이 됐고 상속에서 Overriding 하고 형변환이 일어났다.
	// 상속을 하게 되면, 하위클래스들을 상위 클래스 하나로 핸들링할 수 있다.
	// 상위 클래스를 바꾸면 하위에도 영향을 주므로, 신중하게 신경써야 한다. 
	public void moveAnimal(Animal animal) {
		animal.move();
	}
	
	// moveAnimal 에서는 각자의 인스턴스가 고유하게 갖고 있는 메소드를 활용할 수 없다.
	// 그런 것들을 사용하기 위해 다운캐스팅을 진행한다.
	public void testDownCasting(ArrayList<Animal> list) {
		for(int i = 0 ; i < list.size(); i++) {
			Animal animal = list.get(i);			
			
			if(animal instanceof Human) {
				Human human = (Human) animal;
				human.readBook();
			}
			else if(animal instanceof Tiger) {
				Tiger tiger = (Tiger) animal;
				tiger.hunting();
			}
			else if(animal instanceof Eagle) {
				Eagle eagle = (Eagle) animal;
				eagle.flying();
			}
			else {
				System.out.println("unsupported type");
			}
		}
	}
}
