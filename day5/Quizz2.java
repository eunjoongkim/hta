import java.util.Scanner;

public class Quizz2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// ���ڸ� �Է¹޾Ƽ� �� ���ڵ��� �հ� ����� ����ؼ� ����ϱ�
		// 1. �л� ���� �Է¹ޱ�
		// 2. �л� �� ��ŭ�� ũ�⸦ ���� �迭�� �����
		// 3. �л� �� ��ŭ �ݺ��ϸ鼭 ������ �Է¹ް� �迭�� ���
		// 4. �迭�� ����� ������ �հ�� ����� ����ؼ� ����ϱ�

		System.out.print("���� ������ �� �л����� ���� �Է��ϼ���:");
		int size = sc.nextInt();	// �л��� == �迭�� ũ��
		// �л� �� ��ŭ�� ������ ���� �迭�� ����
		int[] scores = new int[size];	// �迭 �����

		// �迭�� ���������� �����ϱ�
		for (int i=0; i<size; i++) {
			System.out.print("���������� �Է��ϼ���:");
			int score = sc.nextInt();

			scores[i] = score;
		}

		// ������ ��� ����ϱ�
		int total = 0;
		int avg = 0;
		for (int score : scores) {
			total += score;
		}
		avg = total/size;
		
		System.out.printf("����:%d  ���:%d\n", total, avg);



	}
}