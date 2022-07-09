package strings_basic;

public class ReverseWithoutLength {

	public static void main(String[] args) {
String s ="program";
//conver to char array
char[] ch = s.toCharArray();
int count=0;
for (char c : ch) {
	count++;
}
for(int i=count-1;i>=0;i--) {
	System.out.println(s.charAt(i));
}
	}

}
