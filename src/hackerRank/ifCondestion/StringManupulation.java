package hackerRank.ifCondestion;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringManupulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter String");

		StringManupulation sp = new StringManupulation();

		sp.splitString();

	}

	public void combine() {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();

		int combineLenth = A.length() + B.length();

		System.out.println(combineLenth);
		System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");
		System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1) + " " + B.substring(0, 1).toUpperCase()
				+ B.substring(1));

	}

	public void substring() {

		Scanner in = new Scanner(System.in);
		String S = in.next();
		int start = in.nextInt();
		int end = in.nextInt();

		System.out.println(S.substring(start, end));

	}

	public void lexicographicalOrder() {

		String s = "welcometojava";
		int K = 3;
		char x[] = s.toCharArray();
		java.util.List<String> varList = new java.util.ArrayList();
		for (int it = 0; it <= x.length - K; it++) {
			varList.add(String.valueOf(x, it, K));
		}

		java.util.Collections.sort(varList);

		System.out.println(varList.get(0));
		System.out.println(varList.get(varList.size() - 1));
	}

	public void palindrome() {
		String s = "madams";
		char rsA[] = s.toCharArray();
		String rs = "";

		for (char x : rsA) {

			rs = String.valueOf(x)+ rs  ;
		}

		if (s.equalsIgnoreCase(rs))
			System.out.println("Yes");
		else
			System.out.println("No");

		System.out.println(String.valueOf(10));
	}

	public void splitString() {
		String s = "He is a very very good boy, isn't he?";
		
		int count = 0;
		Pattern pattern = Pattern.compile(" ");
		Matcher matcher = pattern.matcher(s);
		String[] token = s.split("[ .,?!]+");

		while (matcher.find()) {
			count = count + 1;
			System.out.println(count);
			System.out.println(matcher.group());
		}
	}


}
