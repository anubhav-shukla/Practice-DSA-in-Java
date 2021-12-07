package DSA;
import java.util.*;

public class PreordertoPostorder {
	 
	static class Node {
	 
	    int data;
	    Node left, right;
	 
	    Node(int d) {
	        data = d;
	        left = right = null;
	    }
	}
	 
	    Node constructTree(int pre[], int size) {
	        Node root = new Node(pre[0]);
	 
	        Stack<Node> s = new Stack<Node>();
	        s.push(root);
	        for (int i = 1; i < size; ++i) {
	            Node temp = null;
	 
	            while (!s.isEmpty() && pre[i] > s.peek().data) {
	                temp = s.pop();
	            }
	 
	            if (temp != null) {
	                temp.right = new Node(pre[i]);
	                s.push(temp.right);
	            }
	             
	            else {
	                temp = s.peek();
	                temp.left = new Node(pre[i]);
	                s.push(temp.left);
	            }
	        }
	 
	        return root;
	    }
	    void printInorder(Node node) {
	        if (node == null) {
	            return;
	        }
	        printInorder(node.left);
	        System.out.print(node.data + " ");
	        printInorder(node.right);
	    }
	    public static void main(String[] args) {
	    	PreordertoPostorder tree = new PreordertoPostorder();
	        int pre[] = new int[]{10, 5, 1, 7, 40, 50};
	        int size = pre.length;
	        Node root = tree.constructTree(pre, size);
	        System.out.println("Inorder traversal of the constructed tree is ");
	        tree.printInorder(root);
	    }
	
}
