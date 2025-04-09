package week2.day3;

public class Button extends WebElement {
	
	public void submit()
	{
		System.out.println("This is submit button");
	}

	public static void main(String[] args) {
		Button bt = new Button();
		bt.click();
		bt.setText("String from Button class");
		

	}

}
