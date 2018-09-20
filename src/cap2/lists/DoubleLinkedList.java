package cap2.lists;

import utils.Mp3;

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
		// Step 1. create the new node
		DoubleLinkedNode newNode = new DoubleLinkedNode(author, file, name, trackNo);
		// If the head is null
		if (this.head == null) {
			this.head = newNode;
			this.tail = newNode;

		} else {
			compare1 = this.head;
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
				if (newNodeTrack > compare1Track
						&& newNodeTrack <= Integer.parseInt(compare1.getNext().getDato().getTrackNo())) {
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
	// Eliminar por nombre o por N° de track
	public boolean deleteByElement(String data) {
		// Creamos dos nodos temporales para recorrer los demas nodos
		boolean result = false;
		DoubleLinkedNode tmp = this.head;
		DoubleLinkedNode previous = null;
		// Mientras el siguiente del temporal no sea null
		while (tmp != null) {
			// Compare el dato del temporal con el dato de entrada
			if (tmp.getDato().getName().equals(data) || tmp.getDato().getTrackNo().equals(data)) {
				if(tmp == this.head) {
					this.head = this.head.getNext();
					tmp = null;
					result = true;
					this.size = this.size - 1;
				} else { previous.setNext(tmp.getNext());
						 tmp.getNext().setPrevious(previous);
						 tmp = null;
						 result = true;
						 this.size = this.size - 1;
				}
				// Si lo encuentra elimina todo el elemento
				
				
			}
			previous = tmp;
			if(tmp != null) {
			tmp = tmp.getNext();
			}
		}
		
		return result;
	}
	
	

}
