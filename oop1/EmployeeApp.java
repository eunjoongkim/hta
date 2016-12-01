public class EmployeeApp {
	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.no = 123;
		e.name = "È«±æµ¿";
		e.phone = "010-1234-5678";
		e.dept = "±â¼úºÎ";
		e.position = "´ë¸®";
		e.salary = 2000000;

		int annualSalary = e.getAnnualSalary();
		System.out.println("¿¬ºÀ: " + annualSalary);

		e.displayInfo();
	}
}