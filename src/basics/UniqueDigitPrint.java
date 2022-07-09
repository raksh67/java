package basics;

import java.util.HashSet;

public class UniqueDigitPrint {

	public static void main(String[] args) {
		int a[]= {2,4,6,3,2};
		HashSet<Integer> hs= new HashSet<>();
		
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
		
		
		if(count==1)
		{
			System.out.println(h + "  =  "+count);
		}
		}
		
		}

	}
