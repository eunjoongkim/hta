import java.util.Scanner;

public class Quizz1 {
	
	public static void main(String[] args) {
		// �̸����� �Է¹޾Ƽ� �̸��Ͽ� ���Ե� ���̵�κи� ����ϱ�
		// ��) abcd@ab.com --> abcd
		Scanner sc = new Scanner(System.in);

		System.out.print("�̸����� �Է��ϼ���:");
		String email = sc.next();

		
		int index = email.indexOf("@");
		
		String id = email.substring(0, index);
		System.out.println("���̵�:" + id);
		
		/*
		String[] arr = email.split("@");
		System.out.println("���̵�:" + arr[0]);
		*/

	}
}