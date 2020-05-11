package hackerRank.ifCondestion;

import java.util.Scanner;

public class MyRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String IP = in.next();
			System.out.println(IP.matches(new MyRegexTest().pattern));
		}

	}

}

class MyRegexTest {

	static String dot = "\\.";
	static String digit = "\\d\\d\\d";
	public static String pattern = digit + dot + digit + dot;

	public void patterns() {

	}

}
