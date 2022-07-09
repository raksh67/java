package strings_basic;

public class PalindromeNumber {

	public static void main(String[] args) {
int num=454;
int rem=0;
int sum=0;
int temp=num;
while(num>0) {
	rem=num%10;
	sum=(sum*10)+rem;
	num=num/10;
	
}
if(sum==temp) {
	System.out.println(sum+"is palindrome");
} 
else {
	System.out.println(sum+"is not a palindrome");
}

	}
}
