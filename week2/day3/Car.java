package week2.day3;

public class Car extends Vehicle {
	
	public void applyHorn()
	{
		System.out.println("Horn Appliedd");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car cc = new Car();
		cc.applyHorn();
		cc.applyAcc();
		cc.applyBreak();
		

	}

}
