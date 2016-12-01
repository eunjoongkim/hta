public class EmployeeApp2 {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.no = 123;
		e1.name = "홍길동";
		e1.phone = "010-1234-5678";
		e1.dept = "기술부";
		e1.position = "대리";
		e1.salary = 2000000;

		Employee e2 = new Employee();
		e2.no = 222;
		e2.name = "김유신";
		e2.phone = "010-1111-1111";
		e2.dept = "영업팀";
		e2.position = "차장";
		e2.salary = 5000000;
	}
}