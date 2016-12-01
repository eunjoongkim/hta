public class GetSetApp {
	public static void main(String[] args) {
		GetSet a = new GetSet();
		a.getGet1();
		System.out.println(a.getGet1());
		a.setGet1(10);
		System.out.println(a.getGet1());
		System.out.println(a.getSet(102));
	}
}