package com.linkedlistcircularnode;

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
	public void iscircular()
	{
		Node s_ptr = head, f_ptr = head;
		int flag = 0;
		while(s_ptr != null && f_ptr != null && f_ptr.next != null )
		{
			s_ptr = s_ptr.next;
			f_ptr = f_ptr.next.next;
			if(s_ptr == f_ptr)
			{
				flag = 1;
				break;
			}
		}
		if(flag==1)
			System.out.println("is circular");
		else
			System.out.println("Is not circular");
	}
	public void detectloopnode()
	{
		HashSet<Node> h = new HashSet<Node>();
		Node n = head;
		while(n != null)
		{
			if(h.contains(n))
			{
				System.out.println("Looped at "+ n.val);
				break;
			}
			else
			{
				h.add(n);
				n = n.next;
			}
			}
	}
}
public class LinkedListNode {

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
		System.out.println(ll.head.next.next.next.next.val);
		ll.head.next.next.next.next = ll.head.next;
		ll.iscircular();
		ll.detectloopnode();

	}

}
