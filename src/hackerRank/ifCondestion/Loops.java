package hackerRank.ifCondestion;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		
		int data[][];
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		data = new int[t][3];
		for (int i = 0; i < t; i++) {

			data[i][0] = in.nextInt();// a
			data[i][1] = in.nextInt();// b
			data[i][2] = in.nextInt();// n

		}
		in.close();

		for (int times = 0; times < t; times++) {
			int sum = data[times][0];
			for (int print = 0; print < data[times][2]; print++) {

				sum = (int) (sum + (data[times][1] * Math.pow(2, print)));
				System.out.print(sum + " ");
			}
			System.out.println("");
		}
	}
}
