import java.util.Arrays;
public class Stacks {
	private int max, top=-1;
	private Stacks(char[] arr) {
		max=arr.length;
	}
	char[] stack = new char[max];		
	
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
	
	public void display() {
		System.out.println(Arrays.toString(stack).replace("[", "").replace("]", "").replace(",", ""));	
	}

}
