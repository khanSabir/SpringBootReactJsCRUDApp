package com.ds.list;

public class LinkedList {
	
	Node head ;
	
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.add(10);
		linkedList.add(15);
		linkedList.add(11);
		linkedList.add(19);
		linkedList.add(12);
		linkedList.add(35);
		linkedList.add(89);
		
		linkedList.print();
		System.out.println("After Delete");
		linkedList.delete(15);
		linkedList.print();
		
		System.out.println("Reverse");
		linkedList.reverseList();
		linkedList.print();
	}

	private void reverseList() {
		Node previousNode = null;
		Node currentNode = head;
		Node nextNode = null;
		
		while(currentNode !=null) {
			nextNode = currentNode.next;
			currentNode.next = previousNode;	
			previousNode=currentNode;
			currentNode = nextNode;
		}
		
		head = previousNode;
		
	}

	private void delete(int data) {
		Node currentNode = head;
		Node previous = null;
		
		//If head has the key;
		if(currentNode != null && currentNode.data == data) {
			head = currentNode.next;
			currentNode = null;
			return;
		}
		
		//Search for the key to delete
		while(currentNode != null && currentNode.data !=data) {
			previous = currentNode;
			currentNode = currentNode.next;
		}
		
		//if Key was not present in the list
		if(currentNode == null) {
			return;
		}
		
		previous.next = currentNode.next;
		currentNode = null;
		
	}

	private void print() {
		Node current = head;
		if(head == null) {
			System.out.println("Empty List");
		}
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
