/**
 * The Queue class represents a simple queue data structure with a fixed size.
 * It allows enqueueing elements at the end and dequeuing elements from the front.
 * 
 * @author Tej
 */
public class Queue {
	private int max, head=-1,tail=-1;
	char[] queue;
	
	  /**
     * Creates a new instance of the Queue class with the specified maximum size.
     *
     * @param a The character array used to initialize the queue.
     */
	public Queue(char[] a) {
		max=a.length;
		queue=new char[max];
	}
	
	 /**
     * Adds an element to the end of the queue.
     * If the queue is full, it prints an error message and does not add the element.
     *
     * @param data The character to be added to the queue.
     */
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
	
	/**
     * Removes and returns the element at the front of the queue.
     * If the queue is empty, it returns a space character.
     *
     * @return The character removed from the front of the queue, or a space character if the queue is empty.
     */
	public char dequeue() {
		char data;
		if(head<0||head>tail) {
			return ' ';
		}
		else {
			data=queue[head];
			queue[head]=0;
			head+=1;
		}
		return data;
	}

}
