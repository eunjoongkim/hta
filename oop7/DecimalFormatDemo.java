import java.text.DecimalFormat;

public class DecimalFormatDemo {
	public static void main(String[] args) {
		
		int number = 123456789;

		String pattern = "#,###";
		DecimalFormat df = new DecimalFormat();
		String text = df.format(number);

		System.out.println(text);

		double rate = 111112.345;

		// String pattern2 = "#,###.##";	// �Ҽ��� �� �ڸ����� ǥ��, �Ҽ��� �� �ڸ����� �ݿø��ȴ�.
		// String pattern2 = "#,###.####";	// ���ڸ��� ä���� �ʴ´�.
		String pattern2 = "0,000.0000";
		DecimalFormat df2 = new DecimalFormat(pattern2);
		String text2 = df2.format(rate);

		System.out.println(text2);
	}
}