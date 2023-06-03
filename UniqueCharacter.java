package week3.day2;

public class UniqueCharacter {

	public static void main(String[] args) {
		String companyName = "saradha";
		int f = 0;
		for (Character ch : companyName.toCharArray()) {
			if(companyName.indexOf(ch)==companyName.lastIndexOf(ch)) {
				System.out.println(ch);
				f = f + 1;	
			}
		}
		if(f==0) {
			System.out.println("String does not contains unique character");
		}
	}
}
