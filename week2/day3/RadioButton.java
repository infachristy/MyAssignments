package week2.day3;

public class RadioButton extends Button{
	
	public void selectRadioButton()
	{
		System.out.println("This is selectRadioButton");
	}

	public static void main(String[] args) {
		RadioButton rb = new RadioButton();
		rb.click();
		rb.selectRadioButton();
		rb.setText("String from radioBoxButto");
		rb.submit();

	}

}
