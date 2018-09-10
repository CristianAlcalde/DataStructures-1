package cap2.lists;

public class LinkedList {

	private Node head; // Cabeza
	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public Node getTail() {
		return tail;
	}

	public void setTail(Node tail) {
		this.tail = tail;
	}

	private Node tail; // Cola
	private int size = 0;

	//Encapsulate the required fields
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	// Crud
	public void add(String author, String file, String name, String trackNo) {

		// Step 1. create the new node
		Node newNode = new Node(author, file, name, trackNo);
		// If the head is null
		if (this.head == null) {
			// The new node is the head
			this.head = newNode;
			this.tail = newNode;
		} else {
			// The tail's next is newNode
			this.tail.setNext(newNode);
			// The new node is the tail
			this.tail = newNode;
		}
		this.size = this.size + 1;
	}
	
}