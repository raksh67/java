package assignment;

public class FibonaciNumberTill25 {

	public static void main(String[] args) {
		int a=0;//a=0 //a=1
		int b=1;//b=1 //b=1
		System.out.print(a+" "+b);//0 1 
		for(int i=0;i<7;i++) {  //0<5t 1<5t 
			int c=a+b;  //0+1=1
			a=b; //a=1
			b=c; //b=1
			System.out.print(" "+c); //1

	}

}
}
