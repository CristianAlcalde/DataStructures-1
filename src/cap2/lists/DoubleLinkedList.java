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
	public void change(DoubleLinkedNode node, DoubleLinkedNode newNode) {
		DoubleLinkedNode nodeTemp = new DoubleLinkedNode();	
		if(Integer.parseInt(node.getDato().getTrackNo())>Integer.parseInt(newNode.getDato().getTrackNo())) {
			nodeTemp = node;
			node = newNode;
			newNode = nodeTemp;
		}
	}
	
	public void addOrdered(String author, String file, String name, String trackNo) {
		DoubleLinkedNode compare1;
		DoubleLinkedNode compare2;
		// Step 1. create the new node
		DoubleLinkedNode newNode = new DoubleLinkedNode(author, file, name, trackNo);
		// If the head is null
		if(this.head==null) {
			this.head = newNode;
			this.tail = newNode;
			
		} else {
			compare1 = head;
			while(compare1 != null) {
				
				compare2 = compare1.getNext();
				if(Integer.parseInt(newNode.getDato().getTrackNo())<=Integer.parseInt(compare1.getDato().getTrackNo())) {
					newNode.setNext(head);
					this.head = newNode;
				} else {
					if(Integer.parseInt(newNode.getDato().getTrackNo())>Integer.parseInt(compare1.getDato().getTrackNo()) && compare2 == null){
						compare1.setNext(newNode);
						this.tail = newNode;
					} else {
						if(Integer.parseInt(compare1.getDato().getTrackNo())<Integer.parseInt(newNode.getDato().getTrackNo()) && Integer.parseInt(compare2.getDato().getTrackNo())>=Integer.parseInt(newNode.getDato().getTrackNo())){
							compare1.setNext(newNode);
							newNode.setNext(compare2);
						}
						else {
							compare1 = compare1.getNext();
						}
					}
				}
				
			}
	
		}
		this.size = this.size + 1;	
	}

}
