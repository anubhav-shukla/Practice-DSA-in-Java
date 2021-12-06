package DSA;

	public class DeleteNodeinaBST {
	    public static class TreeNode {
	        int data;
	        TreeNode left;
	        TreeNode right;
	 
	        TreeNode(int data) {
	            this.data = data;
	        }
	    }
	 
	    public static TreeNode minimumElement(TreeNode root) {
	        if (root.left == null)
	            return root;
	        else {
	            return minimumElement(root.left);
	        }
	    }
	 
	    public static TreeNode deleteNode(TreeNode root, int value) {
	        if (root == null)
	            return null;
	        if (root.data > value) {
	            root.left = deleteNode(root.left, value);
	        } else if (root.data < value) {
	            root.right = deleteNode(root.right, value);
	 
	        } else {
	            if (root.left != null && root.right != null) {
	                TreeNode temp = root;
	                TreeNode minNodeForRight = minimumElement(temp.right);
	                root.data = minNodeForRight.data;
	                root.right = deleteNode(root.right, minNodeForRight.data);
	 
	            }
	            else if (root.left != null) {
	                root = root.left;
	            }
	            else if (root.right != null) {
	                root = root.right;
	            }
	            else
	                root = null;
	        }
	        return root;
	    }
	 
	    public static TreeNode insert(TreeNode root, TreeNode nodeToBeInserted) {
	        if (root == null) {
	            root = nodeToBeInserted;
	            return root;
	        }
	 
	        if (root.data > nodeToBeInserted.data) {
	            if (root.left == null)
	                root.left = nodeToBeInserted;
	            else
	                insert(root.left, nodeToBeInserted);
	        } else if (root.data < nodeToBeInserted.data)
	            if (root.right == null)
	                root.right = nodeToBeInserted;
	            else
	                insert(root.right, nodeToBeInserted);
	        return root;
	    }
	 
	    public static void inOrder(TreeNode root) {
	        if (root == null)
	            return;
	        inOrder(root.left);
	        System.out.print(root.data + " ");
	        inOrder(root.right);
	    }
	 
	    public static void main(String[] args) {
	 
	        TreeNode rootNode = createBinarySearchTree();
	 
	        System.out.println("Binary tree:");
	        inOrder(rootNode);
	        System.out.println();
	        System.out.println("Deleting node 40 which have two children:");
	        TreeNode rootNodeRes = deleteNode(rootNode, 40);
	        inOrder(rootNodeRes);
	    }
	 
	    public static TreeNode createBinarySearchTree() {
	        TreeNode rootNode = new TreeNode(40);
	        TreeNode node20 = new TreeNode(20);
	        TreeNode node10 = new TreeNode(10);
	        TreeNode node30 = new TreeNode(30);
	        TreeNode node60 = new TreeNode(60);
	        TreeNode node50 = new TreeNode(50);
	        TreeNode node70 = new TreeNode(70);
	        TreeNode node5 = new TreeNode(5);
	        TreeNode node13 = new TreeNode(13);
	        TreeNode node55 = new TreeNode(55);
	 
	        insert(null, rootNode);
	        insert(rootNode, node20);
	        insert(rootNode, node10);
	        insert(rootNode, node30);
	        insert(rootNode, node60);
	        insert(rootNode, node50);
	        insert(rootNode, node70);
	        insert(rootNode, node5);
	        insert(rootNode, node13);
	        insert(rootNode, node55);
	        return rootNode;
	    }
	}
	 

