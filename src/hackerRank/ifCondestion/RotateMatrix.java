package hackerRank.ifCondestion;

public class RotateMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RotateMatrix matrix = new RotateMatrix();

		int[] in = new int[] { 1, 2, 3, 4, 5 };

		for (int value : matrix.rotate(in, 3)) {
			System.out.print(value + " ");
		}
	}

	private int[] rotate(int a[], int d) {

		int[] sub = new int[a.length];
		int pointer = d;
		int counter = 0;
		int length = a.length;


		while (counter < d) {
			sub[length - pointer] = a[counter];
			pointer--;
			counter++;
		}


		pointer = 0;
		while (counter <= a.length - 1) {
			sub[pointer] = a[counter];
			counter++;
			pointer++;
		}

		return sub;
	}

}
