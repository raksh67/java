package mypractice;

import java.util.LinkedHashSet;

public class OccuranceOfEachCharacter {

	public static void main(String[] args) {
		String s="aabc";
		LinkedHashSet<Character>set=new LinkedHashSet<>();
		for(int i=0;i<s.length();i++) //0<5t 1<5t 2<5t 3<5t 4<5t 5<5f
		{  
			set.add(s.charAt(i));   //i //n //d //a
		}

		for (Character ch : set)  // i n d a
		{
			int count=0; 
			for(int i=0;i<s.length();i++) //0<5t 1<5  4<5t 5<5f
			{
				if(ch==s.charAt(i)) //i==i n=i d=i a=i //i==n n==n d==n a==n //i==d n==d d==d a==d // i==i n==i d==i a==i// i==a n==a d==a a==a 
				{
					count++; //i=1+1 n=1 d=1 a=1+1
				}
			}
			System.out.println(ch+" "+count);
		}
	}

}
