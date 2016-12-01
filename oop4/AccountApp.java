import java.util.Scanner;

public class AccountApp {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		Account acc = new Account();

		for (;;) {
			System.out.println("1. 등록 2. 조회 3. 비번변경 4. 입금 5. 출금 6. 종료\n");

			System.out.print("메뉴 선택>");
			int menuNo = sc.nextInt();

			if (menuNo == 1) {
				System.out.print("등록을 선택하셨습니다:");
				System.out.print("이름을 입력하세요");
				String name =sc.next();
				acc.setName(name);
				
				System.out.print("비밀번호를 입력하세요:");
				int password = sc.nextInt();
				acc.setPassword(password);
				
				System.out.print("최초 입금액을 입력하세요:");
				int money = sc.nextInt();
					if (money < 0) {
					System.out.println("입금액이 마이너스입니다. 재입력하세요");
					} else {
						acc.setBalance(money);
					}

				acc.setAccountNumber("1111-1111");
				System.out.println("새로운 계좌번호 :" + acc.getAccountNumber());

							
			} else if (menuNo == 2) {
			
			} else if (menuNo == 3) {
			
			} else if (menuNo == 4) {
			
			} else if (menuNo == 5) {
			
			} else if (menuNo == 6) {
			
			}
			
			
		}
	}
}