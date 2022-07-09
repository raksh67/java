package basics;

import java.util.LinkedHashSet;

public class PrintExactPosition {

	public static void main(String[] args) {
		String s = "tester";
		LinkedHashSet<Character> set = new LinkedHashSet<>();

		for (int i = 0; i < s.length(); i++) {

			set.add(s.charAt(i));

		}

		for (Character h : set) {

			for (int i = 0; i < s.length(); i++) {
				int count = 0;
				if (s.charAt(i) == h) {
					count++;
					System.out.println(h + "  =  " + i);
					break;
				}

				if (count >= 1) {
					System.out.println(h + "  =  " + count);
				}

			}

		}
	}

}
