package mypractice;

public class SwapFirstAndLastWord {

	public static void main(String[] args) {
		String s ="welcome to tyss bangalore";
		String[] str = s.split(" ");
		String temp = str[0];
		str[0]=str[str.length-1];
		str[str.length-1]=temp;
		
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i]);
		}
	}

}
