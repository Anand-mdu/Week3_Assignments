package SinglelevelInheritance;

public class Subclasses extends TestData {
	
	public void enterUsername() {
		System.out.println("Anand");
		
	}

	public void enterPassword() {
		System.out.println("madurai");
	}
	public static void main(String[] args) {
		Subclasses sc = new Subclasses();
		sc.enterCredentials();
		sc.navigateToHomePage();

		
	

	}

}
