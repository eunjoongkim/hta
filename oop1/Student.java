public class Student {
	int no;// 학번
	String name;
	int kor;
	int eng;
	int math;

	// 기본 생성자
	public Student() {}

	// 모든 필드를 초기화하는 생성자 
	// -> 번호,이름,국어,영어,수학점수를 전달받아서  초기화하는 생성자
	public Student(int 번호, String 이름, int 국어, int 영어, int 수학) {
		no = 번호;
		name = 이름;
		kor = 국어;
		eng = 영어;
		math = 수학;
	}

	// 총점을 반환하는 기능	-> 메소드명 total
	public int total() {
		int value = kor + eng + math;
		return value;
	}
	
	// 평균을 반환하는 기능 -> 메소드명 avg
	public double avg() {
		double value =  total()/3.0;
		return value;
	}

	// 학생 정보를 출력하는 기능(총점과 평균도 포함) -> 메소드명 info
	public void info() {
		System.out.println("학번:" + no);
		System.out.println("이름:" + name);
		System.out.println("국어:" + kor);
		System.out.println("영어:" + eng);
		System.out.println("수학:" + math);
		System.out.println("총점:" + total());
		System.out.println("평균:" + avg());
		System.out.println("---------------------------------------");
	}
}