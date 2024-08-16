package String_HomeAssignments;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {

		String text = "changeme";
		char[] charArray = text.toCharArray();
		for (int i = charArray.length - 1; i >= 0; i--) {
			if (i % 2 != 0) {
				charArray[i] = Character.toUpperCase(charArray[i]);
			}
		}

		System.out.println(new String(charArray));
	}


}


