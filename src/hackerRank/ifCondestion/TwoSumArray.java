package hackerRank.ifCondestion;

import java.util.HashMap;
import java.util.Map;

public class TwoSumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TwoSumArray sumArray = new TwoSumArray();

		int a[] = new int[] { 2, 11, 15, 7 };
		int target = 9;

		int[] result = sumArray.getValueFrom1loop(a, target);
		System.out.println("[" + result[0] + "," + result[1] + "]");
	}

	public int[] getValueFrom2loops(int a[], int target) {
		int index1 = 0;
		int index2 = 0;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] + a[j] == target) {
					index1 = i;
					index2 = j;
					return new int[] { index1, index2 };
				}
			}
		}
		return new int[] { -1, -1 };
	}

	public int[] getValueFrom1loop(int a[], int target) {

		Map<Integer, Integer> visited = new HashMap<Integer, Integer>();

		for (int i = 0; i < a.length; i++) {
			int delta = target - a[i];
			if (visited.containsValue(delta)) {
				return new int[] { visited.get(delta), i };
			} else {
				visited.put(a[i], i);
			}
		}
		return new int[] { -1, -1 };
	}

}
