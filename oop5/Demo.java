package kr.co.jhta;

//import kr.co.l2.*;
//import kr.co.l2.sub.*;

import kr.co.l2.Emplyoee;
import kr.co.l2.sub.Family;

/* ��Ű��
Ŭ�󽺸� ü�������� �з��ϱ� ���� ����Ѵ�,.
��Ű�������� Ŭ���� �� ó���� ��ġ�ؾ� �Ѵ�.
		package ���� ��Ű��.������Ű��.������Ű��;
Ŭ���� ��ü �̸��� "��Ű���� + Ŭ���̸�" �̴�.
���� ��Ű������ Ŭ�󽺴� import�� ���� ����� �� �ִ�.
�ٸ� ��Ű���� ���Ե� Ŭ�󽺸� ����� ���� improt���� ����ؼ� ������ Ŭ���� ��ü �̸��� �����ؾ� �Ѵ�.
*/


public class Demo {
	public static void main(String[] args) {
		System.out.println("��Ű�� ���� ���ø����̼�");

		Person p = new Person();
		p.setName("ȫ�浿");
		System.out.println(p);
		System.out.println(p.getName());

		Employee e = new Employee();
		System.out.println(e);

		Family f = new Family();
		System.out.println(f);
	}


}