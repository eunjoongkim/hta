import java.util.Scanner;

public class Quizz4 {
	public static void main(String[] args) {
		// ������ ���ڸ� ���ڸ� �Է¹޾Ƽ� �� ���ڿ� �ش��ϴ� �ѱ۷� ��ȯ�ϱ�
		// ��) 23 -> �̽ʻ�
		String[] names = {"��", "��", "��", "��", "��", "��", "ĥ", "��", "��"};
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		int sip = number/10;
		int il = number-(sip*10);

		String hangul = names[sip-1] + "��" + names[il-1];
		System.out.println(hangul);
	}
}