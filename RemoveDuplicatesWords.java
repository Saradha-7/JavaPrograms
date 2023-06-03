package week3.day1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesWords {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		Set<String> removeDuplicateword = new LinkedHashSet<>();
		String[] str=text.split(" ");
		List<String> list = new ArrayList<>();
		String withoutRepeatedWords = "";
		for (int i = 0; i < str.length; i++) {
			removeDuplicateword.add(str[i]);	
		}
		list.addAll(removeDuplicateword);	
		int size = list.size();
		System.out.println(list);
		String[] t = new String[size];
		for (int i = 0; i < size; i++) {
			t[i]=list.get(i);
		}
		for (int i = 0; i < t.length; i++) {
			withoutRepeatedWords = withoutRepeatedWords  + " "+ t[i];
		}
		System.out.println(withoutRepeatedWords);
		
	}

}
