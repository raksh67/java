package group2;

public class SegregateSpecialcharCharandNum {

	public static void main(String[] args) {
		String s="a1$b2c%";
		String al="";
		String num="";
		String sp="";
		for(int i=0;i<s.length();i++) //0<7t 1<7t 2<7t 3<7t 4<7 5<7t 6<7t
		{
			if(s.charAt(i)>=65 && s.charAt(i)<=90 ||s.charAt(i)>=97 && s.charAt(i)<=122) //a //b //c
			{
				al=al+s.charAt(i);   //""+a  +b +c
			}
			else if(s.charAt(i)>=48 && s.charAt(i)<=57) //1 //2
			{
				num=num+s.charAt(i);  //""+1  +2
			}
			else  //$ //%
			{
				sp=sp+s.charAt(i);  //""+$  +%
			}
		}
		System.out.println(al);
		System.out.println(num);
		System.out.println(sp);
	}

}
