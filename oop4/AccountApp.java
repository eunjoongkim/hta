import java.util.Scanner;

public class AccountApp {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		Account acc = new Account();

		for (;;) {
			System.out.println("1. ��� 2. ��ȸ 3. ������� 4. �Ա� 5. ��� 6. ����\n");

			System.out.print("�޴� ����>");
			int menuNo = sc.nextInt();

			if (menuNo == 1) {
				System.out.print("����� �����ϼ̽��ϴ�:");
				System.out.print("�̸��� �Է��ϼ���");
				String name =sc.next();
				acc.setName(name);
				
				System.out.print("��й�ȣ�� �Է��ϼ���:");
				int password = sc.nextInt();
				acc.setPassword(password);
				
				System.out.print("���� �Աݾ��� �Է��ϼ���:");
				int money = sc.nextInt();
					if (money < 0) {
					System.out.println("�Աݾ��� ���̳ʽ��Դϴ�. ���Է��ϼ���");
					} else {
						acc.setBalance(money);
					}

				acc.setAccountNumber("1111-1111");
				System.out.println("���ο� ���¹�ȣ :" + acc.getAccountNumber());

							
			} else if (menuNo == 2) {
			
			} else if (menuNo == 3) {
			
			} else if (menuNo == 4) {
			
			} else if (menuNo == 5) {
			
			} else if (menuNo == 6) {
			
			}
			
			
		}
	}
}