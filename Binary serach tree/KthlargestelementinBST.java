package DSA;

public class KthlargestelementinBST {
	static class Node {

	    int data;
	    Node left, right;

	    Node(int d)
	    {
	        data = d;
	        left = right = null;
	    }
	}


	    Node root;

	    KthlargestelementinBST()
	    {
	        root = null;
	    }
	    
	    public void insert(int data)
	    {
	        this.root = this.insertRec(this.root, data);
	    }
	    
	    Node insertRec(Node node, int data)
	    {   
	        if (node == null) {
	            this.root = new Node(data);
	            return this.root;
	        }

	        if (data == node.data) {
	            return node;
	        }
	        
	        if (data < node.data) {
	            node.left = this.insertRec(node.left, data);
	        } else {
	            node.right = this.insertRec(node.right, data);
	        }
	        return node;
	    }

	    public class count {
	        int c = 0;
	    }

	    void kthLargestUtil(Node node, int k, count C)
	    {
	        if (node == null || C.c >= k)
	            return;
	        this.kthLargestUtil(node.right, k, C); 
	        
	        C.c++;
	        
	        if (C.c == k) {
	            System.out.println(k + "th largest element is " + 
	                                                 node.data);
	            return;
	        }
	        
	        this.kthLargestUtil(node.left, k, C); 
	    }

	    void kthLargest(int k)
	    {
	        count c = new count(); 
	        this.kthLargestUtil(this.root, k, c);
	    }
	    public static void main(String[] args)
	    {
	    	KthlargestelementinBST tree = new KthlargestelementinBST();
	        
	        tree.insert(50);
	        tree.insert(30);
	        tree.insert(20);
	        tree.insert(40);
	        tree.insert(70);
	        tree.insert(60);
	        tree.insert(80);

	        for (int i = 1; i <= 7; i++) {
	            tree.kthLargest(i);
	        }
	    }
	}


