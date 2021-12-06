package DSA;

public class PopulateInorderSuccessorforallnodes {
	static class Node
	{
	    int data;
	    Node left, right, next;
	  
	    Node(int item)
	    {
	        data = item;
	        left = right = next = null;
	    }
	}
	 
	    Node root;
	    static Node next = null;
	    void populateNext(Node node)
	    {
	        if (node != null)
	        {
	            populateNext(node.right);
	            node.next = next;
	            next = node;
	            populateNext(node.left);
	        }
	    }
	    public static void main(String args[])
	    {
	    	PopulateInorderSuccessorforallnodes tree = new PopulateInorderSuccessorforallnodes();
	        tree.root = new Node(10);
	        tree.root.left = new Node(8);
	        tree.root.right = new Node(12);
	        tree.root.left.left = new Node(3);
	        tree.populateNext(tree.root);
	        Node ptr = tree.root.left.left;
	        while (ptr != null)
	        {
	            int print = ptr.next != null ? ptr.next.data : -1;
	            System.out.println("Next of " + ptr.data + " is: " + print);
	            ptr = ptr.next;
	        }
	    }
	}
