package module_2;

import java.util.Arrays;

public class String_2 {

	public static void main(String[] args) {
		String str1 = "anagram";
		String str2 = "nagaram";
		char[] c1 = str1.toCharArray();
		char[] c2 = str2.toCharArray();

		int n1 = c1.length;
		int n2 = c2.length;

		if (n1 != n2) {
			System.out.println("false");
		} else {
			Arrays.sort(c1);
			Arrays.sort(c2);

			for (int i = 0; i < n1; i++)
				if (c1[i] != c2[i])
					System.out.println("false");
			System.out.println("true");
		}
	}
}
