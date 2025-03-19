package week1.day2;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		
		int range = 10;
		int a = 0, b=1;
		for (int i=0;i< range; i++)
		{
			System.out.println(a + " "); 
			int c = a+b;
			a=b;
			b=c;
		}
	}

}
