package hackerRank.ifCondestion;

import java.util.HashSet;
import java.util.Set;


public class RemoveDuplicateValuesInArray<T> {

	T[] Arraydata;

	public RemoveDuplicateValuesInArray(T[] array) {
		// TODO Auto-generated constructor stub

		this.Arraydata = array;
	}


	public Set<T> RemoveDup() {

		Set<T> removeDupSet = new HashSet<T>();

		for (T item : Arraydata) {
			removeDupSet.add(item);
		}

		return removeDupSet;

	}

}
