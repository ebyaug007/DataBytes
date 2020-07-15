/*Given a linked list, containing unique numbers, return whether or not it has a cycle.
Note: a cycle is a circular arrangement (i.e. one node points back to a previous node)

Ex: Given the following linked lists...

1->2->3->1 -> true (3 points back to 1)
1->2->3 -> false
1->1 true (1 points to itself)*/

package com.linkedlistcircle;

class Node
{
	Node next;
	int val;
	public Node(int val)
	{
		this.val = val;
		next = null;
	}
}
class LinkedListActions
{
	Node head =null;
	Node tail =null;
	
	public void addNode(Node n)
	{
		if(head == null)
			head = n;
		else
			tail.next = n;
		tail = n;
	}
	public void display()
	{
		Node n = head;
		while(n != null)
		{
			System.out.print(n.val +" ");
			n = n.next;
		}
	}
	public void detectloop()
	{
		Node slow_p = head, fast_p = head;
		int flag = 0; 
        while (slow_p != null && fast_p != null && fast_p.next != null) { 
            slow_p = slow_p.next; 
            fast_p = fast_p.next.next; 
            if (slow_p == fast_p) { 
                flag = 1; 
                break; 
            } 
        } 
        if (flag == 1) 
            System.out.println("Loop found"); 
        else
            System.out.println("Loop not found"); 
	}
}

public class LinkedListCircleMain {

	public static void main(String[] args) {
		Node n1 = new Node(10);
		Node n2 = new Node(12);
		Node n3 = new Node(13);
		Node n4 = new Node(14);
		LinkedListActions ll = new LinkedListActions();
		ll.addNode(n1);
		ll.addNode(n2);
		ll.addNode(n3);
		ll.addNode(n4);
		ll.display();
		
		/*Create loop for testing */
        //ll.head.next.next.next.next = ll.head;
        
        ll.detectloop();
	}
}
