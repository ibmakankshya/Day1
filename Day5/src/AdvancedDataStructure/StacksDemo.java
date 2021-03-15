package AdvancedDataStructure;

import java.util.Stack;
public class StacksDemo {

	public static void main(String[] args) {
		Stack<String> stacks = new Stack<String>();
		stacks.push("Mongols");
		stacks.push("Aurangzeb");
		System.out.println(stacks);
		stacks.pop();
		System.out.println(stacks); //bracket matching, compiler checking
		
	}

}
