package multiLevelInheritance;

public class TextField extends  WebElement{
	
	
	public void getText() {
		System.out.println("Got the text");
	}
	
	public static void main(String[] args) {
		
		TextField tf = new TextField();
		tf.click();
		tf.setText("Another classes");
		tf.getText();
		
		
	}

}
