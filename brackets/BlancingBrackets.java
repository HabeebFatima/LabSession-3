package com.gl.brackets;

import java.util.Stack;

public class BlancingBrackets {

	
	static boolean checkingBracketsBalanced(String strBalanceBrackts)
	{
		Stack<Character> stack = new Stack<Character>();
		
		for(int i=0; i<strBalanceBrackts.length();i++)
		{
			char character= strBalanceBrackts.charAt(i);
			if(character == '{' || character=='[' || character=='(')
			{
				stack.push(character);
				continue;
			}
			if(stack.empty())
				return false;
			
			char c;
			switch(character)
			{
			case '}':
				c=stack.pop();
				if(c=='(' || c=='[')
					return false;
				break;
				
			case  ')':
				c=stack.pop();
				if (c=='[' || c=='{')
					return false;
					break;
					
			case ']' :
				c=stack.pop();
				if (c=='(' || c=='{')
					return false;
					break;
				
			}
			
			
		}
		return stack.isEmpty();
	}
	
	public static void main(String args[]) 
	{
		String strBracksExpression1="([[{}]])";
		String strBracksExpression2="([[{}]]))";
		Boolean result1;
		Boolean result2;
		//Checking Sample Input 1
		result1 = checkingBracketsBalanced(strBracksExpression1);
		if(result1 == true)
			System.out.println(" Test Sample 1 is balanced");
		else
			System.out.println(" Test Sample 1 not balanced");
		
	//	Checking Sample Input 2
		result2 = checkingBracketsBalanced(strBracksExpression2);
		if(result2 == true)
			System.out.println(" Test Sample 2 is balanced");
		else
			System.out.println(" Test Sample 2 not balanced");
		
	}
	
	
	
	
	
}
