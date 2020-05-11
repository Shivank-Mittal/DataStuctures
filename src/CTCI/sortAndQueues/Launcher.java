package CTCI.sortAndQueues;

import java.util.Set;

import hackerRank.ifCondestion.RemoveDuplicateValuesInArray;

public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Launcher launcher = new Launcher();

		launcher.callQyueue();
	}

	public void callStack() {

		Stack<String> mystack = new Stack<String>();
		mystack.push("Shiv");
		mystack.push("Madhu");
		System.out.println(mystack.pop());
		mystack.push("Shiv");
		System.out.println(mystack.peek());
		System.out.println(mystack.pop());
		mystack.push("Shiv");
		System.out.println(mystack.isEmpty());

		System.out.println(mystack.pop());
		System.out.println(mystack.pop());
		System.out.println(mystack.isEmpty());
	}

	public void callGenericArray() {
		Integer[] array = new Integer[] { 2, 3, 4, 5, 3, 2, 1 };
		RemoveDuplicateValuesInArray<Integer> input = new RemoveDuplicateValuesInArray<Integer>(array);

		Character arrayChar[] = { 'c', 'a', 'b', 'a' };

		RemoveDuplicateValuesInArray<Character> inputChar = new RemoveDuplicateValuesInArray<Character>(arrayChar);

		Set<Integer> modifiedArray = input.RemoveDup();

		Set<Character> modifiedCharArray = inputChar.RemoveDup();

		for (Integer item : modifiedArray) {
			System.out.print(item + ",");
		}

		System.out.println();
		for (Character c : modifiedCharArray) {
			System.out.print(c + ",");
		}
	}

	public void callQyueue() {
		
		Queue<String> queue = new Queue<String>();
		queue.add("Shiv");
		queue.add("Madhu");
		queue.add("glady");

//		System.out.println(queue.remove());
//		System.out.println(queue.remove());
//		System.out.println(queue.isEmplty());
//		System.out.println(queue.peek());
//		System.out.println(queue.remove());
//		System.out.println(queue.isEmplty());

		System.out.println(queue.firstNode.nextNode.data);
		System.out.println(queue.lastNode.nextNode.data);
		
	}

}
