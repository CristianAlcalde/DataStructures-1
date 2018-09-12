package cap2.arrays;

public class DoubleLinkedList {
	private DoubleLinkNode head;
	private DoubleLinkNode tail;
	private DoubleLinkNode cursor;
	
	//Encapsulate the required fields	
	public DoubleLinkNode getHead() {
		return head;
	}
	public void setHead(DoubleLinkNode head) {
		this.head = head;
	}
	public DoubleLinkNode getTail() {
		return tail;
	}
	public void setTail(DoubleLinkNode tail) {
		this.tail = tail;
	}
	public DoubleLinkNode getCursor() {
		return cursor;
	}
	public void setCursor(DoubleLinkNode cursor) {
		this.cursor = cursor;
	}
	
	//CRUD	
	public void insertaPorCola(String author, String file, String name, String trackNo) {

		// Step 1. create the new node
		DoubleLinkNode newNode = new DoubleLinkNode(author, file, name, trackNo);
		// If the head is null
		if (this.head == null) {
			// The new node is the head
			this.head = newNode;
			this.tail = newNode;
			this.cursor=newNode;
		} else {
			// The tail's next is newNode
			this.tail.setNext(newNode);
			this.tail.getNext().setPrev(this.tail);
			// The new node is the tail
			this.tail = newNode;
			this.tail.setNext(null);
		}
		
	}
	
	public void insertaPorCabeza(String author, String file, String name, String trackNo) {

		// Step 1. create the new node
		DoubleLinkNode newNode = new DoubleLinkNode(author, file, name, trackNo);
		newNode.setPrev(null);
		// If the head is null
		if (this.head == null) {
			// The new node is the head
			this.head = newNode;
			this.tail = newNode;
			this.cursor=newNode;
		} else {
			// The tail's next is newNode
			newNode.setNext(this.head);
			this.head.setPrev(newNode);
			this.head = newNode;
		}
		
	}
	
}
