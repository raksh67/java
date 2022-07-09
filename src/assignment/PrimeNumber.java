package assignment;

public class PrimeNumber {

	public static void main(String[] args) {
int num=9;
int count=0;
int i=2;
while(i<num) {
	if(num%i==0) {
		count++;
		break;
	}
	i++;
}
if(count==0) {
	System.out.println("prime");
}
else {
	System.out.println("not a prime");
}
	}

}
