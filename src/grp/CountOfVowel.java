package grp;


public class CountOfVowel {

	public static void main(String[] args) {
String str[]= {"naveen","joy","praveen","hello"};
for(int i=0;i<str.length;i++) {
	String s=str[i];
	s=s.toLowerCase();
	int count=0;
	for(int j=0;j<s.length();j++) {
		if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
			count++;
		}
	}
	System.out.println(s+" "+count);
		}

}
	}

