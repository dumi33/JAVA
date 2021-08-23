package sec11;

public class EntryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Entry<String,Integer> e1 = new Entry<>("김선달",22);
		Entry<String,String> e2 = new Entry<>("드럼","기타");
		
		System.out.println(e1.getKey() + "  "+ e1.getValue());
		System.out.println(e2.getKey() + "  "+ e2.getValue());
		
	}

}
