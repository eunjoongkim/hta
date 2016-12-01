public class Account {
	// 이름, 계좌번호, 비밀번호, 잔액
	private String name;
	private String accountNumber;
	private int password;
	private int balance;

	// 속성 정의
	public class Account(String, String, int, int);

	// 기본 생성자 정의
	public Account() {
	
	}

	// getter/setter 정의
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance)	{
		this.balance = balance;
	}
}