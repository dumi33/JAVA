package sec12;

import java.util.Arrays;
import java.util.List;

public final class ListDemo {

	public static void main(String[] args) {
		String[] ani = {"È£¶ûÀÌ","¹ì","ÄÚ³¢¸®"};
		List<String> list = Arrays.asList(ani);
		list.set(1, "°­¾ÆÁö");
		for(String s : list) {
			System.out.print(s + "\t");
		}
		System.out.print( "\n");
		list.sort((x,y) -> x.length() - y.length());
		String[] names = list.toArray(new String[list.size()]);
		for(int i=0;i<names.length;i++) {
			System.out.print(names[i]+"\t");
			
		}
		

	}

}
