package hackerRank.ifCondestion;

public class Smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] input = { -3, 0, -7, -2, -8, -4 };

		int n = input.length;
		int largetNegative = 0;
		int smallestPositve = 0;
		int closest = 0;

		for (int i = 0; i < n; i++) {
			int t = input[i];
			if (i == 0) {
				closest = input[i];
			} else {
				if (Math.abs(closest) > Math.abs(input[i])) {
					closest = input[i];
					}
				}
		}


		System.out.println(closest);

	}

}
