package week2.day3;

public class TextField extends WebElement {
	
	public void getText()
	{
		System.out.println("This is getText field");
	}


	

		public static void main(String[] args) {
			TextField tf = new TextField();
			tf.getText();
			tf.setText("String from TextField class");
			

	}
		
}


