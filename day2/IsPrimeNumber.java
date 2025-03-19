package week1.day2;

public class IsPrimeNumber {
	public static void main(String[] args) {
		int input = 12;
		boolean flag = false;		
		
		for (int i = 2; i <= input-1; i++) {
			
				if(input % i == 0) { 
					flag = true;
					break;
				}
			
			
			}
		
		if (!flag) {
			System.out.println(input + " is a prime number");
					
		}
		
		else {
			System.out.println(input + " is not a prime number");
		}
	}

}
