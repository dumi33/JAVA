package sec08;

class Vehicle{
	String name = "탈 것";
	
	void whoami() {
		System.out.println("나는 탈 것이다.");
	}
	
	static void move() { // 동적바인딩 안시켜오
		System.out.println("이동하다.");
	}
}

class Car extends Vehicle{
	String name = "자동차";
	
	void whoami() {
		System.out.println("나는 자동차다");
	}
	
	static void move() {
		System.out.println("달리다.");
	}
}


public class OverTypeDemo {

	public static void main(String[] args) {
		Vehicle v = new Car();
		System.out.println(v.name); // 부모 클래스의 name
		v.whoami(); // 동적바인딩 -> 자식 클래스의 메서드가 실행
		v.move(); // 정적바인딩 -> static이 붙었으므로 부모클래스의 메서드가 실행

	}

}

