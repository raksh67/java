package group2;

import java.util.LinkedHashSet;

public class PrintOnlyUniqueWords {

	public static void main(String[] args) {
String s="welcome to india welcome to tyss";
String[] str = s.split(" ");
LinkedHashSet <String> set=new LinkedHashSet<>();


for(int i=0;i<str.length;i++) {
	set.add(str[i]);
}
for (String word : set) {
	int count=0;
	for(int i=0;i<str.length;i++) {
		if(word.equals(str[i])) {
			count++;
		}
	}
	if(count==1) {
		System.out.println(word+" "+count);
	}
	
}
	}

}
