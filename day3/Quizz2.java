import java.util.*;

public class Quizz2 {
	public static void main(String[] args) {
		// 3�ڸ��� ������ �Է¹޾Ƽ�
		// 100���� �ڸ� ����
		// 10�� �ڸ� ����
		// 1�� �ڸ� ���ڸ� ���� ����Ͻÿ�
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���:");
		int number = sc.nextInt();

		int h = number/100;
		int d = (number - 100*h)/10;
		
		System.out.println("���� �ڸ���: " + h);
		System.out.println("���� �ڸ���: " + d);


	}
}