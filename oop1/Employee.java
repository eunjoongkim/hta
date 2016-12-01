public class Employee {
	int no;
	String name;
	String phone;
	String dept;
	String position;
	int salary;

	public int getAnnualSalary() {
		return salary * 12;
	}

	public void displayInfo() {
		System.out.println("####### 사원 정보 #################");
		System.out.println("사원번호: " + no);
		System.out.println("이    름: " + name);
		System.out.println("전화번호: " + phone);
		System.out.println("소속부서: " + dept);
		System.out.println("직    위: " + position);
		System.out.println("급    여: " + salary);
		System.out.println("연    봉: " + getAnnualSalary());
		System.out.println("#####################################");
	}
}