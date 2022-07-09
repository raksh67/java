package basics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DuplicateArrayList {

	public static void main(String[] args) {
ArrayList list=new ArrayList<>();
list.add(1);
list.add(2);
list.add(3);
list.add(4);

Set set =new HashSet<>(list);

if(set.size()==list.size()) {
	System.out.println("list doesn't have duplicate values");
}
else
	System.out.println("list as duplicate values");
	}

}
