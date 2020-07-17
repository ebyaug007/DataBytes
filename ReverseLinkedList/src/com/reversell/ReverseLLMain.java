package com.reversell;

import java.util.HashSet;

class Node
{
	Node next;
	int val;
	Node(int val){
		this.val = val;
		next = null;
	}
}
class LLAction
{
	Node head=null;
	Node tail=null;
	public void addnode(int val)
	{
		Node newnode = new Node(val);
		if(head == null)
			head = newnode;
		else 
			tail.next = newnode;
		tail = newnode;
	}
	public void display()
	{
		Node n = head;
		while (n != null)
		{
			System.out.print(n.val +" ");
			n = n.next;
		}
	}
	public void reverse()
	{
        Node prev = null; 
        Node current = head; 
        Node next = null; 
        while (current != null) { 
            next = current.next; 
            current.next = prev; 
            prev = current; 
            current = next; 
        } 
        head = prev; 
     
	}
}

public class ReverseLLMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LLAction ll = new LLAction();
		ll.addnode(1);
		ll.addnode(2);
		ll.addnode(3);
		ll.addnode(4);
		ll.addnode(5);
		ll.addnode(6);
		ll.display();
		ll.reverse();
		ll.display();


	}

}
