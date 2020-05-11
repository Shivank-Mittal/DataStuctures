package CTCI.arrayandString;

import java.util.Arrays;

public class Permutation {
	
	public boolean checkPermutation(String a, String b) {

		char[] _a = a.toCharArray();
		char[] _b = b.toCharArray();
		Arrays.sort(_a);
		Arrays.sort(_b);

		if (a.length() != b.length()) {
			return false;
		}
		return (new String(_a).equals(new String(_b)));

	}
	
	public boolean checkPermutationOfPalindrome(String word) {
		int[] table = buildCharFrequencyTable(word);
		return checkMaxOneodd(table);

	}

	public boolean checkPermutationOfPalindromeAlternate(String word) {

		int oddFound = 0;
		int[] table = new int[128];

		for (char c : word.toCharArray()) {
			int val = Character.getNumericValue(c);
			if (val != (-1)) {
				table[val]++;

				if (table[val] % 2 == 1) {
					oddFound++;
				} else {
					oddFound--;
				}

			}
		}
		return oddFound <= 1;
	}

	private boolean checkMaxOneodd(int[] table) {

		boolean foundOdd = false;

		for (int count : table) {
			if (count % 2 == 1) {
				if (foundOdd) {
					return false;
				}
				foundOdd = true;
			}
		}
		return true;

	}

	private int[] buildCharFrequencyTable(String word) {

		int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];

		for (char c : word.toCharArray()) {

			int x = getCharNumber(c);
			if (x != (-1)) {
				table[x]++;
			}
		}
		return table;

	}

	private int getCharNumber(char c) {

		int a = Character.getNumericValue('a');
		int z = Character.getNumericValue('z');
		int val = Character.getNumericValue(c);

		if (a <= val && val <= z) {

			return val - a;
		}

		return -1;
	}

}
