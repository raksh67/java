package grp;

public class prime {

	public static void main(String[] args) {
		int n=7;
		int i=2;
		while(n>=i)
		{	
		if(n%i==0) {
			break;	
		}
		else {
			i++;
		}
	}
	if(n==i) {
System.out.println("Prime number");
	}
	else {
		System.out.println("not a primeNumber");
	}

}
}