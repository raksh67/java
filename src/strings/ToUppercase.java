package strings;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class ToUppercase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String s = a.toUpperCase();

		LinkedHashSet<Character> set = new LinkedHashSet<>();

		for (int i = 0; i < s.length(); i++) {

			set.add(s.charAt(i));

		}

		for (Character h : set) {

			for (int i = 0; i < s.length(); i++)
			{
				if (h==s.charAt(i))
				{
					System.out.println(h + "  =  " + i);
					break;
				}

			}

		}

	}
}