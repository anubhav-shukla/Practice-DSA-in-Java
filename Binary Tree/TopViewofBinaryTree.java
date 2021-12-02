package DSA;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.TreeMap;

class TopViewofBinaryTree {
	static class Node {
	    int data;
	    Node left, right;
	 
	    public Node(int data)
	    {
	        this.data = data;
	        left = right = null;
	    }
	}
    Node root;
 
    public TopViewofBinaryTree() { root = null; }
 
    private void TopView(Node root)
    {
        class QueueObj {
            Node node;
            int hd;
 
            QueueObj(Node node, int hd)
            {
                this.node = node;
                this.hd = hd;
            }
        }
        Queue<QueueObj> q = new LinkedList<QueueObj>();
        Map<Integer, Node> topViewMap
            = new TreeMap<Integer, Node>();
 
        if (root == null) {
            return;
        }
        else {
            q.add(new QueueObj(root, 0));
        }
 
        System.out.println(
            "The top view of the tree is : ");
 
        while (!q.isEmpty()) {
            QueueObj tmpNode = q.poll();
            if (!topViewMap.containsKey(tmpNode.hd)) {
                topViewMap.put(tmpNode.hd, tmpNode.node);
            }
 
            if (tmpNode.node.left != null) {
                q.add(new QueueObj(tmpNode.node.left,
                                   tmpNode.hd - 1));
            }
            if (tmpNode.node.right != null) {
                q.add(new QueueObj(tmpNode.node.right,
                                   tmpNode.hd + 1));
            }
        }
        for (Entry<Integer, Node> entry :
             topViewMap.entrySet()) {
            System.out.print(entry.getValue().data);
        }
    }
 
    public static void main(String[] args)
    {
        
    	TopViewofBinaryTree tree = new TopViewofBinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.right = new Node(4);
        tree.root.left.right.right = new Node(5);
        tree.root.left.right.right.right = new Node(6);
        System.out.println(
            "Following are nodes in top view of Binary Tree");
        tree.TopView(tree.root);
    }
}