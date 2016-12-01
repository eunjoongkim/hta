import java.util.*;

public class Quizz2 {
	public static void main(String[] args) {
		// 3자리의 정수를 입력받아서
		// 100백의 자리 숫자
		// 10의 자리 숫자
		// 1의 자리 숫자를 각각 출력하시요
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요:");
		int number = sc.nextInt();

		int h = number/100;
		int d = (number - 100*h)/10;
		
		System.out.println("백의 자리수: " + h);
		System.out.println("십의 자리수: " + d);


	}
}