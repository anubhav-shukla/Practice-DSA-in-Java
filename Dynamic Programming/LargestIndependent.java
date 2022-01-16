package DSA;

public class LargestIndependent {
	static int max(int x, int y)
	{
	    return (x > y) ? x : y;
	}
	 
	static class Node
	{
	    int data;
	    Node left, right;
	};
	 
	static int LISS(Node root)
	{
	    if (root == null)
	    return 0;
	    int size_excl = LISS(root.left) +
	                    LISS(root.right);
	 
	    int size_incl = 1;
	    if (root.left!=null)
	        size_incl += LISS(root.left.left) +
	                    LISS(root.left.right);
	    if (root.right!=null)
	        size_incl += LISS(root.right.left) +
	                    LISS(root.right.right);
	 
	    return max(size_incl, size_excl);
	}
	 
	static Node newNode( int data )
	{
	    Node temp = new Node();
	    temp.data = data;
	    temp.left = temp.right = null;
	    return temp;
	}
	 
	public static void main(String args[]) {
	
	    Node root = newNode(20);
	    root.left = newNode(8);
	    root.left.left = newNode(4);
	    root.left.right = newNode(12);
	    root.left.right.left = newNode(10);
	    root.left.right.right = newNode(14);
	    root.right = newNode(22);
	    root.right.right = newNode(25);
	 
	    System.out.println("Size of the Largest"
	        + " Independent Set is "
	        + LISS(root));
	    }
	}

