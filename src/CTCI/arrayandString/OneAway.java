package CTCI.arrayandString;

public class OneAway {

	public boolean check(String s1, String s2) {

		if (s1.length() == s2.length()) {
			return replaceCharacter(s1, s2);

		} else if (s1.length() + 1 == s2.length()) {

			return insertionOfCharacter(s1, s2);

		} else if (s1.length() - 1 == s2.length()) {
			return insertionOfCharacter(s2, s1);
		}
		return false;

	}

	private boolean replaceCharacter(String s1, String s2) {

		boolean foundReplacement = false;

		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				if (foundReplacement)
					return false;
				foundReplacement = true;
			}
		}

		return true;
	}

	private boolean insertionOfCharacter(String s1, String s2) {
		int index1 = 0;
		int index2 = 0;

		while (index2 < s2.length() && index1 < s1.length()) {
			if (s1.charAt(index1) != s2.charAt(index2)) {
				if (index1 != index2) {
					return false;
				}
				index2++;

			} else {
				index1++;
				index2++;
			}
		}
		return true;
	}

}
