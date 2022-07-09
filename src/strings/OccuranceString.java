package strings;

import java.util.LinkedHashSet;

public class OccuranceString {

	public static void main(String[] args) {
		String s = "welcome";
		LinkedHashSet<Character> set = new LinkedHashSet<>();

		for (int i = 0; i < s.length(); i++) {

			set.add(s.charAt(i));

		}

		for (Character h : set) {
			int count = 0;
			
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == h) 
				{
					//System.out.println(h + "  =  " + i);
					//break;
					count++;
				}
				
			}
			System.out.println(h+" "+count);

		}
	}

}
