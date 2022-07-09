package assignment;

import java.util.LinkedHashSet;

public class SepereteVowels {

	public static void main(String[] args) {
String s="india";
LinkedHashSet<Character>set=new LinkedHashSet<>();
for(int i=0;i<s.length();i++) {
	set.add(s.charAt(i));
}
for (Character ch : set) {
	

	
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
		System.out.println(ch);


	}
	
}
	}

}
