public class Contact {
	// 속성 정의하기 
	
	// 순번
	int no;
	// 이름
	String name;
	// 연락처
	String phone;
	// 이메일
	String email;

	// 기능 정의하기
	// 전화하기 call()
	public void call() {
		System.out.println(phone + "으로 전화를 겁니다.");
	}

	// 문자보내기 sendMessage()
	public void sendMessage() {
		System.out.println(phone + "으로 메세지를 보냅니다.");
	}

	// 메일보내기 sendMail()
	public void sendMail() {
		System.out.println(email + "로 편지를 겁니다.");
	}
}