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
			compare1 = head;
			while (compare1 != null) {

				compare2 = compare1.getNext();
				Integer newNodeTrack = Integer.parseInt(newNode.getDato().getTrackNo());
				Integer compare1Track = Integer.parseInt(compare1.getDato().getTrackNo());
				Integer compare2Track = Integer.parseInt(compare2.getDato().getTrackNo());
				if (newNodeTrack <= compare1Track) {
					newNode.setNext(compare1);
					compare1.setPrevious(newNode);
					this.head = newNode;

				} else {
					if (newNodeTrack > compare1Track && compare2==null) {
						compare1.setNext(newNode);
						this.tail = newNode;
						this.tail.setPrevious(compare1);
					} else {
						if (compare1Track < newNodeTrack && compare2Track >= newNodeTrack) {
							compare1.setNext(newNode);
							newNode.setNext(compare2);
							compare2.setPrevious(newNode);
							newNode.setPrevious(compare1);
						} else {
							compare1 = compare1.getNext();
						}
					}
				}

			}

		}
		this.size = this.size + 1;
	}

}
