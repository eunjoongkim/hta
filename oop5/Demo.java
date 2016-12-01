package kr.co.jhta;

//import kr.co.l2.*;
//import kr.co.l2.sub.*;

import kr.co.l2.Emplyoee;
import kr.co.l2.sub.Family;

/* 패키지
클라스를 체계적으로 분류하기 위해 사용한다,.
패키지선언은 클라스의 맨 처음에 위치해야 한다.
		package 상위 패키지.하위패키지.하위패키지;
클라스의 전체 이름은 "패키지명 + 클라스이름" 이다.
같은 패키지내의 클라스는 import문 없이 사용할 수 있다.
다른 패키지에 포함된 클라스를 사용할 때는 improt문을 사용해서 가져올 클라스의 전체 이름을 선언해야 한다.
*/


public class Demo {
	public static void main(String[] args) {
		System.out.println("패키지 데모 애플리케이션");

		Person p = new Person();
		p.setName("홍길동");
		System.out.println(p);
		System.out.println(p.getName());

		Employee e = new Employee();
		System.out.println(e);

		Family f = new Family();
		System.out.println(f);
	}


}