public class Quizz2 {
	
	public static void main(String[] args) {
		
		String text = "<ab@ab.com>,<cd@cd.com>,<abcd@abcd.com>";

		String[] arr = text.split(",");
		 
		 for (String a : arr) {
			int index1 = a.indexOf("<"); 
			int index2 = a.indexOf(">");
			System.out.println(a.substring(index1+1, index2));
		 }

		for (String a : arr) {
			a = a.substring(1, a.length()-1);
			System.out.println(a);
		}

		for (String a : arr) {
			a = a.replace("<", "").replace(">","");
			System.out.println(a); 
		}

	}
}