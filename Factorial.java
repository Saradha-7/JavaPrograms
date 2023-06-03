package week1.assignments;

public class Factorial {

	public static void main(String[] args) {
		int n = 6;
		int sum = 1;
		for (int i = n; i >= 1; i--) {
			sum = sum * i;
			
			
		}
		System.out.println("Factorial value of "+n+ " is "+sum);

	}

}
