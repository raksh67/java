package grp;

import java.util.HashSet;

public class CountOfVowelWithoutDuplicate {

	public static void main(String[] args) {
String s="india";
int count=0;
HashSet<Character>set=new HashSet<Character>();
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
