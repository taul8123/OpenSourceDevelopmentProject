/*****************************

* ���α׷���:�����������α׷�

* �ۼ��� : 2019038011 ������

* �ۼ��� : 2020.09.18.��

*���α׷� ���� : Ű����� ���� �й�, �̸�, ����, ����, ����,  C��� �Է¹޾�  ����, ���, ������ ����ϴ� ���α׷�

*********************************/
import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		System.out.println("�й�, �̸�, ����, ����, ����,  C�� ��ĭ���� �и��Ͽ� �Է��ϼ���");
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
		System.out.print("�̸� : " + name + "\t�й� : " + studentNumber + "\n");
		System.out.print(name + "�� ���� : " + sum + "\n");
		System.out.print(name + "�� ��� : " + avg + "\n");
		System.out.print(name + "�� ���� : " + grade + "\n");
		
		scanner.close();
	}
}
