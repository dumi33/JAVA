package sec05;
class Animal{ //부모클래스
	public Animal(String s) {  //부모 class의 생성자
		System.out.println("동물 : "+ s);
	}
}
class Mammal extends Animal{ // 자식클래스
	public Mammal() {
		super("원숭이");
		System.out.println("포유류 : 원숭이");
		
	}
	public Mammal(String s) {
		super(s);
		System.out.println("포유류 : " + s);
	}
	
}
public class AnimalDemo {
	public static void main(String[] args ) {
		Mammal ape = new Mammal();
		Mammal lion = new Mammal("사자");
	}
}
