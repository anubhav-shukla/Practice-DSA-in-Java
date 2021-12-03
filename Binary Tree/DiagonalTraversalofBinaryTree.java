package DSA;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.Vector;
 
public class DiagonalTraversalofBinaryTree
{
    static class Node
    {
        int data;
        Node left;
        Node right;
         
        Node(int data)
        {
            this.data=data;
            left = null;
            right =null;
        }
    }
     
    static void diagonalPrintUtil(Node root,int d,
          TreeMap<Integer,Vector<Integer>> diagonalPrint)
    {
         
        if (root == null)
            return;
        Vector<Integer> k = diagonalPrint.get(d);
         
        if (k == null)
        {
            k = new Vector<>();
            k.add(root.data);
        }
        else
        {
            k.add(root.data);
        }
        diagonalPrint.put(d,k);
      
        diagonalPrintUtil(root.left,
                         d + 1, diagonalPrint);
          
        diagonalPrintUtil(root.right,
                          d, diagonalPrint);
    }
    
    static void diagonalPrint(Node root)
    {
         
        TreeMap<Integer,Vector<Integer>>
             diagonalPrint = new TreeMap<>();
        diagonalPrintUtil(root, 0, diagonalPrint);
         
        System.out.println("Diagonal Traversal of Binary Tree");
        for (Entry<Integer, Vector<Integer>> entry :
                          diagonalPrint.entrySet())
        {
            System.out.println(entry.getValue());
        }
    }
     
    public static void main(String[] args)
    {
         
        Node root = new Node(8);
        root.left = new Node(3);
        root.right = new Node(10);
        root.left.left = new Node(1);
        root.left.right = new Node(6);
        root.right.right = new Node(14);
        root.right.right.left = new Node(13);
        root.left.right.left = new Node(4);
        root.left.right.right = new Node(7);
         
        diagonalPrint(root);
    }
}