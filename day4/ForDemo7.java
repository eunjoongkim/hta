import java.util.Scanner;

public class ForDemo7 {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);

		for (;;) {
			System.out.println();
			System.out.println("[1]��ȸ  [2]���  [3]����  [0]����");
			System.out.print("�޴��� �����ϼ���:");

			int menuNo = sc.nextInt();
			
			if (menuNo == 1) {
				System.out.println("������ ��ȸ�մϴ�........");
			} else if (menuNo == 2) {
				System.out.println("������ ����մϴ�........");
			} else if (menuNo == 3) {
				System.out.println("������ �����մϴ�........");
			} else if (menuNo == 0) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}

		}

	}
}