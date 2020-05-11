package hackerRank.ifCondestion;

import java.util.Scanner;

public class FormatQoutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String strValues[] = new String[3];
		int intValues[] = new int[3];

		System.out.println("================================");
		for (int i = 0; i < 3; i++) {
			strValues[i] = sc.next();
			intValues[i] = sc.nextInt();
			// Complete this line
		}

		for (int i = 0; i < 3; i++) {
			String paddedStr = String.format("%-15s", strValues[i]);
			String paddedInt = String.format("%03d", intValues[i]);

			System.out.print(paddedStr + "");

			System.out.println(paddedInt);
		}
		System.out.println("================================");

	}

}
