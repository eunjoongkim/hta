import java.util.Scanner;
public class Quizz3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int balance = 0;

		for (;;) {
			System.out.println("-------------------------------------");
			System.out.println("1.�Ա� 2.��� 3.��ȸ 0.����");
			System.out.println("-------------------------------------");
			
			System.out.print("��ȣ�� �����ϼ���:");
			int selectedNo = sc.nextInt();

			if (selectedNo == 1) {
				System.out.print("�Ա��� �ݾ��� �Է��ϼ���:");
				int amount = sc.nextInt();
				balance += amount;

				System.out.println("�Ա��� �Ϸ�Ǿ����ϴ�.");
			} else if (selectedNo == 2) {
				System.out.print("����� �ݾ��� �Է��ϼ���:");
				int amount = sc.nextInt();
				
				if (balance >= amount) {
					balance -= amount;
					System.out.println("����� �Ϸ�Ǿ����ϴ�.");
				} else {
					System.out.println("�ܾ��� �����մϴ�.");
				}
				
			} else if (selectedNo == 3) {
				System.out.println("���� �ܾ��� ["+balance+"]�� �Դϴ�.");
			} else if (selectedNo == 0) {
				break;
			}
		}

		System.out.println("���α׷��� �����մϴ�.");
	}
}