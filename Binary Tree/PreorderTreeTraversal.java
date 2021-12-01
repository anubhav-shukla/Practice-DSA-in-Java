package DSA;

public class PreorderTreeTraversal {
	 static class Node
	{
	    int data;
	    Node left, right;
	    public Node(int key)
	    {
	        data = key;
	        left = right = null;
	    }
	}
	 
	 public static void preorder(Node root)
	    {
	        if (root == null) {
	            return;
	        }
	    
	        System.out.print(root.data + " ");
	        preorder(root.left);
	        preorder(root.right);
	    }
	 
	    public static void main(String[] args)
	    {
	        /* Construct the following tree
	                   1
	                 /   \
	                /     \
	               2       3
	              /      /   \
	             /      /     \
	            4      5       6
	                  / \
	                 /   \
	                7     8
	        */
	 
	        Node root = new Node(1);
	        root.left = new Node(2);
	        root.right = new Node(3);
	        root.left.left = new Node(4);
	        root.right.left = new Node(5);
	        root.right.right = new Node(6);
	        root.right.left.left = new Node(7);
	        root.right.left.right = new Node(8);
	 
	        preorder(root);
	    }
	}
