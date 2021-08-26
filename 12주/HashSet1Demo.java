package sec12;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSet1Demo {

	public static void main(String[] args) {
		String[] f = {"사과", "바나나" ,"포도"};
		Set<String> h1 = new HashSet<>();
		
		
		List<String> list = Arrays.asList(f);
		h1.addAll(list);
		
		System.out.print(h1);
	}

}
