package sec11;

public class CheckedDemo {

	public static void main(String[] args) {
		try {
			Thread.sleep(100);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
