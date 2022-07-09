package grp;

public class PrimeNumber {

	public static void main(String[] args) {
int a[]= {3,4,5,6,7,8,9,10,11};
for(int j=0;j<a.length;j++) {
	int n=a[j];
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
System.out.println(a[j]);
}


}
	}

}
