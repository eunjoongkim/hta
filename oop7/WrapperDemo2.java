public class WrapperDemo2 {

	public static void main(String[] args) {
		
		// Integer�� ���� �޼ҵ�

		// ���ڿ��� int������ ��ȯ�ϴ� �޼ҵ�: int parseInt(String text)
		int num1 = Integer.parseInt("123");

		int num2 = Integer.parseInt("11", 2);
		System.out.println("num2: " + num2);

		int num3 = Integer.parseInt("ab1", 16);
		System.out.println("num3: " + num3);

		// ���� 12�� 2���� ���ڿ��� ��ȯ�ؼ� ��ȯ�Ѵ�.
		String str1 = Integer.toBinaryString(12);
		System.out.println("str1: " + str1);
 
		//���� 15345�� 16���� ���ڿ��� ��ȯ�ؼ� ��ȯ�Ѵ�.
		String str2 = Integer.toHexString(15345);
		System.out.println("srt2:" + str2);
	}
}