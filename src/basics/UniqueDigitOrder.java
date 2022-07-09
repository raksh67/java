package basics;

import java.util.LinkedHashSet;

public class UniqueDigitOrder {

	public static void main(String[] args) {
		int a[]= {2,9,6,2,2,8,4};
		LinkedHashSet<Integer> hs= new LinkedHashSet<>();
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
			hs.add(a[i]);
			System.out.println(hs);
		}
		
		
		for(Integer h: hs)
		{
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==h)
			{
				count++;
				//System.out.println(count);
			
			}
		}
		
		
		if(count>=1)
		{
			System.out.println(h + "  =  "+count);
		}
		}
		
		}

	}

