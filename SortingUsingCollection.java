package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		List<String> str = new ArrayList<>();
		str.add("HCL");
		str.add("Wipro");
		str.add("CTS");
		str.add("Testleaf");
		Collections.sort(str);
		int size = str.size();
		for (int i = size-1; i >=0 ; i--) {
			System.out.print(str.get(i)+ " ");	
		}
	}
}
