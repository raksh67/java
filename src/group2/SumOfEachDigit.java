package group2;

public class SumOfEachDigit {

	public static void main(String[] args) {
String s="a1b2c31";
 int sum = 0;
for(int i=0;i<s.length();i++)  //0<7t 1<7t 2<7 3<7 4<7 5<7 6<7
{
	if(s.charAt(i)>='0' && s.charAt(i)<='9') //1 //2 //3 //1
	{
		 int n = s.charAt(i)-48; //49-48 50-48 //51-48 49-48 
		sum=sum+n; //0+1 1+2=3 //3+3=6 6+1=7
	}
}
System.out.println(sum);
	}

}
