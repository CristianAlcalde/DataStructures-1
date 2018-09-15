package cap1.arrays;

import Cap2.list.Node;
import Cap2.list.NodeDouble;

public class DoubleLinkedList {

	private NodeDouble head;
	private NodeDouble tail;
	private NodeDouble cursor; 
	
	// Creating cursor
	public NodeDouble getHead() {
		return head;
	}

	public void setHead(NodeDouble head) {
		this.head = head;
	}

	public NodeDouble getTail() {
		return tail;
	}

	public void setTail(NodeDouble tail) {
		this.tail = tail;
	}

	public NodeDouble getCursor() {
		return cursor;
	}

	public void setCursor(NodeDouble cursor) {
		cursor = cursor;
	}

	// CRUD
	public void insertaPorCola(String author, String file, String name, String trackNo) {

		// Step 1. create the new node
		NodeDouble newNode = new NodeDouble(author, file, name, trackNo);
		// If the head is null
		if (this.head == null) {
			// The new node is the head
			this.head = newNode;
			this.tail = newNode;
			this.cursor = newNode;
		} else {
			// The tail's next is newNode
			this.tail.setNext(newNode);
			this.tail.getNext().setPrevius(this.tail);
			// The new node is the tail
			this.tail = newNode;
			this.tail.setNext(null);
		}

	}

	public void insertaPorCabeza(String author, String file, String name, String trackNo) {

		// Step 1. create the new node
		NodeDouble newNode = new NodeDouble(author, file, name, trackNo);
		newNode.setPrevius(null);
		// If the head is null
		if (this.head == null) {
			// The new node is the head
			this.head = newNode;
			this.tail = newNode;
			this.cursor = newNode;
		} else {
			// The tail's next is newNode
			newNode.setNext(this.head);
			this.head.setPrevius(newNode);
			this.head = newNode;
		}

	}

}
