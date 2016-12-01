public class MemberServiceApp {
	
	public static void main(String[] args) {
	
		/*
			이름:	  "홍길동"
			아이디:   "hong"
			비밀번호: "1234"
			나이:	  30
			정보를 가진 Member 객체를 담고 있는 MemberService객체 생성하기
		*/

		Member member = new Member();

		member.setName("홍길동");
		member.setId("hong");
		member.setPassword("1234");
		member.setAge(30);

		MemberService service = new MemberService(member);

		// MemberService에 정의된 login기능 사용해보기
		
		//boolean authenticated = service.login("hong", "1234");
		//System.out.println(authenticated);

		service.login("hong", "1234");
		System.out.println(service.isAuth());

		service.logout();
		System.out.println(service.isAuth());
	
	}
} 