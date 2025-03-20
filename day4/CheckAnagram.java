package week1.day4;
import java.util.Arrays;
public class CheckAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input1 = "pit" , input2 = "tip";
		if (input1.length() != input2.length())
		{
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
		}
		else
		{
			char[] input1_ca = input1.toCharArray();
			char[] input2_ca = input2.toCharArray();
			Arrays.sort(input1_ca);
			Arrays.sort(input2_ca);
			if (Arrays.equals(input1_ca, input2_ca) )
			{
				System.out.println("The below strings are anagrams\n" + input1 + "\n" + input2);
			}
			else
			{
				System.out.println("The below strings are not anagrams\n" + input1 + "\n" + input2);
			}
			
			
		}
		
		
		
	}

}
