package week1.day4;
import java.util.Arrays;

public class ReverseOddPositionWords {

	public static void main(String[] args) {
		String input = "I am a software tester";
		System.out.println(input);
		String[] str_split= input.split(" ");
		for(int i=0;i < str_split.length;i++ )
		{
			if (i%2==1)
			{
				char[] input1_ca = str_split[i].toCharArray();
				
				for (int k=input1_ca.length-1;k>=0;k--)
				{
					System.out.print(input1_ca[k]);
				}
				System.out.print(" ");
			}
			else
			{
				System.out.print(str_split[i] + " ");
			}
		}
			

	}

}
