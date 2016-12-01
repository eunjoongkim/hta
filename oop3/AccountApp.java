public class AccountApp {
	public static void main(String[] args) {
		Account a = new Account("홍길동", "111-22-3333", 1234, 1000000);
		
		// System.out.println("예금주: " +  a.owner); // owner에 접근할 수 없음
		System.out.println("예금주: " + a.getOwner() );
		a.info();
	}
}