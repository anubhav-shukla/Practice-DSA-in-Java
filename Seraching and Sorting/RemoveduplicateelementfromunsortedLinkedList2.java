package DSA;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;


//class Node {
//	int data;
//	Node next;
//	Node(int d) {data = d; next = null; }
//	
//}

public class RemoveduplicateelementfromunsortedLinkedList2 {
Node head;
Node tail;
public void addToTheLast(Node node) {
	if(head == null) {
		head = node;
		tail = node;
		
	}
	else {
		tail.next = node;
		tail = node;
		
	}
}
	void printList() {
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.data+ " ");
			temp = temp.next;
		}
		System.out.println();
	}
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0) {
			int n=sc.nextInt();
			RemoveduplicateelementfromunsortedLinkedList2 llist= new RemoveduplicateelementfromunsortedLinkedList2();
			int a1 = sc.nextInt();
			Node head = new Node(a1);
			llist.addToTheLast(head);
			for (int i=1; i<n; i++) {
				int a = sc.nextInt();
				llist.addToTheLast(new Node(a));
			}
			
			RDFL g = new RDFL();
			llist.head = g.removeDuplicates(llist.head);
			llist.printList();
			
			t--;
		}
	}
}
class Solution
{
    //Function to remove duplicates from unsorted linked list.
   public Node removeDuplicates(Node head) 
   {
        
      HashSet<Integer> hs = new LinkedHashSet<>();
      Node curr = head;
      while(curr!=null)
      {
          hs.add(curr.data);
          curr = curr.next;
      }
     Iterator itr = hs.iterator();
     while(itr.hasNext())
     {
        System.out.print(itr.next()+" ");
     
     }
     return curr;
      
   }
}

