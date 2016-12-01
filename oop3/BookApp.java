public class BookApp {
	public static void main(String[] args) {
		Book[] bookCart = new Book[5];

		bookCart[0] = new Book(1, "이것이 자바다", "홍길동", "한빛미디어", 35000, "2015-10-10");
		bookCart[1] = new Book(2, "자바 인 액션", "김유신", "한빛미디어", 33000, "2016-05-10");
		bookCart[2] = new Book(3, "스프링 프레임워크", "강감찬", "한빛미디어", 27000, "2013-01-10");
		bookCart[3] = new Book(5, "스프링 시큐리티", "이순신", "한빛미디어", 26000, "2014-04-10");
		bookCart[4] = new Book(7, "자바 웹 프로그래밍", "권률", "한빛미디어", 30000, "2015-11-23");

		// 카트에 저장된 모든 책들의 제목을 표시하기
		for (Book book : bookCart) {
			System.out.println(book.getTitle());
		}


		// 카트에 저장된 책들의 가격 총합을 표시하기
		int totalPrice = 0;
		for (Book book : bookCart) {
			totalPrice += book.getPrice();
		}
		System.out.println("합계: " + totalPrice);

		// 카트에 저장된 책중에서 가장 비싼 가격의 책 제목과 가격을 표시하기
		int ePrice = 0;
		String eTitle = null;
		for (Book book : bookCart) {
			if (book.getPrice() > ePrice) {
				ePrice = book.getPrice();
				eTitle = book.getTitle();
			}
		}
		System.out.println("제목: " + eTitle + ", 가격: " + ePrice);

	}
}