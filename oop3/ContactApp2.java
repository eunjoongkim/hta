import java.util.Scanner;

public class ContactApp2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ContactMgr mgr = new ContactMgr();

		for (;;) {
			System.out.println("1:���   2:��ȸ   0:����");

			System.out.print("�޴� ��ȣ�� �Է��ϼ���:");
			int menuNo = sc.nextInt();

			if (menuNo == 1) {
				// �迭�� ����ϱ�
				// mgr�� addContact(Contact contact) �޼ҵ忡 ����� Contact��ü ����
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

				mgr.addContact(contact);

			} else if (menuNo == 2) {
				mgr.displayContact();
				// �迭�� ����� ��� ����ó ���� ǥ���ϱ� 
				// mgr�� displayContact()�� �����Ű��

			} else if (menuNo == 3) {
				break;
			}
		}
	}
}