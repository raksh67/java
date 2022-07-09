package basics;

public class withSplit {

	public static void main(String[] args) {
		String s ="Appium";
		String str[]=s.split("");
		for(int i=str.length-1;i>=0;i--) {
			System.out.println(str[i]);

		}
			
	}

}
