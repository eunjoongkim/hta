/*
	������¸� ǥ���ϴ� Ŭ����
		- �Ӽ�
			������
			���¹�ȣ
			��й�ȣ
			�ܾ�
		- ���
			��ݱ�� - �ݾװ� ��й�ȣ�� ���޹޾Ƽ� 
					   ��й�ȣ�� ������ �Է��� ��й�ȣ�� ��ġ�ϸ� 
					   �ݾ׸�ŭ�� �ܾ׿��� ���ҽ�Ű��
					   �ݾ׸�ŭ�� ���� ��ȯ�Ѵ�.
			�Աݱ�� - �ݾ��� ���޹޾Ƽ� �� �ݾ׸�ŭ �ܾ��� ������Ű��
					   ȭ�鿡 ���� �ܾ��� ǥ���Ѵ�.
			��ȸ��� - ȭ�鿡 ������, ���¹�ȣ, �ܾ��� ǥ���Ѵ�.
*/
public class Account {

	String owner;
	String accountNumber;
	int password;
	int balance;                                                                                                                                                                                                                                                                                                                        

	public int withdraw2(int amount, int pwd) {
		if (password != pwd) {
			System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			return 0;
		}

		if (balance < amount) {
			System.out.println("�ܾ��� �����մϴ�.");
			return 0;
		}

		if (balance - amount < 100000) {
			System.out.println("���� �������� �����մϴ�.");
			return 0;
		}

		balance -= amount;
		System.out.println("��� �� �ܾ�: " + balance);
		return amount;		
	}

	// ��ݱ��
	public int withdraw(int amount, int pwd) {
		int money = 0;

		if (password == pwd) {
			if (balance >= amount) {
				balance -= amount;
				money = amount;
				System.out.println("��� �� �ܾ�: " + balance);
			} else {
				System.out.println("�ܾ��� �����մϴ�.");
			}
		} else {
			System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
		}

		return money;
	}

	// �Աݱ��
	public void deposit(int amount) {
		balance += amount;
		System.out.println("�Ա� �� �ܾ�: " + balance);
	}

	public void info() {
		System.out.println("#### �������� ####");
		System.out.println("�� �� ��: " + owner);
		System.out.println("���¹�ȣ: " + accountNumber);
		System.out.println("��    ��: " + balance);

	}
}