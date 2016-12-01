public class PhoneApp2 {
	public static void main(String[] args) {
	
		SmartPhone   p1 = new SmartPhone();
		FeaturePhone p2 = new FeaturePhone();
		// p1참조변수는 SmartPhone을 참조하고 있기 때문에
		// Smartphone객체의 필드와 속성에 접근가능하고, 
		// Phone객체의 필드와 속성에 접근가능하다.
		
		p1.ip = "192.168.01";							// SmartPhone에 정의된 필드
		p1.web("www.naver.com");						// SmartPhone에 정의된 메소드
		p1.telNumber = "010-123-4567";					// Phone에 정의된 필드
		p1.call("010-1111-1111");						// Phone에 정의된 메소드

		// SmartPhone과 FeaturePhone을 Phone타입의 참조변수에 담기
		// 상속관계에 있는 클라스일 경우 부모타입의 참조변수에 자식클라스 타입의 객체를 저장할 수 있다.
		Phone	     p3 = new SmartPhone();
		Phone        p4 = new FeaturePhone();
		
		//p3.web("www.daum.net"); //사용할 수 없다.
		p3.telNumber = "010-1234-5678";
		p3.call("010-2222-2222");

		//System.out.println(p2);
		//System.out.println(p3);
	}
}