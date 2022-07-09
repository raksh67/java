package grp;

public class Sum {

	public static void main(String[] args) {
String s="a11b22c33";
//o/p=66
int num=0;//
int sum=0;
for(int i=0;i<s.length();i++) {
	if(s.charAt(i)>='0' && s.charAt(i)<='9')
	{
		int n=s.charAt(i)-48; //1   //integer no seperately //s.charAt[1]-48==1 Asci value 49 49-48==1
		num=num*10+n;			//0*10+1=1	
	}
	else
	{
		sum=sum+num;
		num=0;
	}
}
System.out.println(sum+num);
	}

}
