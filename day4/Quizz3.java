import java.util.Scanner;
public class Quizz3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int balance = 0;

		for (;;) {
			System.out.println("-------------------------------------");
			System.out.println("1.입금 2.출금 3.조회 0.종료");
			System.out.println("-------------------------------------");
			
			System.out.print("번호를 선택하세요:");
			int selectedNo = sc.nextInt();

			if (selectedNo == 1) {
				System.out.print("입금할 금액을 입력하세요:");
				int amount = sc.nextInt();
				balance += amount;

				System.out.println("입금이 완료되었습니다.");
			} else if (selectedNo == 2) {
				System.out.print("출금할 금액을 입력하세요:");
				int amount = sc.nextInt();
				
				if (balance >= amount) {
					balance -= amount;
					System.out.println("출금이 완료되었습니다.");
				} else {
					System.out.println("잔액이 부족합니다.");
				}
				
			} else if (selectedNo == 3) {
				System.out.println("현재 잔액은 ["+balance+"]원 입니다.");
			} else if (selectedNo == 0) {
				break;
			}
		}

		System.out.println("프로그램을 종료합니다.");
	}
}