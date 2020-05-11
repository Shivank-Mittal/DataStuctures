package hackerRank.ifCondestion;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RemoveDuplicateInArray prepTest = new RemoveDuplicateInArray();
		
		I_Duplicate withoutDup = (Integer[] input) -> {
			Set<Integer> removeDup = new HashSet<Integer>();
			for (int i : input) {
				removeDup.add(i);
			}
			return removeDup.toArray(new Integer[removeDup.size()]);
		};
		
		Integer[] filteredArray = withoutDup.dup(new Integer[] { 2, 4, 6, 2, 1, 8, 9 });
		Integer[] filteredArray2 = withoutDup.dup(new Integer[] { 2, 2, 2, 2, 1, 8, 9 });

		for (int i = 0; i < filteredArray.length; i++) {
			System.out.print(filteredArray[i]);
		}
	}
}

interface I_Duplicate {
	public Integer[] dup(Integer[] input);
}
