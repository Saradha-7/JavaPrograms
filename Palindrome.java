package week5day2.interviewquestion;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		//String str = "testleaf";
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = input.nextLine();
		String str1 = "";
		char[] ch = str.toCharArray();
		for (int i = ch.length-1; i >=0 ; i--) {
			str1 =   str1+ch[i];
			
		}
		System.out.println(str1);
		if (str.equals(str1)) {
			System.out.println("It is Palindrome");
			
		} else {
			System.out.println("It is not Palindrome");

		}
	}

}
