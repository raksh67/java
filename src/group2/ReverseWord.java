package group2;

public class ReverseWord {

	public static void main(String[] args) {
String s="welcome to tyss bangalore";
String[] str = s.split(" ");
for(int i=str.length-1;i>=0;i--) {
	System.out.print(str[i]+" ");
}
	}

}
