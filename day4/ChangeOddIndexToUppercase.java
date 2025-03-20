package week1.day4;

import java.util.Arrays;
public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="changeme";
		char[] input_ca = input.toCharArray();
		for (int i=0;i<input_ca.length;i++)
		{
			if(i%2==1) {
				
				char tmp = Character.toUpperCase(input_ca[i]);
				input_ca[i]= tmp;
			}
			
		}
		System.out.println(input_ca);

	}

}
