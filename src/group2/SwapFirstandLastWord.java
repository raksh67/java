package group2;

public class SwapFirstandLastWord {

	public static void main(String[] args) {
String s="welcome to tyss bangalore"; //0 1 2 3
String[] str = s.split(" ");
String temp=str[0];      // temp=welcome
str[0]=str[str.length-1];  // str[0]=bangalore 
str[str.length-1]=temp;  //welcome

for(int i=0;i<str.length;i++) //0<4 1<4 2<4 3<4
{
	System.out.println(str[i]+" "); //bangalore t0 tyss welcome
}

	}

}
