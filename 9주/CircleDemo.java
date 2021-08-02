package sec09;




class Circle implements Comparable{
	
	double radius;
	Circle (double radius){
		this.radius = radius;
	}
	@Override
	public int compareTo(Object o) { // �ֻ��� class //up ĳ����
		
		Circle c = (Circle) o; // downĳ����
		if(this.radius > c.radius) return 1;
		else if(this.radius == c.radius) return 0;
		else return -1;
		
	}
	
}
public class CircleDemo {

	public static void main(String[] args) {
		Circle c1 = new Circle(4.0);
		Circle c2 = new Circle(5.0);
		
		if(c1.compareTo(c2)>0) System.out.println("ù��° ���� �� Ů�ϴ�.");
		if(c1.compareTo(c2)==0) System.out.println("�� ���� ũ�Ⱑ �����ϴ�.");
		if(c1.compareTo(c2)<0) System.out.println("�ι�° ���� �� Ů�ϴ�.");

	}

}
