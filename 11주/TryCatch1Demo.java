package sec11;

public class TryCatch1Demo {

	public static void main(String[] args) {
		int[] array = {0,1,2};
		try {
			System.out.println("ù��° ���� => "+array[0] );
			System.out.println("������ ���� => "+array[3] );
			
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			System.out.println("���Ұ� �������� �ʽ��ϴ�." );
		}
		System.out.println("������!!!" );
	}

}
