package week1.day3;
import java.util.Arrays;
public class FindMissingNumber {
	public static void main(String[] args) {
		 int[] arr = {1, 4, 3, 2, 9, 6, 7};

	        // Sort the array
	        Arrays.sort(arr);

	        // Loop through the sorted array to find the missing number
	        for (int i = 0; i < arr.length - 1; i++) {
	            if (arr[i] + 1 != arr[i + 1]) {
	                System.out.println("Missing number: " + (arr[i] + 1));
	               
	            }
	        }

	}
}
