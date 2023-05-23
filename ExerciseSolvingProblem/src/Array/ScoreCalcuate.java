package Array;

import java.util.Scanner;

public class ScoreCalcuate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		int studentNum = 0;
		 int[] scores = new int[100];
		 Scanner scanner = new Scanner(System.in);
		 int maxNum = 0;
		 int sum = 0;
		 double avg = 0.0;
		 
		 while(run) {
			 System.out.println("------------------------------------------");
			 System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			 System.out.println("------------------------------------------");
			 System.out.print("선택> ");
			 
			 int selectNo = Integer.parseInt(scanner.nextLine());
			 
			 if(selectNo == 1) {
				 System.out.print("학생수> ");
				 studentNum = Integer.parseInt(scanner.nextLine());
			 } else if(selectNo == 2) {
				 for(int i = 0; i < studentNum; i++) {
					 System.out.print("scores[" + i + "]> ");
					 scores[i] = Integer.parseInt(scanner.nextLine());
				 }
			 } else if(selectNo == 3) {
				 for(int i = 0; i < studentNum; i++) {
					 System.out.println("scores[" + i + "]> " + scores[i]);
				 }
			 } else if(selectNo == 4) {
				 maxNum = scores[0];
				 sum = scores[0];
				 for(int i = 1; i < studentNum; i++) {
					 if(maxNum < scores[i]) {
						 maxNum = scores[i];
					 }
					 sum += scores[i];
				 }
				 avg = (double)sum / studentNum;
				 
				 System.out.println("최고 점수: " + maxNum);
				 System.out.println("평균 점수: " + avg);
			 } else if(selectNo == 5) {
				 run = false;
			 } else {
				 System.out.println("1~5사이의 숫자를 선택해주세요.");
			 }
		 }
		 System.out.println("프로그램 종료");

	}

}
