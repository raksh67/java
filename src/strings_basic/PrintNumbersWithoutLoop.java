package strings_basic;

public class PrintNumbersWithoutLoop {
	//without for loop
	
public static void num(int n) {
	if(n<=10) {
	System.out.println(n);
	num(n+1);  //n++ cant--1++  (++n can)
}
}
	public static void main(String[] args) {
		PrintNumbersWithoutLoop pn=new PrintNumbersWithoutLoop();
		pn.num(1);
	}

}








//static bcoz again n again
//static directly call but still as per industry object created//conventiom