/*Given a string s containing only lowercase letters, continuously remove adjacent characters that are the same and return the result.

Ex: Given the following strings...

s = "abccba", return ""
s = "foobar", return "fbar"
s = "abccbefggfe", return "a"*/
package com.removesamepack;



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
			System.out.print(val[i]);
	}
	public char peek()
	{
		if(size>0)
			return val[size-1];
		else
			return 0;
	}

}

public class RemoveSameMain {

	public static void remove(String s)
	{
		Stack st = new Stack(s.length());
		for(int i =0;i<s.length();i++)
		{
			if(st.peek()==s.charAt(i))
				st.pop();
			else
				st.push(s.charAt(i));
		}
		st.travese();
				
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abccbefggfe";
		remove(s);

	}

}
