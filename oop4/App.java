public class App {
	public static void main(String[] args) {
	
		// static ������ ��ü ��������
		// Ŭ�󽺸�, ���������� ��� ����
		System.out.println(A.y);
			
		// �������� y�� �� �Ҵ��ϱ�
		// AŬ�󽺸� ����ؼ� ���� ��� ��ü�� �������� y���� �����Ѵ�.
		A.y = 100;

		// ������� x�� ������ ��ü���� ���������� �����ȴ�.
		// ������ ��ü�� ��ü���� �ٸ� x���� ���� �� �ִ�.
		A a1 = new A();
		//a1.x = 10;

		System.out.println(a1.x);
		//System.out.println(a1.y); // y���� ��µǱ�� ������, y���� ��������� ������ �� �ִ�.
		System.out.println(A.y);

		A a2 = new A();
		//a2.x = 20;

		System.out.println(a2.x);
		System.out.println(a2.y);

		A a3 = new A();
		//a3.x = 30;

		System.out.println(a3.x);
		System.out.println(a3.y);
	}

}