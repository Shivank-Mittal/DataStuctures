package CTCI.linkedList;

public class LinkedList {

	LinkedList nextNode = null;

	int data;

	public LinkedList(int data) {
		this.data = data;
	}

	public void apendToTail(int data) {
		LinkedList endNode = new LinkedList(data);

		LinkedList n = this;

		while (n.nextNode != null) {
			n = n.nextNode;
		}
		n.nextNode = endNode;

	}

	public LinkedList getList() {
		return this.nextNode;
	}
}
