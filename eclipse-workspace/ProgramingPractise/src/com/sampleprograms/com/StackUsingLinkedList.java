package com.sampleprograms.com;

public class StackUsingLinkedList {
	private Node head = null;
	int size = 0;

	public void push(int data) {
		Node node = new Node(data);
		if (getSize() == 0) {
			head = node;
		} else {
			// add the Node at the start of the Linked List
			node.next = head;
			head = node;
		}

		System.out.println("Element " + node.data + " is pushed into the Stack");
		size++;
	}
	
	public int pop() {
		if(getSize() == 0) {
			System.out.println("Stack is empty");
			return -1;
		} else {
			Node temp = head;
			head = head.next;
			size--;
			return temp.data;
		}
	}

	public void printStack() {
		Node curr = head;
		System.out.print("Elements in Stack: ");
		while(curr != null) {
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
		System.out.println();
	}
	
	private int getSize() {
		return size;
	}
	
	public static void main(String[] args) {
		StackUsingLinkedList stack = new StackUsingLinkedList();
		stack.push(1);
		stack.push(2);
		stack.push(4);
		stack.printStack();
		System.out.println("POP out elementg from Stack : "+ stack.pop());
		stack.printStack();
	}
	

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			next = null;
		}
	}
}
