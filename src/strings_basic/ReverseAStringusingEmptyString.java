package strings_basic;

public class ReverseAStringusingEmptyString {
//using second or third variable
	public static void main(String[] args) {
String s="program";
String rev=" ";
for(int i=s.length()-1;i>=0;i--) {
	rev=rev+s.charAt(i);
}
System.out.println(rev);
	}

}
