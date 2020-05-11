package CTCI.arrayandString;

public class StringCompression {

	public String compress(String str) {

		int counter = 0;
		char val;
		StringBuilder compresed = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {

			counter++;

			if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
				compresed.append(str.charAt(i));
				compresed.append(counter);
				counter = 0;
			}
		}
		return compresed.toString();

	}
}
