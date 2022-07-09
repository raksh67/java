package assignment;

import java.util.LinkedHashSet;

public class Pr {

	public static void main(String[] args) {
		String s="india";
		LinkedHashSet <Character> set=new LinkedHashSet<>();
		for(int i=0;i<s.length();i++) {
			set.add(s.charAt(i));
			System.out.println(set);
		}
	}

}
