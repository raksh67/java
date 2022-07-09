package grp;

public class Substring2 {

	public static void main(String[] args) {
String s="welcome to india";
String s1=""+s.charAt(0);
System.out.println(s1.toUpperCase());
for(int i=0;i<s.length();i++) {
	if(s.charAt(i)==' ') {
		char ch = (char)(s.charAt(i+1)-32);
		System.out.println(" "+ch);
		i++;
	}
	else {
		System.out.println(s.charAt(i));
	}
}
	}

}
 