package sec12;

import java.util.HashMap;
import java.util.Map;

public class HashMap1Demo {

	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<>();
		
		m.put("사과", 5);
		m.put("바나나", 3);
		m.put("포도", 10);
		m.put("딸기", 1);
		
		System.out.print("과일의 종류는 " + m.size() + "\n");
		
		for(String key : m.keySet()) {
			System.out.println(key + "가" + m.get(key)+"개 있습니다.");
		}
		
		m.remove("바나나");
		System.out.print("과일의 종류는 " + m.size() + "\n");
		m.clear();
		System.out.print("과일의 종류는 " + m.size() + "\n");
		

	}

}
