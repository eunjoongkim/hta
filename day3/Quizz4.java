import java.util.Scanner;

public class Quizz4 {
	public static void main(String[] args) {
		// 임의의 두자리 숫자를 입력받아서 그 숫자에 해당하는 한글로 변환하기
		// 예) 23 -> 이십삼
		String[] names = {"일", "이", "삼", "사", "오", "육", "칠", "팔", "구"};
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		int sip = number/10;
		int il = number-(sip*10);

		String hangul = names[sip-1] + "십" + names[il-1];
		System.out.println(hangul);
	}
}