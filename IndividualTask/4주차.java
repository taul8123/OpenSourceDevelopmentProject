/*****************************

* ���α׷���:�����������α׷�

* �ۼ��� : 2019038011 ������

* �ۼ��� : 2020.09.25.��

*���α׷� ���� : Ű����� ���� 5���� �й�, �̸�, ����, ����, ����,  C��� �Է¹޾�  ����, ���, ������ ����ϴ� ���α׷�

*********************************/
import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		int[] studentNumbers = new int[5];
		String[] names = new String[5];
		double[][] scores = new double[5][4];
		
		
		Scanner scanner = new Scanner(System.in);

		for(int i=0;i<scores.length;i++) {
			System.out.println(i+1 + "��° �л��� �й�, �̸�, ����, ����, ����,  C�� ��ĭ���� �и��Ͽ� �Է��ϼ���");
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
			
			System.out.print("�̸� : " + names[i] + "\t�й� : " + studentNumbers[i] + "\n");
			System.out.print(names[i] + " �� ���� : " + sum + "\n");
			System.out.print(names[i] + " �� ��� : " + avg + "\n");
			System.out.print(names[i] + " �� ���� : " + grade + "\n");
		}
				
		scanner.close();
	}
}
