package CTCI.linkedList;

public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList linkedList = new LinkedList(1);

		for (int count = 1; count <= 10; count++) {
			linkedList.apendToTail(count * 10);
		}

		while (linkedList != null) {
			System.out.println(linkedList.data);
			linkedList = linkedList.nextNode;
		}

	}

}
