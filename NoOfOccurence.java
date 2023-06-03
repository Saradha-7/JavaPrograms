package week5day2.interviewquestion;

public class NoOfOccurence {

	public static void main(String[] args) {
		String str ="saradha";
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int count = 0;
			for (int j = 0; j < ch.length; j++) {
				if (ch[i]==ch[j]) {
					count = count + 1;	
				}
			}
			System.out.println("Character: "+ch[i]+" Count: "+ count);
		}
	}
}
