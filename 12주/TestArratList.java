package sec12;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TestArratList {

	public static void main(String[] args) {
		
		ArrayList<Integer> scores = new ArrayList<>(); // ���ڿ� �Է¹ޱ�
		int best = 0;
		int score;
		char grade;
		
		System.out.print("������ �Է��ϼ��� : ");
		Scanner in = new Scanner(System.in);
		String instr = in.nextLine();
		StringTokenizer st = new StringTokenizer(instr, " ");
		
		while(st.hasMoreTokens()) {
			score = Integer.valueOf(st.nextToken());
			scores.add(score);
			if(best < score) best = score;
		}
		System.out.print("��ü �л��� "+scores.size() +"���̴�.\n");
		System.out.print("\n�л����� ���� : ");
		for(int i : scores)
			System.out.print(i + " ");
		System.out.print("\n�ְ� ������ :" + best);
		
		
		System.out.print("\n");
		for(int i=0;i<scores.size();i++) {
			score = scores.get(i);
			if(score >= best-10) grade = 'A';
			else if(score >= best - 20) grade = 'B';
			else grade = 'C';
			System.out.println(i+1 + "�� �л��� ������ " + score +" ���̸� ����� "+ grade + "�̴�.");
		}
		
		
		
	}

}
