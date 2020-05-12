package CTCI.sortAndQueues;


public class SortIntegerStack {

	Stack<Integer> currentStack;
	SortIntegerStack(Stack<Integer> stack){
		this.currentStack = stack;
	}
	
	Stack<Integer> temStack = new Stack<Integer>();
	
public Stack<Integer> sortIntStack(){
		
		if(temStack.isEmpty()) pushFromCurrentToTemp();
		
			while(!currentStack.isEmpty()) {
				
				if(temStack.peek() > currentStack.peek()) {
					pushFromCurrentToTemp();
				}else {
					int itemtoInsert = currentStack.pop();
					
					try {
						while(itemtoInsert > temStack.peek() && !temStack.isEmpty()) {
							pushFromTempToCurrent();
						}
					} catch (Exception e) {
						// TODO Auto-generated catch block
						
					}
					
					
					temStack.push(itemtoInsert);
				}	
			}
		
		
		return temStack;
		
	}
	
	private void pushFromCurrentToTemp() {
		temStack.push(currentStack.pop());
	}
	private void pushFromTempToCurrent() {
		currentStack.push(temStack.pop());
	}
}
