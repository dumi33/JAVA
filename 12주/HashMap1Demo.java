package sec12;

import java.util.HashMap;
import java.util.Map;

public class HashMap1Demo {

	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<>();
		
		m.put("���", 5);
		m.put("�ٳ���", 3);
		m.put("����", 10);
		m.put("����", 1);
		
		System.out.print("������ ������ " + m.size() + "\n");
		
		for(String key : m.keySet()) {
			System.out.println(key + "��" + m.get(key)+"�� �ֽ��ϴ�.");
		}
		
		m.remove("�ٳ���");
		System.out.print("������ ������ " + m.size() + "\n");
		m.clear();
		System.out.print("������ ������ " + m.size() + "\n");
		

	}

}
