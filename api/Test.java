public class Test {
	public static void main(String[] args) {
		int a = 10;
		int b = a++;
		System.out.println(a + "," + b);
	
		
		int c = 0;
		System.out.println(c); //0
		System.out.println(c++); // 0
		System.out.println(c); // 1

		a = 1;
		b = 2;
		c = a + b;
		System.out.println(c);
	}
}