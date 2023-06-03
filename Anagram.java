package week1.assignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String input1 = "stop";
		String input2 = "post";
		int count = 0;
		int len1 = input1.length();
		int len2 = input2.length();
		//System.out.println(len1 +" "+ len2);
		if (len1==len2) {
			
			char[] ch1 = input1.toCharArray();
			char[] ch2 = input2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			//System.out.println(ch1);
			//System.out.println(ch2);
			for (int i = 0; i < ch2.length; i++) {
				if(ch1[i]==ch2[i]) {
					count = count + 1;	
				}
			}
			if(count==len1) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}
			
		} else {
			System.out.println(false);

		}
				
	}
	
	//public static boolean isAnagram(String input1, String input2) {
	//		int len1 = input1.length();
	//		int len2 = input2.length();
	//		System.out.println(len1);
	//		System.out.println(len2);
				
				

	//	}
	 // public static void main(String args[]) {
	  //  Anagram sol = new Anagram();
	   // System.out.println(sol.isAnagram("stop","post"));
	//}
}
