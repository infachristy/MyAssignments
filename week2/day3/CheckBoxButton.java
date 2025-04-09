package week2.day3;

public class CheckBoxButton extends Button {
	
	public void clickCheckButton()
	{
		System.out.println("This is clickCheckButton");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CheckBoxButton cb = new CheckBoxButton();
		cb.click();
		cb.setText("String from CheckBoxButton");
		cb.clickCheckButton();
		cb.submit();

	}

}
