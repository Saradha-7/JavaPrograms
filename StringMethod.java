package week1.day2;

public class StringMethod {

	public static void main(String[] args) {
		String str = "Testleaf";
		String s = new String("test");
		int len = str.length();   ///find the lenngth
		System.out.println(len);
		boolean b = str.contains(s);  // string present or not
		System.out.println(b);
		String str1 = str.toLowerCase(); // toLowerCase  toUpperCase
		System.out.println(str1);
		
		char ch[]=str.toCharArray();  // string ---> character
		System.out.println(ch[4]);
		
		
		
		for (int i = len-1; i >= 0; i--) {
			System.out.println (ch[i]);
			
		}
		String a = "mouni";  //ignore case and check equal
		String c = "MOUNI";
		if(a.equalsIgnoreCase(c)) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}

	}

}
