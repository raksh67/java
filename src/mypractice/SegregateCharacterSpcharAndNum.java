package mypractice;

public class SegregateCharacterSpcharAndNum {

	public static void main(String[] args) {
		String s="a1b3$f%5";
		String al="";
		String nu="";
		String sp="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>=65 && s.charAt(i)<=90||s.charAt(i)>=97 && s.charAt(i)<=122)
			{
				al=al+s.charAt(i);
			}

			else if(s.charAt(i)>=48 && s.charAt(i)<=57)
			{
				nu=nu+s.charAt(i);	
			}
			else
			{
				sp=sp+s.charAt(i);
		}
	}
	System.out.println(al);
	System.out.println(nu);
	System.out.println(sp);
	
}

}