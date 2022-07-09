package group1;

import java.util.LinkedHashSet;

public class OccuranceOfEachCharacter {

	public static void main(String[] args) {
		String s="india";  // i/p i=2 n=1 d=1 a=1
		LinkedHashSet <Character>set=new LinkedHashSet<>();
		System.out.println(s.length());

		for(int i=0;i<s.length();i++) { //0<5 t 1<5 t 2<5 t 3<5 t 4<5 t 5<5f
			set.add(s.charAt(i));    //i //n //d //a
		}

		for (Character ch : set)  { // i n d a
			int count=0; //0+1  +1            global bcoz for every iteration count should star from 0
			for(int i=0;i<s.length();i++) //0<5t
			{ // 0<5t 
				if(ch==s.charAt(i))        // i==i 
				{   //i==i n==i d==i i==i a==i
					count++;
				}
			}
			System.out.println(ch+" "+count);
		}
	}

}
