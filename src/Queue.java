import java.util.Scanner;
public class Queue {
	private int max, head=-1,tail=-1;
	
	public Queue(char[] a) {
		max=a.length;
	}
	
	char[] queue=new char[max];
	
	public void enqueue(char data) {
		if(tail==max-1) {
			System.out.println("Q full");
			return;
		}
		else  {
			if(head==-1&& tail== -1) {
				head=0;
				tail=0;
			}
			else {
				tail+=1;
			}
			queue[tail]=data;
		}
	}
	
	public char dequeue() {
		char data;
		if(head<0||head>tail) {
			return ' ';
		}
		else {
			data=queue[head];
			queue[head]=0;
			head+=head;
		}
		return data;
	}

}
