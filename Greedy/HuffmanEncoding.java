package DSA;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Comparator;

public class HuffmanEncoding {
	

	    int data;
	    char c;

	    HuffmanEncoding left;
	    HuffmanEncoding right;
	}
	class MyComparator implements Comparator<HuffmanEncoding> {
	    public int compare(HuffmanEncoding x, HuffmanEncoding y)
	    {

	        return x.data - y.data;
	    }
	
	    public static void printCode(HuffmanEncoding root, String s)
	    {
	        if (root.left
	                == null
	            && root.right
	                   == null
	            && Character.isLetter(root.c)) {

	            // c is the character in the node
	            System.out.println(root.c + ":" + s);

	            return;
	        }
	        printCode(root.left, s + "0");
	        printCode(root.right, s + "1");
	    }

	    public static void main(String[] args)
	    {

	        Scanner s = new Scanner(System.in);
	        int n = 6;
	        char[] charArray = { 'a', 'b', 'c', 'd', 'e', 'f' };
	        int[] charfreq = { 5, 9, 12, 13, 16, 45 };

	        PriorityQueue<HuffmanEncoding> q
	            = new PriorityQueue<HuffmanEncoding>(n, new MyComparator());

	        for (int i = 0; i < n; i++) {

	        	HuffmanEncoding hn = new HuffmanEncoding();

	            hn.c = charArray[i];
	            hn.data = charfreq[i];

	            hn.left = null;
	            hn.right = null;

	            q.add(hn);
	        }
	        HuffmanEncoding root = null;

	        while (q.size() > 1) {
	        	HuffmanEncoding x = q.peek();
	            q.poll();
	            HuffmanEncoding y = q.peek();
	            q.poll();

	            HuffmanEncoding f = new HuffmanEncoding();

	            f.data = x.data + y.data;
	            f.c = '-';

	            f.left = x;
	            f.right = y;
	            root = f;

	            q.add(f);
	        }
	        printCode(root, "");
	    }
	}

