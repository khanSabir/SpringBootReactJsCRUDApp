package com.dsa.tree;

public class LinkedList {
	
	Node head ;
	
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.add(10);
		linkedList.add(15);
		linkedList.add(11);
		linkedList.add(9);
		
		linkedList.print();
		System.out.println("After Delete");
		linkedList.delete(15);
		linkedList.print();
	}

	private void delete(int data) {
		Node currentNode = head;
		if(head.data == data) {
			head = head.next;
			return;
		}
		Node previous = null;
		while(currentNode.next != null && currentNode.data != data) {
			previous = currentNode;
			currentNode = currentNode.next;
		}
		
		if(currentNode.data == data) {
			previous.next = currentNode.next;
		}
		
	}

	private void print() {
		if(head == null) {
			System.out.println("Empty List");
		}
		Node current = head;
		while(current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}

	private void add(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		Node currentNode = head;
		while(currentNode.next != null) {
			currentNode = currentNode.next;
		}
		currentNode.next = newNode;			
	}

}

class Node{
	int data;
	Node next;
	
	public Node(int data) {
		this.data = data;
	}
	
}
