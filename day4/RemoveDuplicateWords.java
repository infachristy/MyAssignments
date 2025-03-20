package week1.day4;
import java.util.Arrays;
public class RemoveDuplicateWords {

	public static void main(String[] args) {
		String input="We learn Java basics as part of java sessions in java week1";
		System.out.print("input string\n" + input);
		int count=0;
		String[] str_split= input.split(" ");
		
		for(int i=0;i < str_split.length;i++ )
		{
			for(int j=i+1;j < str_split.length;j++ )
				{
				
				if( str_split[i].equalsIgnoreCase(str_split[j] ))
					{
					  //System.out.println(str_split[i] + "   " + str_split[j]);
					  str_split[j]=" ";
					  count = count + 1;
					}
				}
		
		}
		System.out.println("\nOutput string");
		for(int k=0;k < str_split.length;k++ )
		{
			System.out.print(str_split[k] + " ");
		}
		

	}
}
