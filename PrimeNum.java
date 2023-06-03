package week1.day2;

public class PrimeNum {

	public static void main(String[] args) {
		int n = 22;
		int f = 0;
	//	int m = n/2;
		for (int i = 2; i < n ; i++) {
			if(n%i==0) {
				f = f +1;
			} 
			
		}
		if(f==0) {
			System.out.println("It is prime");
			
		}
		else {
			System.out.println("It is not Prime");
		}

	}

}
