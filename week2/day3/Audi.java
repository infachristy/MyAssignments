package week2.day3;

public class Audi extends Car {

	public void advBreak()
	{
		System.out.println("advBreak");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Audi adi = new Audi();
		adi.advBreak();
		adi.applyAcc();
		adi.applyBreak();
		adi.applyHorn();

	}

}
