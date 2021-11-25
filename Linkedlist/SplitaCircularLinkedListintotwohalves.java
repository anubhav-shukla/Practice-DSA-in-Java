package DSA;

public class SplitaCircularLinkedListintotwohalves {

	public static void main(String[] args) {  
		SplitaCircularLinkedListintotwohalves Obj = new SplitaCircularLinkedListintotwohalves();  
        Obj.add(10); 
        Obj.add(20);  
        Obj.add(30);
        Obj.add(40);  
        Obj.print();  
        Obj.split();
        Obj.print(list1);
        Obj.print(list2);
        } 
    public class Node{  
        int element;  
        Node next; 
        
        public Node(int element) {  
            this.element = element;  
        }  
    } 
    static Node list1, list2;
    public Node head = null;  
    public Node tail = null;
    public void print() {  
        Node current = head;    
        if(head == null) {  
            System.out.println("Empty List");  
        }  
        else {  
            System.out.println("Circular Linked List is");  
            do{     
                //Prints each node by incrementing pointer.  
                System.out.print(" "+ current.element);  
                current = current.next;  
            }while(current != head);  
                        System.out.println();  
                    }  
                }
                public void print(Node head) {  
        Node current = head;    
        if(head == null) {  
            System.out.println("Empty List");  
        }  
        else {  
            System.out.println("Circular Linked List is");  
            do{     
                //Prints each node by incrementing pointer.  
                System.out.print(" "+ current.element);  
                current = current.next;  
            }while(current != head);  
                        System.out.println();  
                    }  
                }
                
    public void add(int element){  
        Node newNode = new Node(element);  
        if(head == null) {   //For a empty list
            head = newNode;  
            tail = newNode;  //For a empty list tail and head both will have the refernce to the new node
            newNode.next = head;  
            }  
        else {  
            tail.next = newNode;  //tail will have the reference to the new node.
            tail = newNode;  //New node will become new tail.
            tail.next = head;  //In circular linked list tail will alaways point to head.
        }  
    }
    public void split() { 
        Node l1 = head; 
        Node l2 = head;
        for (int i=0 ; l2.next != head && l2.next.next != head ; i++) { 
            l2 = l2.next.next; 
            l1 = l1.next; 
        } 
        if (l2.next.next == head) { 
            l2 = l2.next; 
        } 
        list1 = head; 
        
        if (head.next != head) { 
            list2 = l1.next; 
        }
        l2.next = l1.next; 
        l1.next = head; 
    } 
}