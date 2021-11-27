package DSA;


	class Sortaksorteddoublylinkedlist
	{
	static Node head;
	static class Node
	{
	    int data;
	    Node next, prev;
	    Node(int d)
	    {
	    data = d;
	    next = prev = null;
	    }
	}
	 
	// function to sort a k sorted doubly linked list
	// Using Insertion Sort
	// Time Complexity: O(n*k)
	// Space Complexity: O(1)
	Node sortAKSortedDLL( Node head, int k) {
	      if(head == null || head.next == null)
	        return head;
	 
	    // perform on all the nodes in list
	    for(Node i = head.next; i != null; i = i.next) {
	        Node j = i;
	          // There will be atmost k swaps for each element in the list
	        // since each node is k steps away from its correct position
	        while(j.prev != null && j.data < j.prev.data) {
	              // swap j and j.prev node
	            Node temp = j.prev.prev;
	            Node temp2 = j.prev;
	            Node temp3 = j.next;
	            j.prev.next = temp3;
	            j.prev.prev = j;
	            j.prev = temp;
	            j.next = temp2;
	            if(temp != null)
	                temp.next = j;
	            if(temp3 != null)
	                temp3.prev = temp2;
	        }
	          // if j is now the new head
	       // then reset head
	        if(j.prev == null)
	            head = j;
	    }
	    return head;
	}
	 
	/* UTILITY FUNCTIONS */
	/* Function to insert a node at the beginning of the
	    * Doubly Linked List */
	void push(int new_data)
	{
	    /* allocate node */
	    Node new_node = new Node(new_data);
	 
	    /* since we are adding at the beginning,
	        prev is always NULL */
	    new_node.prev = null;
	 
	    /* link the old list off the new node */
	    new_node.next = head;
	 
	    /* change prev of head node to new node */
	    if (head != null)
	    {
	    head.prev = new_node;
	    }
	 
	    /* move the head to point to the new node */
	    head = new_node;
	}
	 
	/* Function to print nodes in a given doubly linked list
	    This function is same as printList() of singly linked
	    list */
	void printList(Node node)
	{
	    while (node != null)
	    {
	    System.out.print(node.data + " ");
	    node = node.next;
	    }
	}
	 
	// Driver code
	public static void main(String[] args)
	{
		Sortaksorteddoublylinkedlist list = new Sortaksorteddoublylinkedlist();
	 
	    /* Let us create a k sorted doubly linked list to test the
	        functions Created doubly linked list will be 3<->6<->2<->12<->56<->8
	    */
	    list.push(8);
	    list.push(56);
	    list.push(12);
	    list.push(2);
	    list.push(6);
	    list.push(3);
	 
	    int k = 2;
	 
	    System.out.println("Original Doubly linked list:");
	    list.printList(head);
	 
	    Node sortedDLL = list.sortAKSortedDLL(head, k);
	    System.out.println("");
	    System.out.println("Doubly Linked List after sorting:");
	    list.printList(sortedDLL);
	}
	
}
