package CTCI.sortAndQueues;

import java.util.NoSuchElementException;

public class Queue<T> {

	public class QueueNode<T> {
		public T data;
		public QueueNode<T> nextNode;

		public QueueNode(T item) {
			// TODO Auto-generated constructor stub
			this.data = item;
		}
	}

	public QueueNode<T> firstNode;
	public QueueNode<T> lastNode;

	public void add(T item) {
		QueueNode<T> newNode = new QueueNode<T>(item);
		if (lastNode != null) {
			lastNode.nextNode = newNode;
		}
		lastNode = newNode;
		if (firstNode == null)
			firstNode = lastNode;

	}

	public T remove() {
		if (firstNode == null)
			throw new NoSuchElementException();

		T data = firstNode.data;

		firstNode = firstNode.nextNode;
		if (firstNode == lastNode)
			lastNode = firstNode;

		return data;
	}

	public T peek() {
		return firstNode.data;
	}

	public Boolean isEmplty() {
		return firstNode == null;
	}


}
