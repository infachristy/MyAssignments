package week1.day2;

public class CheckNumberPalindrome {

	public static void main(String[] args) {
		int input=541145;
		int output=0;
		int temp = 0, rem = 0;
		
		for (temp= input;temp > 0; temp/=10)
		{
			rem = temp % 10;
			output = output * 10 + rem ;
		}
		if (input == output)
		{
			System.out.println(input + " is a palindrome number");
			
		}
		else
		{
			System.out.println(input + " is not a palindrome number");
		}
		
		
	}
}
