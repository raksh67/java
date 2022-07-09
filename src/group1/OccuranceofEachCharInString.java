package group1;

import java.util.LinkedHashSet;

public class OccuranceofEachCharInString {

	public static void main(String[] args) {
		String s="india";
		//step1:remove duplicate char of given string
		LinkedHashSet <Character> set=new LinkedHashSet<>();

		for(int i=0;i<s.length();i++) {  //0<5t 1<5t 2<5t 3<5
			set.add(s.charAt(i)); //it will add 0=i,1=n all /it will check based on hashcode

		}
		//step2:compare each char of set with all the char of given string
		for (Character ch : set) { //inda  //this line reading ele from coollectn   //Characte is wrapper class

			int count=0;

			for(int i=0;i<s.length();i++) { //read the ele from string

				if(ch==s.charAt(i));{
					//step3:if it is matching ,increment count
					count++;
				}
			}
			//step4:print both ch and count
			System.out.println(ch+" "+count);

		}
	}

}
