package grp;


public class FirstLetterUppercase {

	public static void main(String[] args) {
String s="welcome to india";
String[] str = s.split(" ");
//o/p Welcome To India

for(int i=0;i<str.length;i++) {
	
	String word = str[i];         
	word=word.substring(0,1).toUpperCase()+word.substring(1);
	System.out.println(word+" ");
	
	}

}
}