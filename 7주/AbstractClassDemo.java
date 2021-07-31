package sec08;

public class AbstractClassDemo {

	public static void main(String[] args) {
		Circle c = new Circle(3); // 반지름이 3인 원
		
		c.draw(); 
		System.out.printf("원의 넓이는 %.1f\n",c.findArea());
		
		
		Rectangle r = new Rectangle();
		r.draw();
	}

}
