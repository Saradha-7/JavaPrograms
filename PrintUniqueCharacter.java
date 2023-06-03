package week3.day1;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		String name = "saradha";
		
		char[] ch = name.toCharArray();
		Set<Character> uniqueCharacter = new HashSet<>();
		for (int i = 0; i < ch.length; i++) {
			uniqueCharacter.add(ch[i]);
		}
	}

}
