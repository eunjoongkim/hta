public class Employee {
	int no;
	String name;
	String phone;
	String dept;
	String position;
	int salary;

	public int getAnnualSalary() {
		return salary * 12;
	}

	public void displayInfo() {
		System.out.println("####### ��� ���� #################");
		System.out.println("�����ȣ: " + no);
		System.out.println("��    ��: " + name);
		System.out.println("��ȭ��ȣ: " + phone);
		System.out.println("�ҼӺμ�: " + dept);
		System.out.println("��    ��: " + position);
		System.out.println("��    ��: " + salary);
		System.out.println("��    ��: " + getAnnualSalary());
		System.out.println("#####################################");
	}
}