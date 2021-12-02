package DSA;
import java.util.*;


class ZigZagTreeTraversal {
	static class Node
	{
	int data;
	Node leftChild;
	Node rightChild;
	Node(int data)
	{
	 this.data = data; 
	}
	}

	Node rootNode;

void printZigZagTraversal() {
 
 if (rootNode == null) {
 return;
 }

 Stack<Node> currentLevel = new Stack<>();
 Stack<Node> nextLevel = new Stack<>();

 currentLevel.push(rootNode);
 boolean leftToRight = true;

 while (!currentLevel.isEmpty()) {

 Node node = currentLevel.pop();
 
 System.out.print(node.data + " ");

 if (leftToRight) {
     if (node.leftChild != null) {
     nextLevel.push(node.leftChild);
     }
     
     if (node.rightChild != null) {
     nextLevel.push(node.rightChild);
     }
 }
 else {
     if (node.rightChild != null) {
     nextLevel.push(node.rightChild);
     }
     
     if (node.leftChild != null) {
     nextLevel.push(node.leftChild);
     }
 }

 if (currentLevel.isEmpty()) {
     leftToRight = !leftToRight;
     Stack<Node> temp = currentLevel;
     currentLevel = nextLevel;
     nextLevel = temp;
 }
 }
}
public static void main(String[] args) 
{
	ZigZagTreeTraversal tree = new ZigZagTreeTraversal();
 tree.rootNode = new Node(1);
 tree.rootNode.leftChild = new Node(2);
 tree.rootNode.rightChild = new Node(3);
 tree.rootNode.leftChild.leftChild = new Node(7);
 tree.rootNode.leftChild.rightChild = new Node(6);
 tree.rootNode.rightChild.leftChild = new Node(5);
 tree.rootNode.rightChild.rightChild = new Node(4);

 System.out.println("ZigZag Order traversal of binary tree is");
 tree.printZigZagTraversal();
}
}
