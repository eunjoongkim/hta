public class MemberApp {
	public static void main(String[] args) {
		
		// 회원정보를 담기위한 Member 객체를 생성하고
		// setter를 사용해서 이름, 아이디, 비번, 나이 등의 데이터를 객체에 저장하기

		Member member = new Member();

		member.setName("홍길동");
		member.setId("hong");
		member.setPassword("1234");
		member.setAge(30);
	
		// 생성된 Member 객체에 저장된 값을 getter 함수를 사용해서 화면에 출력하기

		System.out.println("이    름:" + member.getName());
		System.out.println("아 이 디:" + member.getId());
		System.out.println("비밀번호:" + member.getPassword());
		System.out.println("나    이:" + member.getAge());

	}
}