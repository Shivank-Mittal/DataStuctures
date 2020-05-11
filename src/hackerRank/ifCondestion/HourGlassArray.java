package hackerRank.ifCondestion;

public class HourGlassArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] array = new int[][] { { 1, 2, 3, 4, 5, 6 }, { 1, 2, 3, 4, 5, 6 } };
		HourGlassArray glassArray = new HourGlassArray();
		System.out.println(glassArray.getMaxHourGlassValue(array));
	}

	private int getMaxHourGlassValue(int[][] a) {
		int sum = 0;
		for (int row = 0; row < 3; row++) {

			for (int col = 0; col < 3; col++) {
				if (col > 1) {
					int tempSum = a[row][col] + a[row][col - 1] + a[row][col - 2] + a[row + 1][col - 1]
							+ a[row + 2][col] + a[row + 2][col - 1] + a[row + 2][col - 2];

					if (tempSum > sum)
						sum = tempSum;
				}
			}
		}

		return sum;
	}

}
