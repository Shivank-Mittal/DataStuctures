package hackerRank.ifCondestion;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Anagram anagram = new Anagram();
		System.out.println(anagram.isAnargam("", ""));
	}

	public boolean isAnargam(String a, String b) {


		if ((a.length() != b.length()) || a.length() == 0 || a == "" || b == "")
			return false;

		char[] A = a.toLowerCase().toCharArray();
		char[] B = b.toLowerCase().toCharArray();
		Arrays.sort(A);
		Arrays.sort(B);

		StringBuilder aBuilder = new StringBuilder();
		StringBuilder bBuilder = new StringBuilder();

		for (int i = 0; i < a.length(); i++) {
			aBuilder.append(A[i]);
			bBuilder.append(B[i]);
		}
		if (aBuilder.toString().equalsIgnoreCase(bBuilder.toString()))
			return true;

			return false;

	}

}
