package CTCI.arrayandString;

import java.util.Arrays;

public class ArrayAndString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test = "Heyh Bhb";
		String testPermutabtion = "abcbbbmac";
		ArrayAndString aas = new ArrayAndString();

//		StringCompression compression = new StringCompression();

//		RotateMatrix Rmatrix = new RotateMatrix();
//
//		Rmatrix.rotate();

//		System.out.println(compression.compress("aabbbbbbcdeeeee"));

//
//		Permutation permutation = new Permutation();
//
////		System.out.println(permutation.checkPermutation("abcd", "cds"));
//		System.out.println(permutation.checkPermutationOfPalindrome(testPermutabtion));
//		System.out.println(permutation.checkPermutationOfPalindromeAlternate(testPermutabtion));
//		System.out.println(aas.isUniqueChar("abzcz"));
//		System.out.println(aas.replaceWith(test));

//		OneAway away = new OneAway();
//		System.out.println(away.check("test", "testsaa" + ""));

		String answer = aas.isUniqueChar(test) ? "yes" : "No";
//		System.out.println("String \"" + test + "\" have Unique Characters ?  "
//				+ (answer = aas.isUnqueCharUsingArrayMatcing(test) ? "yes" : "No"));

		System.out.println("String \"" + test + "\" have Unique Characters ?  "
				+ answer);
	}

	public boolean isUniqueChar(String word) {

		if (word.length() > 128)
			return false;

		boolean[] char_set = new boolean[128];

		for (char alphabet : word.toCharArray()) {
			int val = alphabet;

			if (char_set[val])
				return false;
			else
				char_set[val] = true;
		}

		return true;

	}

	public boolean isUnqueCharUsingArrayMatcing(String input) {
		char[] charArrayOfinput = input.toCharArray();
		Arrays.sort(charArrayOfinput);

		for (int count = 0; count < input.length() - 1; count++) {

			if (charArrayOfinput[count] == charArrayOfinput[count + 1]) {
				return false;
			}
		}

		return true;

	}




}
