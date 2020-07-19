/*Given a string only containing the following characters (, ), {, }, [, and ] return whether or not the opening and closing characters are in a valid order.

Ex: Given the following strings...

"(){}[]", return true
"(({[]}))", return true
"{(})", return false*/

package com.bracesvalidity;
class Stack
{
	char[] stack;
	int size;
	public Stack(int len)
	{
		stack = new char[len];
		size=0;
	}
	void push(char c)
	{
		stack[size++] = c;
	}
	char pop()
	{
				
		return stack[--size];
	}
}
public class BracesValidityMain {

	static void check(String str)
	{
		Stack s = new Stack(str.length());
		int temp = 0;
		for(int i =0 ;i <str.length();i++)
		{
			if(str.charAt(i) == '(' || str.charAt(i) == '{'  
					|| str.charAt(i) == '[')
				s.push(str.charAt(i));
			else if((str.charAt(i) == ')' && s.pop() != '(') || (str.charAt(i) == '}' && s.pop() != '{')  
					|| (str.charAt(i) == ']' && s.pop() != '['))
				{
				temp = 1;
				break;
				}
							
		}
		if(temp == 1)
			System.out.println("Invalid");
		else
			System.out.println("Valid");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "({)}{}[]";
		check(str);
	}

}
