package sec08;

public class InstanceofDemo {

	public static void main(String[] args) {
		Person p = new Person();
		Student s = new Student();
		System.out.println(p instanceof Person);
		System.out.println(s instanceof Student);
		System.out.println(s instanceof Person);
		downcast(s);

	}


static void downcast(Person p) {
	if(p instanceof Student) {
		Student s = (Student)p;
		System.out.println("�ٿ� ĳ���� �Ϸ�");
	}
}

}

