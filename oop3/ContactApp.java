import java.util.Scanner;

public class ContactApp {
	public static void main(String[] args) {
		// ����ó ������ �Է¹޴� ȭ�� ���� Ŭ����
		// ������� �Է��� �о���� Scanner ��ü �����ϱ�
		Scanner sc = new Scanner(System.in);

		Contact[] contacts = new Contact[100];
		int currentPosition = 0;

		for (;;) {
			System.out.println("1:���   2:��ȸ   0:����");

			System.out.print("�޴� ��ȣ�� �Է��ϼ���:");
			int menuNo = sc.nextInt();

			if (menuNo == 1) {
				System.out.print("��ȣ�� �Է��ϼ���:");
				int no =sc.nextInt();
				System.out.print("�̸��� �Է��ϼ���:");
				String name =sc.nextInt();
				System.out.print("��ȭ��ȣ�� �Է��ϼ���:");
				String phone =sc.nextInt();
				System.out.print("�̸����� �Է��ϼ���:");
				String email =sc.nextInt();

				//Contact��ü �����ϰ�, ���� ���
				Contact contact = new Contact();
				contact.setNo(no);
				contact.setName(name);
				contact.setPhone(phone);
				contact.setEmail(email);
				// �迭�� �����ϱ�
				contacts[currentPosition] = contact;
				currentPosition++;



			} else if (menuNo == 2) {
				for (int i=0; i<currentPosition; i++) {
					Contact c = contacts[i];

					System.out.printf("%d %s %s %s\n", c.getNo(), c.getName(), c.getPhone(), c.getEmail());
				}

				// �迭�� ����� ��� ����ó ���� ǥ���ϱ� 
				// <-- enhanced for�� ������� ���� ����
				// �迭���� 0���� currentPosition�� ����Ű�� ��ġ �ձ��� �ݺ��ؼ� ���

			} else if (menuNo == 3) {
				break;
			}
		}


	
	} 
}