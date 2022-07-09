package strings;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class ToLowercase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		  String a= sc.nextLine();
		  String s = a.toLowerCase();
		  
		  LinkedHashSet<Character> set = new LinkedHashSet<>();

			for (int i = 0; i < s.length(); i++) {

				set.add(s.charAt(i));

			}

			for (Character h : set) {
				int count = 0;
				
				for (int i = 0; i < s.length(); i++) {
					if (s.charAt(i) == h) 
					{
						System.out.println(h + "  =  " + i);
						break;
					}

				}

			}
		}

		}
