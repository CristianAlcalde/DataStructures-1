package cap2.lists;

public class DoubleLinkedList {
	
	private DoubleLinkedNode head; // Cabeza
	private DoubleLinkedNode tail; // Cola
	private int size = 0;
	
	// Encapsulate the required fields
	public int getSize() {
		return size;
	}
	public DoubleLinkedNode getHead() {
		return head;
	}
	public void setHead(DoubleLinkedNode head) {
		this.head = head;
	}
	public DoubleLinkedNode getTail() {
		return tail;
	}
	public void setTail(DoubleLinkedNode tail) {
		this.tail = tail;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	// CRUD
	public void add(String author, String file, String name, String trackNo) {
		
		// Step 1. create the new node
		DoubleLinkedNode newNode = new DoubleLinkedNode(author, file, name, trackNo);
		// If the head is null
		if(this.head==null) {
			this.head = newNode;
			this.tail = newNode;
			
		} else {
			this.tail.setNext(newNode);
			newNode.setPrevious(tail);
			this.tail = newNode;
		}
		this.size = this.size + 1;
	}

}
