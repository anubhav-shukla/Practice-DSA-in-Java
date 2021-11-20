package DSA;

import java.util.List;


public class ReverseaLinkedListingroupsofgivensize {
	public static void main (String[]args) throws Exception
	  {
	    LinkedList ll = new LinkedList ();
	      ll.addFirst (51);
	      ll.addFirst (35);
	      ll.addFirst (27);
	      ll.addFirst (15);
	      ll.addFirst (11);

	      ll.display ();

	      ll.kReverse (2);
	      ll.display ();

	  }

	}

	class LinkedList
	{
	  private class Node
	  {
	    int data;
	    Node next;

	    public Node (int data, Node next)
	    {
	      this.data = data;
	      this.next = next;
	    }
	  }

	  private Node head;
	  private Node tail;
	  private int size;

	  public LinkedList ()
	  {
	    this.head = null;
	    this.tail = null;
	    this.size = 0;

	  }

	  public int size ()
	  {
	    return this.size;
	  }
	  public boolean isEmpty ()
	  {
	    return this.size () == 0;
	  }
	  public void display ()
	  {
	    Node temp = head;
	    while (temp != null)
	      {
		System.out.print (temp.data + "  ");

		temp = temp.next;
	      }
	    System.out.println ("END");
	  }

	  public void addFirst (int item)
	  {
	    Node temp = new Node (item, head);
	    if (this.size == 0)
	      {
		this.head = this.tail = temp;
	      }
	    else
	      {
		this.head = temp;

	      }

	    this.size++;
	  }

	  public int removeFirst () throws Exception
	  {
	    if (this.size () == 0)
	      {
		throw new Exception ("Linked list is empty");
	      }

	    int rv = this.head.data;

	    if (this.size () == 1)
	      {
		this.head = this.tail = null;
	      }
	    else
	      {
		this.head = this.head.next;
	      }

	    this.size--;
	    return rv;
	  }
 public void kReverse (int k) throws Exception
	  {

	    LinkedList curr = null, klist = null;

	    while (!this.isEmpty ())
	      {
		curr = new LinkedList ();
		for (int i = 0; i < k && !this.isEmpty (); i++)
		  {
          curr.addFirst (this.removeFirst ());

		  }

		if (klist == null)
		  {
		    klist = curr;
		  }
		else
		  {

		    klist.tail.next = curr.head;
		    klist.tail = curr.tail;
		    klist.size = klist.size + curr.size ();
		  }
	      }

	 this.head = klist.head;
	    this.tail = klist.tail;
	    this.size = klist.size ();

	  }
	}
