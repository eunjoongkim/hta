public class MemberApp {
	public static void main(String[] args) {
		
		// ȸ�������� ������� Member ��ü�� �����ϰ�
		// setter�� ����ؼ� �̸�, ���̵�, ���, ���� ���� �����͸� ��ü�� �����ϱ�

		Member member = new Member();

		member.setName("ȫ�浿");
		member.setId("hong");
		member.setPassword("1234");
		member.setAge(30);
	
		// ������ Member ��ü�� ����� ���� getter �Լ��� ����ؼ� ȭ�鿡 ����ϱ�

		System.out.println("��    ��:" + member.getName());
		System.out.println("�� �� ��:" + member.getId());
		System.out.println("��й�ȣ:" + member.getPassword());
		System.out.println("��    ��:" + member.getAge());

	}
}