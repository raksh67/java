package mypractice;

import java.util.LinkedHashSet;

public class RemoveDuplicateCharacter {

	public static void main(String[] args) {
String s="hello";
LinkedHashSet <Character>set=new LinkedHashSet<>();
for(int i=0;i<s.length();i++)
{
	set.add(s.charAt(i));
}

for (Character ch : set) {
	System.out.println(ch);
	
}
	}

}
