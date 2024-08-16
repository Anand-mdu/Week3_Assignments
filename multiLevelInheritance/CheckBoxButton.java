package multiLevelInheritance;

public class CheckBoxButton extends Button {

	
public void clickCheckButton() {
	System.out.println("Checkbox is clicked");
}
	public static void main(String[] args) {
		CheckBoxButton  cb= new CheckBoxButton();
		cb.click();
		cb.setText("checkboxes");
		cb.submit();
		cb.clickCheckButton();
		
	}
	
	
}

