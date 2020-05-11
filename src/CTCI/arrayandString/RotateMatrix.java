package CTCI.arrayandString;

public class RotateMatrix {

	public void rotate() {
		int[][] matrix = new int[6][6];
		int n = matrix.length;
		for (int layer = 0; layer < n / 2; layer++) {

			int first = layer;
			int last = n - 1 - layer;

			for (int i = first; i < last; i++) {
				int offset = i - first;

				int top = matrix[first][i];
			}
		}


	}
}
