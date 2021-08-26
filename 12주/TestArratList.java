package sec12;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TestArratList {

	public static void main(String[] args) {
		
		ArrayList<Integer> scores = new ArrayList<>(); // 문자열 입력받기
		int best = 0;
		int score;
		char grade;
		
		System.out.print("점수를 입력하세요 : ");
		Scanner in = new Scanner(System.in);
		String instr = in.nextLine();
		StringTokenizer st = new StringTokenizer(instr, " ");
		
		while(st.hasMoreTokens()) {
			score = Integer.valueOf(st.nextToken());
			scores.add(score);
			if(best < score) best = score;
		}
		System.out.print("전체 학생은 "+scores.size() +"명이다.\n");
		System.out.print("\n학생들의 성적 : ");
		for(int i : scores)
			System.out.print(i + " ");
		System.out.print("\n최고 점수는 :" + best);
		
		
		System.out.print("\n");
		for(int i=0;i<scores.size();i++) {
			score = scores.get(i);
			if(score >= best-10) grade = 'A';
			else if(score >= best - 20) grade = 'B';
			else grade = 'C';
			System.out.println(i+1 + "번 학생의 성적은 " + score +" 점이며 등급은 "+ grade + "이다.");
		}
		
		
		
	}

}
