
package hackerRank.ifCondestion;

public class StackImplementation {
	
	private int[] stack;
	private int capacity;
	private int top ;
	
	
	public StackImplementation(int capacity) {
		stack = new int[capacity];
		this.capacity = capacity;
		
		top =-1;
	}
	
	public static void main(String args[]) {
		StackImplementation implementation = new StackImplementation(5);
		implementation.push(5);
		System.out.println(implementation.pop());
		implementation.push(2);
		implementation.push(3);
		implementation.push(10);
		System.out.println(implementation.pop());
		System.out.println(implementation.peek());
		System.out.println(implementation.pop());
		
		
	}
	
	private int pop() 
	{
		return stack[top--];
	}
	private void push(int i) 
	{
		stack[++top]=i;
	}
	private int peek() 
	{
		return stack[top];
	}

}
