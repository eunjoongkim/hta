public class WrapperDemo1 {
	
	public static void main(String[] args) {
		
		// ���� 23�� �����ϰ� �ִ� Integer ��ü�� �����ϴ� a
		Integer a = new Integer(23);		// <-- Boxing

		// Integer ��ü�� ������ �������� ��ȯ�ϴ� �޼ҵ� :  int intValue()
		int x = a.intValue();				// <-- unBoxing
		double y = a.doubleValue();

		
		// ���� 23�� �����ϰ� �ִ� b
		int b = 23;

	}
}