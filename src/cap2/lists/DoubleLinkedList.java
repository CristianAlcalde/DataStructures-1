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

	public void addOrdered(String author, String file, String name, String trackNo) {
		DoubleLinkedNode compare1;
		DoubleLinkedNode compare2;
		// Step 1. create the new node
		DoubleLinkedNode newNode = new DoubleLinkedNode(author, file, name, trackNo);
		// If the head is null
		if (this.head == null) {
			this.head = newNode;
			this.tail = newNode;

		} else {
			compare1 = this.head;
	

				compare2 = compare1.getNext();
				Integer newNodeTrack = Integer.parseInt(newNode.getDato().getTrackNo());
				Integer compare1Track = Integer.parseInt(compare1.getDato().getTrackNo());

				if (newNodeTrack <= compare1Track) {
					newNode.setNext(compare1);
					compare1.setPrevious(newNode);
					this.head = newNode;

				} 
					if (newNodeTrack > compare1Track && compare1.getNext() == null) {
						newNode.setPrevious(compare1);
						compare1.setNext(newNode);
						this.tail = newNode;
						this.head = compare1;
					}
					while (compare1 != null) {
						if (newNodeTrack > compare1Track && newNodeTrack <= Integer.parseInt(compare1.getNext().getDato().getTrackNo())) {
							newNode.setNext(compare1.getNext());
							newNode.setPrevious(compare1);
							compare1.setNext(newNode);
							compare1.getNext().setPrevious(newNode);
							compare1 = null;
						} else {
						compare1 = compare1.getNext();
						}
		
						}
		}
		this.size = this.size + 1;
	}

}
