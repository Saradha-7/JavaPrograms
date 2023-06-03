package week1.assignments;

public class ReverseString {

	public static void main(String[] args) {
		String str = "testleaf";
		
		char s[]=str.toCharArray();
		int len = s.length;
		//System.out.println(len);
		if (str=="null") {
			System.out.println("Invalid input");
			
		} else {
			
			for (int i = len-1; i >=0 ; i--) {
				System.out.print(s[i]);
				
			}

		}
		
		

	}

}
