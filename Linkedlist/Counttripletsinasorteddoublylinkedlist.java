package DSA;

import java.util.HashMap;

public class Counttripletsinasorteddoublylinkedlist {
	static class Node {
	    int data;
	    Node next, prev;
	    Node(int val)
	    {
	        data = val;
	        prev = null;
	        next = null;
	    }
	};
	  
	// function to count triplets in a sorted doubly linked list
	// whose sum is equal to a given value 'x'
	static int countTriplets(Node head, int x)
	{
	    Node ptr, ptr1, ptr2;
	    int count = 0;
	  
	    // unordered_map 'um' implemented as hash table
	    HashMap<Integer,Node> um = new HashMap<Integer,Node>();
	  
	    // insert the <node data, node pointer> tuple in 'um'
	    for (ptr = head; ptr != null; ptr = ptr.next)
	        um.put(ptr.data, ptr);
	  
	    // generate all possible pairs
	    for (ptr1 = head; ptr1 != null; ptr1 = ptr1.next)
	        for (ptr2 = ptr1.next; ptr2 != null; ptr2 = ptr2.next) {
	  
	            // p_sum - sum of elements in the current pair
	            int p_sum = ptr1.data + ptr2.data;
	  
	            // if 'x-p_sum' is present in 'um' and either of the two nodes
	            // are not equal to the 'um[x-p_sum]' node
	            if (um.containsKey(x - p_sum) && um.get(x - p_sum) != ptr1
	                && um.get(x - p_sum) != ptr2)
	  
	                // increment count
	                count++;
	        }
	  
	    // required count of triplets
	    // division by 3 as each triplet is counted 3 times
	    return (count / 3);
	}
	  
	// A utility function to insert a new node at the
	// beginning of doubly linked list
	static Node insert(Node head, int val)
	{
	        // allocate node
	        Node temp = new Node(val);
	 
	        if (head == null)
	            head = temp;
	 
	        else
	        {
	            temp.next = head;
	            head.prev = temp;
	            head = temp;
	        }
	      
	        return head;
	}
	  
	// Driver program to test above
	public static void main(String[] args)
	{
	    // start with an empty doubly linked list
	    Node head = null;
	  
	    // insert values in sorted order
	    head = insert(head, 9);
	    head = insert(head, 8);
	    head = insert(head, 6);
	    head = insert(head, 5);
	    head = insert(head, 4);
	    head = insert(head, 2);
	    head = insert(head, 1);
	  
	    int x = 17;
	  
	    System.out.print("Count = "
	         + countTriplets(head, x));
	}
	}
	 