import java.util.Scanner;
import java.util.Random;

public class Quizz4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		boolean island = false;	
		int count = 3;
		int distance = 0;

		for (;;) {
			System.out.println("---------------------------------");
			System.out.println("1.주사위 굴리기      0.종료");
			System.out.println("---------------------------------");

			System.out.print("선택하세요:");
			int no = sc.nextInt();

			if (no == 1) {
				int first = random.nextInt(6)+1;
				int second = random.nextInt(6)+1;
				System.out.printf("(%d, %d)\n", first, second);

				if (!island) {					// 무인도에 갇혀있지 않는 경우
					if (first+second == 7) {		// 두 주사위의 합이 7인 경우
						island = true;					// 무인도행
						count = 3;						// 탈출까지 3회 남음
						System.out.println("@@@ 무인도로 가기 @@@");
					} else {						// 두 주사위의 합이 7이 아닌 경우
						distance += first + second;		// 이동거리 증가
						System.out.println("이동거리: " + distance + "칸");

						if (distance > 100) {			// 이동거리가 100을 넘으면 목적지도착
							System.out.println("### 목적지 도착 ###");
							break;
						}
					}
				} else {						// 무인도에 갇혀있는 경우
					if (first == second) {			// 주사위 숫자가 같은 경우
						island = false;					// 무인도 탈출
						System.out.println("### 무인도 탈출 ###");
					} else {						// 주사위 숫자가 다른 경우
						count--;						// 남은 횟수를 1 감소시킨다.
						
						if (count == 0) {				// 남은 횟수가 0이면
							island = false;				// 무인도 탈출
							System.out.println("### 3회를 쉬어서 무인도 탈출 ###");
						} else {
							System.out.println("탈출까지 ["+count+"] 회 남았습니다.");
						}
					}
				}
				

			} else if (no == 0) {
				break;
			} 
		}

		System.out.println("프로그램을 종료합니다.");
	}
}