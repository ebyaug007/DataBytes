/*Given two strings s and t, which represents a sequence of keystrokes, where # denotes a backspace, return whether or not the sequences produce the same result.

Ex: Given the following strings...

s = "ABC#", t = "CD##AB", return true
s = "como#pur#ter", t = "computer", return true
s = "cof#dim#ng", t = "code", return false*/
package com.keystroke;

class Stack
{
	int size;
	char[] val;
	public Stack(int size)
	{
		this.size = 0;
		val = new char[size];
	}
	public void push(char c)
	{
		val[size++] = c;
	}
	public void pop()
	{
		val[--size] = '\0';
	}
	public void travese() {
		for(int i = 0;i<size;i++)
			System.out.println(val[i]);
	}
	public boolean equals(Stack s)
	{
		if(s == this)
			return true;
		if(!(s instanceof Stack))
			return false;
		if(this.size != s.size)
			return false;
		for(int i =0;i<size;i++)
		{
			if(this.val[i] != s.val[i])
				return false;
		}
		
		return true;
	}
}

public class KeyStrokeMain {
	
	public static void checkKeys(String s, String t)
	{
		Stack s1 = new Stack(s.length());
		Stack s2 = new Stack(t.length());
		for(int i = 0; i<s.length();i++)
		{
			if(s.charAt(i)=='#')
				s1.pop();
			else
				s1.push(s.charAt(i));
		}
		for(int i = 0; i<t.length();i++)
		{
			if(t.charAt(i)=='#')
				s2.pop();
			else
				s2.push(t.charAt(i));
		}

		if(s1.equals(s2))
			System.out.println("Equals");
		else
			System.out.println("Not equal");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "como#pur#ter", t = "computer";
		checkKeys(s, t);

	}

}
