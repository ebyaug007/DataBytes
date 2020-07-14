/*Given a non-empty linked list, return the middle node of the list. If the linked list contains an even number of elements, return the node closer to the end.


1->2->3->null, return 2
1->2->3->4->null, return 3
1->null, return 1*/

/*Hint: Traverse linked list using two pointers. 
Move one pointer by one and other pointer by two. 
When the fast pointer reaches end slow pointer will reach 
middle of the linked list.*/

package com.linkedlistmid;

class Node
{
	Node next;
	int val;
	Node(int val)
	{
		this.val =val;
		next = null;
	}
}
class LLFunc
{
	Node head = null;
	Node tail = null;
	
	public  void addNode(Node n)
	{
		if(head == null)
		{
			head = n;
			tail = n;
		}
		else
		{
			tail.next = n;
			tail = n;
		}
	}
	
	public  void display()
	{
		Node abc = head;
		while(abc!=null)
		{
			System.out.println(abc.val);
			abc = abc.next;
		}
	}
	    /* Function to print middle of linked list */
    void printMiddle() 
    { 
        Node slow_ptr = head; 
        Node fast_ptr = head; 
        if (head != null) 
        { 
            while (fast_ptr != null && fast_ptr.next != null) 
            { 
                fast_ptr = fast_ptr.next.next; 
                slow_ptr = slow_ptr.next; 
            } 
            System.out.println("The middle element is [" + 
                                slow_ptr.val + "] \n"); 
        } 
    }
}

public class LinkedListMid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		LLFunc ll = new LLFunc();
		ll.addNode(n1);
		ll.addNode(n2);
		ll.addNode(n3);
		ll.addNode(n4);
		ll.display();
		ll.printMiddle();

	}

}
