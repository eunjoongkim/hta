public class Student {
	private int no;
	private int year;
	private String name;
	private String phone;

	public Student() {}
	public Student(int no, int grade, String name, String phone) {
		this.no = no;
		this.year = year;
		this.name = name;
		this.phone = phone;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int Year) {
		this.year = year;
	} 

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String Phone) {
		this.phone = phone;
	}

}