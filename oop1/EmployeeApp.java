public class EmployeeApp {
	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.no = 123;
		e.name = "ȫ�浿";
		e.phone = "010-1234-5678";
		e.dept = "�����";
		e.position = "�븮";
		e.salary = 2000000;

		int annualSalary = e.getAnnualSalary();
		System.out.println("����: " + annualSalary);

		e.displayInfo();
	}
}