public class StudentApp {
	public static void main(String[] args) {
		StudentSErvice service = new StudentService();

		Student student1 = service.getStudentByNo(25);
		System.out.println(student1);

		Student student 2 = new Student(28, 4, "ÀÌ¼ø½Å", "010-1234-5678");
		service.change(student2);
	}
}