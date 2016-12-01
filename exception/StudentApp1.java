import java.io.*;

public class StudentApp1 {



	public static void main(String[] args) throws Exception {
	
		BufferedReader reader = new BufferedReader(new FileReader("score.txt"));
		
		String text = reader.readLine();

		String[] arr = text.split(",");

		int kor = Integer.parseInt(arr[2]);
		int eng = Integer.parseInt(arr[3]);
		int math = Integer.parseInt(arr[4]);


		Student s = new Student();
		s.setName(arr[0]);
		s.setYear(arr[1]);
		s.setKorean(kor);
		s.setEng(eng);
		s.setMath(math);
		
		String name = s.getName();
		String year = s.getYear();
		kor = s.getKorean();
		eng = s.getEng();
		math = s.getMath();

		System.out.printf("이름 : %s | 학년 : %s | 국어 : %d | 영어 : %d | 수학 : %d", name, year, kor ,eng, math);

			}
}