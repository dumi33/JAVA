package sec05;
class Animal{ //�θ�Ŭ����
	public Animal(String s) {  //�θ� class�� ������
		System.out.println("���� : "+ s);
	}
}
class Mammal extends Animal{ // �ڽ�Ŭ����
	public Mammal() {
		super("������");
		System.out.println("������ : ������");
		
	}
	public Mammal(String s) {
		super(s);
		System.out.println("������ : " + s);
	}
	
}
public class AnimalDemo {
	public static void main(String[] args ) {
		Mammal ape = new Mammal();
		Mammal lion = new Mammal("����");
	}
}
