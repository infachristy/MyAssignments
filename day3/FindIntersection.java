package week1.day3;

public class FindIntersection {
	public static void main(String[] args) {
		int[] array1 = {6, 7, 11, 4, 6, 7};
        int[] array2 = {1, 2, 11, 4, 6, 7};

        // Nested for loop to compare elements of both arrays
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                // If a match is found, print the matching element
                if (array1[i] == array2[j]) {
                    System.out.println("Matching element: " + array1[i]);
                }
            }
        }

	}

}
