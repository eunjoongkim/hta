public class Student {
	int no;// �й�
	String name;
	int kor;
	int eng;
	int math;

	// �⺻ ������
	public Student() {}

	// ��� �ʵ带 �ʱ�ȭ�ϴ� ������ 
	// -> ��ȣ,�̸�,����,����,���������� ���޹޾Ƽ�  �ʱ�ȭ�ϴ� ������
	public Student(int ��ȣ, String �̸�, int ����, int ����, int ����) {
		no = ��ȣ;
		name = �̸�;
		kor = ����;
		eng = ����;
		math = ����;
	}

	// ������ ��ȯ�ϴ� ���	-> �޼ҵ�� total
	public int total() {
		int value = kor + eng + math;
		return value;
	}
	
	// ����� ��ȯ�ϴ� ��� -> �޼ҵ�� avg
	public double avg() {
		double value =  total()/3.0;
		return value;
	}

	// �л� ������ ����ϴ� ���(������ ��յ� ����) -> �޼ҵ�� info
	public void info() {
		System.out.println("�й�:" + no);
		System.out.println("�̸�:" + name);
		System.out.println("����:" + kor);
		System.out.println("����:" + eng);
		System.out.println("����:" + math);
		System.out.println("����:" + total());
		System.out.println("���:" + avg());
		System.out.println("---------------------------------------");
	}
}