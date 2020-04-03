package com.sampleprograms.com;

public class FindNthNodeFromEndOfLinkedList {

	/*
	 * Recursive solution for getting n'th node from the last of Linked List.
	 */
	public int kthByRecursion(Node head, int k) {
		if (head == null) {
			return 0;
		}
		int i = kthByRecursion(head.next, k) + 1;
		if (i == k) {
			System.out.println(k+"'th element from end is : "+head.data);
		}
		return i;
	}

	/*
	 * Iterative solution to get n'th node form the last of Linked List
	 */
	public int kthByIteration(Node head, int k) {
		if (head == null) {
			return 0;
		}
		Node curr = head;
		while (k > 0) {
			curr = curr.next;
			k--;
		}
		Node sec = head;
		while (curr != null) {
			curr = curr.next;
			sec = sec.next;
		}
		int i = sec.data;
		return i;
	}

	public static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			next = null;
		}
	}

	public void display(Node head) {
		Node n = head;
		while (n != null) {
			System.out.print("->" + n.data);
			n = n.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Node node = new Node(1);
		node.next = new Node(2);
		node.next.next = new Node(8);
		node.next.next.next = new Node(3);
		node.next.next.next.next = new Node(7);
		node.next.next.next.next.next = new Node(0);
		node.next.next.next.next.next.next = new Node(4);
		System.out.println("Original List: ");
		FindNthNodeFromEndOfLinkedList findNode = new FindNthNodeFromEndOfLinkedList();
		findNode.display(node);
		System.out.println("Recirsive Approach, find 3rd element from the end is : "+ findNode.kthByRecursion(node, 3));
		
		System.out.println("Iterative Approach, find 5th element from last of Linked List: "+ findNode.kthByIteration(node, 5));
	}
}
