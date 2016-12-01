public class ForDemo4 {

	public static void main(String[] args) {
		
		for (int a=1; a<=9; a++) {
			for (int b=2; b<=9; b++) {
				System.out.print(b + " * " + a + " = " + (b*a) + "\t");
			}
			System.out.println();
		}
	}
}