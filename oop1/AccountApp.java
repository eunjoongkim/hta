public class AccountApp {
	public static void main(String[] args) {
		Account acc = new Account();
		acc.owner = "ȫ�浿";
		acc.accountNumber = "11-222-3333";
		acc.password = 1234;
		acc.balance = 10000000;

		int money = acc.withdraw2(500000, 1234);
		System.out.println("��ݾ�: " + money);

		acc.deposit(300000);

	}
}