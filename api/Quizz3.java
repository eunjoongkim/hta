public class Quizz3 {
	
	public static void main(String[] args) {
		String text = "A mutable sequence of characters.";
		text = text.toLowerCase();

		int[] arr = new int[26];

		for (int i=0; i<text.length(); i++) {
			int c = text.charAt(i) - 97;
			if (c >=0) {
				arr[c]++;
			}
		}
		for (int i=0; i<arr.length; i++) {
			System.out.println( (char)(i+97) + " : " + arr[i]);

		}
		
	}
}