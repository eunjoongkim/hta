public class ScoreApp1 {
	public static void main(String[] args) {
		Score s = new Score();

		s.name = "ȫ�浿";
		s.kor = 49;
		s.eng = 69;
		s.math = 38;

		int result1 = s.total();
		double result2 = s.average();

		System.out.println("����: " + result1);
		System.out.println("���: " + result2);
	}
}