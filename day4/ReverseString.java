package week1.day4;

public class ReverseString {

	public static void main(String[] args) {
	      
        // Define a string
        String s = "infa christy";

        // Convert the string to a character array
        char[] ca = s.toCharArray();
        int len=ca.length;
        for (int i=len-1;i>=0;i--)
        {
        	System.out.print(ca[i]);
        }
        

        
    }

}
