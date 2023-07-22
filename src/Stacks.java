/**
 * The Stacks class represents a simple stack data structure with a fixed size.
 * It allows pushing elements onto the stack and popping elements from the top.
 * 
 * @author Tej
 */
public class Stacks {
	private int max, top=-1;
	char[] stack;
	
	/**
     * Creates a new instance of the Stacks class with the specified maximum size.
     *
     * @param arr The character array used to initialize the stack.
     */
	public Stacks(char[] arr) {
		max=arr.length;
		stack = new char[max];		
	}
	
	 /**
     * Pushes an element onto the top of the stack.
     * If the stack is full, it prints an error message and does not push the element.
     *
     * @param data The character to be pushed onto the stack.
     */
	public void push(char data) {
		if(top==max-1) {
			System.out.println("Stack full");
			return;
		}
		else {
			top+=1;
			stack[top]=data;
//			System.out.println(data+"pushed into stack");
		}
	}
	
	 /**
     * Pops and returns the element from the top of the stack.
     *
     * @return The character popped from the top of the stack, or a space character if the stack is empty.
     */
	public char pop() {
		char data;
		if(top==-1) {
			System.out.println("stack empty");
			return ' ';
		}
		
		else {
			data=stack[top];
			stack[top]=' ';
			top-=1;
		}
//		System.out.println("popped from stack");
		return data;
	}

}
