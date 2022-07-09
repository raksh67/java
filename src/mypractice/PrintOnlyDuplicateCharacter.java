package mypractice;

import java.util.LinkedHashSet;

public class PrintOnlyDuplicateCharacter {

	public static void main(String[] args) {
		String s="indiaa";
		LinkedHashSet<Character>set=new LinkedHashSet<>();
		for(int i=0;i<s.length();i++) //0<6t 1<6t 2<6t 3<6t 4<6t 5<6t 6<6f
		{
			set.add(s.charAt(i)); //i //n //d //a 
		}

		for (Character ch : set)  // i n d a 
		{
			int count=0;
			for(int i=0;i<s.length();i++)  //0<6t 1<6t 2<6t 3<6t 4<6t 5<6t 6<6f
			{
				if(ch==s.charAt(i))  //i==i n=i d=i a=i //i==n n==n d==n a==n //i==d n==d d==d a==d // i==i n==i d==i a==i// i==a n==a d==a a==a //i==a n==a d==a a==a
				{
					count++; //i=1+1 n=1 d=1 a=1+1
				}
			}
			if(count>1)
			{
				System.out.println(ch+" "+count); //i a
			}
		}
	}

}
