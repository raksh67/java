package assignment;

public class PracticeClass {

	public static void main(String[] args) {
//reverse a string without length method
		String s="Bangalore";
		char[] ch = s.toCharArray();
		int count=0;
		for (char c : ch) {
			count++;
			
		}
		for(int i=count-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
	}
}

