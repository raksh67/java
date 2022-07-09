package strings;

import java.util.LinkedHashSet;

public class Test1 {

	public static void main(String[] args) {
		String s="tester";
		LinkedHashSet<Character> set=new LinkedHashSet<>();
		
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
			
		}
		
		
		
	}
	
}
