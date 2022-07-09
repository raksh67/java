package basics;

public class FirstMinWithoutBubble {

	public static void main(String[] args) {
int[]a= {5,8,3,6,2};
int fmin=a[0]; //5
for(int i=0;i<a.length;i++) {  //0<4t 1<4t 2<4t 3<5t 4<5t
	if(a[i]<fmin) {   //5<5f 8<5f 3<5t 6<5 2<5t
		fmin=a[i];  //2
	}
}
System.out.println(fmin); 
	}

}
