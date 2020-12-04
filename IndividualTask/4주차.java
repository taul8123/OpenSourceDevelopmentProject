/*****************************

* 프로그램명:성적관리프로그램

* 작성자 : 2019038011 윤석현

* 작성일 : 2020.09.25.금

*프로그램 설명 : 키보드로 부터 5명의 학번, 이름, 국어, 영어, 수학,  C언어 입력받아  총점, 평균, 학점을 출력하는 프로그램

*********************************/
import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		int[] studentNumbers = new int[5];
		String[] names = new String[5];
		double[][] scores = new double[5][4];
		
		
		Scanner scanner = new Scanner(System.in);

		for(int i=0;i<scores.length;i++) {
			System.out.println(i+1 + "번째 학생의 학번, 이름, 국어, 영어, 수학,  C언어를 빈칸으로 분리하여 입력하세요");
			studentNumbers[i] = scanner.nextInt();
			names[i] = scanner.next();
			double sum=0;
			for(int j=0;j<scores[i].length;j++) {
				scores[i][j] = scanner.nextDouble();
				sum += scores[i][j];
			}
			double avg = sum/3.0;
			String grade;
			
			if (avg >= 90)
				grade = "A";
			else if (avg >= 80)
				grade = "B";
			else if (avg >= 70)
				grade = "C";
			else if (avg >= 60)
				grade = "D";
			else
				grade = "F";
			
			System.out.print("이름 : " + names[i] + "\t학번 : " + studentNumbers[i] + "\n");
			System.out.print(names[i] + " 의 총점 : " + sum + "\n");
			System.out.print(names[i] + " 의 평균 : " + avg + "\n");
			System.out.print(names[i] + " 의 학점 : " + grade + "\n");
		}
				
		scanner.close();
	}
}
