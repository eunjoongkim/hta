public class MemberServiceApp {
	
	public static void main(String[] args) {
	
		/*
			�̸�:	  "ȫ�浿"
			���̵�:   "hong"
			��й�ȣ: "1234"
			����:	  30
			������ ���� Member ��ü�� ��� �ִ� MemberService��ü �����ϱ�
		*/

		Member member = new Member();

		member.setName("ȫ�浿");
		member.setId("hong");
		member.setPassword("1234");
		member.setAge(30);

		MemberService service = new MemberService(member);

		// MemberService�� ���ǵ� login��� ����غ���
		
		//boolean authenticated = service.login("hong", "1234");
		//System.out.println(authenticated);

		service.login("hong", "1234");
		System.out.println(service.isAuth());

		service.logout();
		System.out.println(service.isAuth());
	
	}
} 