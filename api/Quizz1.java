import java.util.Scanner;

public class Quizz1 {
	
	public static void main(String[] args) {
		// 이메일을 입력받아서 이메일에 포함된 아이디부분만 출력하기
		// 예) abcd@ab.com --> abcd
		Scanner sc = new Scanner(System.in);

		System.out.print("이메일을 입력하세요:");
		String email = sc.next();

		
		int index = email.indexOf("@");
		
		String id = email.substring(0, index);
		System.out.println("아이디:" + id);
		
		/*
		String[] arr = email.split("@");
		System.out.println("아이디:" + arr[0]);
		*/

	}
}