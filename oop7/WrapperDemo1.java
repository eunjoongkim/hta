public class WrapperDemo1 {
	
	public static void main(String[] args) {
		
		// 정수 23을 저장하고 있는 Integer 객체를 참조하는 a
		Integer a = new Integer(23);		// <-- Boxing

		// Integer 객체에 보관된 정수값을 반환하는 메소드 :  int intValue()
		int x = a.intValue();				// <-- unBoxing
		double y = a.doubleValue();

		
		// 정수 23을 저장하고 있는 b
		int b = 23;

	}
}