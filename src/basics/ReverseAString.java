package basics;

public class ReverseAString {

	public static void main(String[] args) {
		String s ="Appium is a mobile testing tool";
		int length=s.length();
		String rev=" ";
		for(int i=length-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println("Reverse of "+s+" is "+rev);
			
	}

}
