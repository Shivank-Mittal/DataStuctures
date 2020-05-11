package CTCI.sortAndQueues;

import java.util.EmptyStackException;

public class Stack<T> {

	public static class StackNode<T> {

		public T data;
		public StackNode<T> nextNode;

		public StackNode(T item) {
			this.data = item;
		}

	}

	private StackNode<T> currentNode;

	public void push(T item) {
		StackNode<T> newNode = new StackNode<T>(item);
		newNode.nextNode = currentNode;
		currentNode = newNode;

	}

	public T peek() {
		if (currentNode.data == null)
			throw new EmptyStackException();
		return currentNode.data;
	}

	public T pop() {

		if (currentNode == null)
			throw new EmptyStackException();
		T item = currentNode.data;
		currentNode = currentNode.nextNode;
		return item;
	}

	public boolean isEmpty() {

		return currentNode == null;
	}


}
