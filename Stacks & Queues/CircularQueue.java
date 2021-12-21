package DSA;
import java.util.ArrayList;
public class CircularQueue {
	private int size, front, rear;
	 
	private ArrayList<Integer> queue = new ArrayList<Integer>();
	 
	CircularQueue(int size)
	{
	    this.size = size;
	    this.front = this.rear = -1;
	}
	 
	public void enQueue(int data)
	{
	     
	    if((front == 0 && rear == size - 1) ||
	      (rear == (front - 1) % (size - 1)))
	    {
	        System.out.print("Queue is Full");
	    }
	 
	    else if(front == -1)
	    {
	        front = 0;
	        rear = 0;
	        queue.add(rear, data);
	    }
	 
	    else if(rear == size - 1 && front != 0)
	    {
	        rear = 0;
	        queue.set(rear, data);
	    }
	 
	    else
	    {
	        rear = (rear + 1);
	     
	        if(front <= rear)
	        {
	            queue.add(rear, data);
	        }
	     
	        else
	        {
	            queue.set(rear, data);
	        }
	    }
	}
	 
	public int deQueue()
	{
	    int temp;
	 
	    if(front == -1)
	    {
	        System.out.print("Queue is Empty");
	         
	        return -1;
	    }
	 
	    temp = queue.get(front);
	 
	    if(front == rear)
	    {
	        front = -1;
	        rear = -1;
	    }
	 
	    else if(front == size - 1)
	    {
	        front = 0;
	    }
	    else
	    {
	        front = front + 1;
	    }
	     
	    return temp;
	}
	 
	public void displayQueue()
	{
	     
	    if(front == -1)
	    {
	        System.out.print("Queue is Empty");
	        return;
	    }
	 
	    System.out.print("Elements in the " +
	                     "circular queue are: ");
	 
	    if(rear >= front)
	    {
	     
	        for(int i = front; i <= rear; i++)
	        {
	            System.out.print(queue.get(i));
	            System.out.print(" ");
	        }
	        System.out.println();
	    }
	 
	    else
	    {
	         
	        for(int i = front; i < size; i++)
	        {
	            System.out.print(queue.get(i));
	            System.out.print(" ");
	        }
	        for(int i = 0; i <= rear; i++)
	        {
	            System.out.print(queue.get(i));
	            System.out.print(" ");
	        }
	        System.out.println();
	    }
	}
	 
	public static void main(String[] args)
	{
	     
	    CircularQueue q = new CircularQueue(5);
	     
	    q.enQueue(14);
	    q.enQueue(22);
	    q.enQueue(13);
	    q.enQueue(-6);
	     
	    q.displayQueue();
	 
	    int x = q.deQueue();

	    if(x != -1)
	    {
	        System.out.print("Deleted value = ");
	        System.out.println(x);
	    }
	 
	    x = q.deQueue();
	 
	    if(x != -1)
	    {
	        System.out.print("Deleted value = ");
	        System.out.println(x);
	    }
	 
	    q.displayQueue();
	     
	    q.enQueue(9);
	    q.enQueue(20);
	    q.enQueue(5);
	     
	    q.displayQueue();
	     
	    q.enQueue(20);
	}
	
}
