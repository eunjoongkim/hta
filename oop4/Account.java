public class Account {
	// �̸�, ���¹�ȣ, ��й�ȣ, �ܾ�
	private String name;
	private String accountNumber;
	private int password;
	private int balance;

	// �Ӽ� ����
	public class Account(String, String, int, int);

	// �⺻ ������ ����
	public Account() {
	
	}

	// getter/setter ����
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