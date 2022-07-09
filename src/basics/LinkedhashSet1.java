package basics;

import java.util.LinkedHashSet;

public class LinkedhashSet1 {

	public static void main(String[] args) {
		int a[]= {5,2,5,7,0,1};
		LinkedHashSet<Integer> set= new LinkedHashSet<>();
		
		for(int i=0;i<a.length;i++)
		{
			
			set.add(a[i]);
			
		}
		
		
		for(Integer h: set)
		{
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==h)
			{
				System.out.println(h + "  =  "+i);
				break;
			}
				
			
			}
		}
	}
	
}

		
