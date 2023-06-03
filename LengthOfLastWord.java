package week1.assignments;

public class LengthOfLastWord {

	public static void main(String[] args) {
		String s = "luffy is still joyboy";
		String[] s1 = s.split(" ");
		int l = s1.length;
		int a = s1[l-1].length();
		System.out.println(a);

	}

}
