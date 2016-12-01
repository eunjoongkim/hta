import java.util.Scanner;

public class ContactApp2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Contact contact = new Contact();

		for(;;) {
			System.out.println("1.이름등록/수정 2. 전화번호등록 3.주소등록/수정 4.조회 0:종료");
			
			System.out.print("메뉴를 선택하세요:");
			int no = sc.nextInt();
			if (no ==1) {
				// 이름을 입력받아서 Contact에 저장합니다.
				contact = sc.getName();

				}
			} else if (no == 2) {
				// 전화번호 정보를 입력받아서 Contact에 저장합니다.
				// Tel객체 생성 -> 값 입력받아서 채우고 -> Contact의 addTel(Tel tel)에 Tel 객체 전달해서 배열에 담기
				
			} else if (no == 3) {
				// 주소 정보를 입력받아서 Contact에 저장합니다.
				// Address 객체 생성 -> 값 입력받아서 채우고 -> Contact의 setter 이용해서 저장
			} else if (no == 4) {
				// 연락처 정보를 화면에 표시합니다.
			} else if (no == 0) {
				// 프로그램을 종료합니다.
			}
		}
	
	}
}

/*
Database를 대상으로 하는 작업
	Create		- 새 데이터 저장
	Retrieve	- 데이터 조회
	Update		- 데이터 수정
	Delete		- 데이터 삭제

*/