package DSA;

public class Add1toanumberrepresentedaslinkedlist {
	static class Node
    {
        int data;
        Node next;
    }
  
    static Node newNode(int data) 
    {
        Node new_node = new Node();
        new_node.data = data;
        new_node.next = null;
        return new_node;
    }
    static int addWithCarry(Node head)
    {
        if (head == null)
            return 1;
        int res = head.data + addWithCarry(head.next);
        head.data = (res) % 10;
        return (res) / 10;
    }
    static Node addOne(Node head)
    {
        int carry = addWithCarry(head);
        if (carry > 0)
        {
            Node newNode = newNode(carry);
            newNode.next = head;
            return newNode;  }
  
        return head;
    }
    static void printList(Node node)
    {
        while (node != null)
        {
            System.out.print(node.data);
            node = node.next;
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        Node head = newNode(1);
        head.next = newNode(9);
        head.next.next = newNode(9);
        head.next.next.next = newNode(9);
  
        System.out.print("List is ");
        printList(head);
  
        head = addOne(head);
        System.out.println();
        System.out.print("Resultant list is ");
        printList(head);
    }
}
