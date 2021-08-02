package sec09;




class Circle implements Comparable{
	
	double radius;
	Circle (double radius){
		this.radius = radius;
	}
	@Override
	public int compareTo(Object o) { // 최상위 class //up 캐스팅
		
		Circle c = (Circle) o; // down캐스팅
		if(this.radius > c.radius) return 1;
		else if(this.radius == c.radius) return 0;
		else return -1;
		
	}
	
}
public class CircleDemo {

	public static void main(String[] args) {
		Circle c1 = new Circle(4.0);
		Circle c2 = new Circle(5.0);
		
		if(c1.compareTo(c2)>0) System.out.println("첫번째 원이 더 큽니다.");
		if(c1.compareTo(c2)==0) System.out.println("두 원의 크기가 같습니다.");
		if(c1.compareTo(c2)<0) System.out.println("두번째 원이 더 큽니다.");

	}

}
