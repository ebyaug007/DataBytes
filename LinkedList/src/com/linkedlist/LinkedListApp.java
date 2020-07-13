package com.linkedlist;

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

class LinkedlistFunctions
{

	Node head = null;
	Node tail = null;
	
	public void addNode(Node newnode)
	{
	
		if(head == null)
		{
			head = newnode;
			tail = newnode;
		}
		else
		{
			tail.next = newnode;
			tail = newnode;
			
		}
		
	}
	public void display() {    
        //Node current will point to head    
        Node current = head;    
            
        if(head == null) {    
            System.out.println("List is empty");    
            return;    
        }    
        System.out.println("Nodes of singly linked list: ");    
        while(current != null) {    
            //Prints each node by incrementing pointer    
            System.out.print(current.val + " ");    
            current = current.next;    
        }    
        System.out.println();    
    }    
}

public class LinkedListApp {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		LinkedlistFunctions ll = new LinkedlistFunctions();
		ll.addNode(n1);
		ll.addNode(n2);
		ll.display();

	}

}
