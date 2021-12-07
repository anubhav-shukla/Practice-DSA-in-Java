package DSA;
import java.util.*;
public class FlattenBSTtosortedlist {
	

	  
	static class node
	{
	  int data;
	  node left;
	  node right;
	    
	  node(int data)
	  {
	    this.data = data;
	    left = null;
	    right = null;
	  }
	};
	  
	static void print(node parent)
	{
	  node curr = parent;
	  while (curr != null)
	  {
	    System.out.print(curr.data + " ");
	    curr = curr.right;
	  }
	}
	  
	static  node prev;
	    
	static void Inorder(node curr)
	{
	  if (curr == null)
	    return;
	  Inorder(curr.left);
	  prev.left = null;
	  prev.right = curr;
	  prev = curr;
	  Inorder(curr.right);
	}
	  
	static node flatten(node parent)
	{
	  node dummy = new node(-1);
	  
	  prev = dummy;
	  
	  Inorder(parent);
	  
	  prev.left = null;
	  prev.right = null;
	  node ret = dummy.right;
	  
	  return ret;
	}
	  
	public static void main(String[] args)
	{
	  node root = new node(5);
	  root.left = new node(3);
	  root.right = new node(7);
	  root.left.left = new node(2);
	  root.left.right = new node(4);
	  root.right.left = new node(6);
	  root.right.right = new node(8);

	  print(flatten(root));
	}
	
}
