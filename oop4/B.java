public class B {
	int x;
	static int y;

	public void m1() {
		System.out.println(x);
		System.out.println(y);
	}

	// static 메소드에서는 non-static 변수를 사용할 수 없다.
	// this를 사용할 수 없다.
	public static void m2() {
		//System.out.println(x); //컴파일 오류
		System.out.println(y);
	}

	public void m3() {
		m1();
		m2();
	
	}
	
	// static 메소드에서는 non-static 메소드를 사용할 수 없다.
	public static void m4() {
		//m1(); // 컴파일 오류
		m2();
	}
}