package multiLevelInheritance;

public class RadioButton extends Button {

	public void selectRadioButton() {
		System.out.println("Radio button is selected");
	}
	
	public static void main(String[] args) {
		RadioButton rd = new RadioButton();
		rd.click();
		rd.submit();
		rd.selectRadioButton();
		rd.setText("Radio Button");
		
		
		
	}
	
}
