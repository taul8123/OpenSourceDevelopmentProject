/*****************************

* 프로그램명:성적산출프로그램

* 작성자 : 2019038011 윤석현

* 작성일 : 2020.09.18.금

*프로그램 설명 : 키보드로 부터 학번, 이름, 국어, 영어, 수학,  C언어 입력받아  총점, 평균, 학점을 출력하는 프로그램

*********************************/
import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		System.out.println("학번, 이름, 국어, 영어, 수학,  C언어를 빈칸으로 분리하여 입력하세요");
		Scanner scanner = new Scanner(System.in);
		int studentNumber = scanner.nextInt();
		String name = scanner.next();
		double korean = scanner.nextDouble();
		double english = scanner.nextDouble();
		double math = scanner.nextDouble();
		double cLanguage = scanner.nextDouble();
		double sum = korean + english + math + cLanguage;
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
		System.out.print("이름 : " + name + "\t학번 : " + studentNumber + "\n");
		System.out.print(name + "의 총점 : " + sum + "\n");
		System.out.print(name + "의 평균 : " + avg + "\n");
		System.out.print(name + "의 학점 : " + grade + "\n");
		
		scanner.close();
	}
}
