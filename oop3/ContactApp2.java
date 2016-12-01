import java.util.Scanner;

public class ContactApp2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ContactMgr mgr = new ContactMgr();

		for (;;) {
			System.out.println("1:등록   2:조회   0:종료");

			System.out.print("메뉴 번호을 입력하세요:");
			int menuNo = sc.nextInt();

			if (menuNo == 1) {
				// 배열에 등록하기
				// mgr의 addContact(Contact contact) 메소드에 등록할 Contact객체 전달
				System.out.print("번호를 입력하세요:");
				int no =sc.nextInt();
				System.out.print("이름을 입력하세요:");
				String name =sc.nextInt();
				System.out.print("전화번호를 입력하세요:");
				String phone =sc.nextInt();
				System.out.print("이메일을 입력하세요:");
				String email =sc.nextInt();

				//Contact객체 생성하고, 값을 담기
				Contact contact = new Contact();
				contact.setNo(no);
				contact.setName(name);
				contact.setPhone(phone);
				contact.setEmail(email);

				mgr.addContact(contact);

			} else if (menuNo == 2) {
				mgr.displayContact();
				// 배열에 저장된 모든 연락처 정보 표시하기 
				// mgr의 displayContact()를 실행시키기

			} else if (menuNo == 3) {
				break;
			}
		}
	}
}