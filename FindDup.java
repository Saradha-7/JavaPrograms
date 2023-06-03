package week1.day2;

public class FindDup {
	public static void main(String[] args) {
		int a[]= {2,3,5,6,7,7,5,2,8,9};
		int l = a.length;
		for (int i = 0; i < l; i++) {
			for (int j = i+1; j < l; j++) {
				if(a[i]==a[j]) {
					System.out.println(a[i]);
				}
				
			}
			
		}
	}

}
