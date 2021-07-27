package sec05;

public class TriangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Triangle t1 = new Triangle(10.0,5.0);
			System.out.println(t1.findArea());
	}

}
class Triangle {
	double base;
	double height;
	
	public Triangle() {}
	
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	public double getbase() {
		return this.base;
	}
	public double getheight() {
		return this.height;
	}
	public double findArea() {
		return (this.base * this.height)/2;
	}
}
