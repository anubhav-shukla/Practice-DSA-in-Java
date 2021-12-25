package DSA;

public class IsBinaryTreeHeap {
	static class Node {
	    int key;
	    Node left, right;

	    Node(int k)
	    {
	        key = k;
	        left = right = null;
	    }
	}

	static class Is_BinaryTree_MaxHeap
	{
	    int countNodes(Node root)
	    {
	        if (root == null)
	            return 0;
	        return (1 + countNodes(root.left)
	                + countNodes(root.right));
	    }

	    boolean isCompleteUtil(Node root, int index,
	                           int number_nodes)
	    {
	        if (root == null)
	            return true;

	        if (index >= number_nodes)
	            return false;

	        return isCompleteUtil(root.left, 
	                              2 * index + 1,
	                              number_nodes)
	            && isCompleteUtil(root.right,
	                              2 * index + 2,
	                              number_nodes);
	    }

	    boolean isHeapUtil(Node root)
	    {
	        if (root.left == null && root.right == null)
	            return true;

	        if (root.right == null) {
	            return root.key >= root.left.key;
	        }
	        else {
	            if (root.key >= root.left.key
	                && root.key >= root.right.key)
	                return isHeapUtil(root.left)
	                    && isHeapUtil(root.right);
	            else
	                return false;
	        }
	    }

	    boolean isHeap(Node root)
	    {
	        if (root == null)
	            return true;
	        int node_count = countNodes(root);

	        if (isCompleteUtil(root, 0, node_count) == true
	            && isHeapUtil(root) == true)
	            return true;
	        return false;
	    }

	    public static  void main(String args[])
	    {
	        Is_BinaryTree_MaxHeap bt
	            = new Is_BinaryTree_MaxHeap();

	        Node root = new Node(10);
	        root.left = new Node(9);
	        root.right = new Node(8);
	        root.left.left = new Node(7);
	        root.left.right = new Node(6);
	        root.right.left = new Node(5);
	        root.right.right = new Node(4);
	        root.left.left.left = new Node(3);
	        root.left.left.right = new Node(2);
	        root.left.right.left = new Node(1);

	        if (bt.isHeap(root) == true)
	            System.out.println(
	                "Given binary tree is a Heap");
	        else
	            System.out.println(
	                "Given binary tree is not a Heap");
	    }
	}

}
