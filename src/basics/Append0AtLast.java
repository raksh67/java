package basics;

public class Append0AtLast {

	

		public static void main(String[] args) {
	   int a[]= {2,0,5,0,0,6};
	   int b[] =new int[a.length];
	   int m=0;
	   int n= a.length-1;
	   
	   for(int i=0;i<a.length;i++)
	   {
		   if(a[i]==0)
		   {
			   b[n]=a[i];
			   
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