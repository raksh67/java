package assignment;

public class StringHowAreYou {

	public static void main(String[] args) {
String s="How are you";
//o/p you how are
int key=1;
for(int k=0;k<key;k++) {
	int temp=a[0];
	for(int i=1;i<a.length;i++) {
		a[i-1]=a[i];
	}
	a[a.length-1]=temp;
}
for(int i=0;i<a.length;i++) {
	System.out.print(a[i]+",");
}
	}

}
