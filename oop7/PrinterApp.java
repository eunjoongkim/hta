public class PrinterApp {
	public static void main(String[] args) {
	
		// ��� �μ�
		Printer p1 = new Printer();
		p1.print("�̹��� �ݿ��� ��Ÿ��ȸ...");
		
		// �÷� �μ�
		ColorPrinter p2 = new ColorPrinter();
		p2.print("�Ͽ��Ͽ� ���� ����");

		// ���� �μ�
		PhotoPrinter p3 = new PhotoPrinter();
		p3.print("�������");
	}
} 
