package basics;

public class Append0AtFirst {

	public static void main(String[] args) {

		int a[] = {1,1,0,0}; // output: 0 0 1 1

		int b[] = new int[a.length];
		int m = 0;
		int n = a.length - 1;

		for (int i = 0; i < a.length; i++) {
			if (a[i] == 1) {
				b[n] = a[i];
				n--;

			} else {
				b[m] = a[i];
				m++;

			}
		}

		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}

	}
}
