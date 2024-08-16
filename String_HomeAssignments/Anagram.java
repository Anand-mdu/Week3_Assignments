package String_HomeAssignments;

import java.util.Arrays;

import net.bytebuddy.asm.Advice.OffsetMapping.Sort;
import net.bytebuddy.asm.MemberSubstitution.Substitution.Chain;

public class Anagram {

	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss";

		int length1 = text1.length();
		int length2 = text2.length();

		if (length1 !=length2) {
			System.out.println("Lengths mismatch");
			return;
		}

		char[] array1 = text1.toCharArray();
		char[] array2 = text2.toCharArray();
		Arrays.sort(array1);
		Arrays.sort(array2);

		if (Arrays.equals(array1, array2)) {
			System.out.println("The given strings are Anagram");
		}

		else {
			System.out.println("The given strings are not a Anagram");
		}
	}

}


