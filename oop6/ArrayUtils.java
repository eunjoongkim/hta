public class ArrayUtils {
	int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	
	// 배열 이동시키기
	// arr1배열에서 지정된 번호를 찾아서 맨 뒤로 보내기 
	public int[] move(int no) {
		// 원본의 복사본을 만들자
		int[] result = new int[arr1.length];
		for (int i=no; i<arr1.length; i++) {
			result[i] = arr1[i];
		}
		
		// 제일 처음 덮혀쓰여질 값을 미리 보관해놓자.
		int number = arr1[no-1];
		
		// 배열의 값을 한 칸씩 앞으로 이동시키자
		for (int i=no; i<arr1.length; i++) {
			result[i-1] = arr1[i];
		}

		// 맨 마지막 칸에 아까 보관해두었던 값을 담자
		result[result.length-1] = number;

		System.out.println(java.util.Arrays.toString(result));
		
		return result;

	}

	/*
		// 지정된 숫자를 미리 보관해놓자.
		int temp = arr1[no-1];

		int position = 0;
		for (int i=no; i<arr1.length; i++) {
			result[i-1] = arr1[i];
		}

		System.out.println(java.util.Arrays.toString(result));

		return result;
	}
	
	public static void main(String[] args) {
		ArrayUtils s = new ArrayUtils();
		s.move(3);
	*/

}


	public int[] shift(int begin, int length) {
	
	
	}

	// 배열 복사하기
	// arr2배열을 지정된 위치부터 끝까지 복사한 배열을 반환하기
	public int[] copy(int begin) {
	
	}

	// 배열 잘라내기
	// arr2배열을 지정된 위치부터 지정된 위치까지 복사한 배열을 반환하기
	public int[] copy(int begin, int end) {
	
	}
}