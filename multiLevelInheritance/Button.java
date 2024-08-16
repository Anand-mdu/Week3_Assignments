package multiLevelInheritance;

public class Button extends WebElement{
	
	public void submit() {
		System.out.println("Button is submitted");
		
	}
	public static void main(String[] args) {
		Button bt = new Button();
		bt.click();
		bt.setText("Buttons verified");
		bt.submit();
		
	}

}
