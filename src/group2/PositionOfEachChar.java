package group2;

public class PositionOfEachChar {

	public static void main(String[] args) {
String s="aabcc";
//0123
//a2b1c1
for(int i=0;i<s.length();i++) {    //0<4
	//0<4 1 2 
	int count=1; // 

	for(int j=i+1;j<s.length();j++) {
		//j=3
		if(s.charAt(i)==s.charAt(j)) { //b==c
			count++;
			i++;
		}
		else {
			break;
		}
		System.out.println(s.charAt(i)+" "+count);
			
		}
	}
}
	}


