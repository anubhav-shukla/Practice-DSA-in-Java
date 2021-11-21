package DSA;

import java.util.Scanner;


class Node {
	int data;
	Node next;
	Node(int d) {data = d; next = null; }
	
}

public class RemoveduplicateelementfromsortedLinkedList {
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
			RemoveduplicateelementfromsortedLinkedList llist= new RemoveduplicateelementfromsortedLinkedList();
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

class RDFL {
	Node removeDuplicates(Node head) {
		Node temp = head;
		Node uniq = temp;
		Node fast = temp.next;
		
		while(fast != null) {
			if(uniq.data == fast.data) {
				fast = fast.next;
			}
			
			else {
				uniq.next = fast;
				uniq = uniq.next;
				fast = fast.next;
				
			}
		}
		
		uniq.next = fast;
		head = temp;
		
		return head;
	}
}