package basics;

public class AdditionArray {

	public static void main(String[] args) {
		int a[] = { 4, 2, 7, 9, 3 };
		int b[] = { 3, 2, 4, 3, 2, 4 };
		int count=a.length;
		
		if(a.length<b.length)
		{
			count=b.length;
		}
		

		for (int i = 0; i <count; i++) {
			try {
				System.out.println(a[i] + b[i]);
			} catch (Exception e) {
				if (a.length > b.length) {
					System.out.println(a[i]);
				} else {
					System.out.println(b[i]);
				}

			}

		}
	}
}