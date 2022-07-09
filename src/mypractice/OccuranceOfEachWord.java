package mypractice;

import java.util.LinkedHashSet;

public class OccuranceOfEachWord {

	public static void main(String[] args) {
String s="welcome to india welcome to tyss";
String[] str = s.split(" ");
System.out.println(str);
LinkedHashSet<String> set =new LinkedHashSet<>();
for(int i=0;i<str.length;i++) {
	set.add(str[i]);
}
System.out.println(set);

for (String word : set) {
	int count=0;
	for(int i=0;i<str.length;i++)
	{
		if(word.equals(str[i]))
		{
			count++;
		}
	}
	System.out.println(word+" "+count);
}
	}

}
