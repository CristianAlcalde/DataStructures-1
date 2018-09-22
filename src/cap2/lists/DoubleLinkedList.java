package cap2.lists;

import utils.Mp3;

public class DoubleLinkedList {

	private DoubleLinkedNode head; // Cabeza
	private DoubleLinkedNode tail; // Cola
	private DoubleLinkedNode Aux;

	public DoubleLinkedNode getAux() {
		return Aux;
	}

	public void setAux(DoubleLinkedNode aux) {
		Aux = aux;
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

	// CRUD

	public void insertail(String author, String file, String name, String trackNo) {
		
		DoubleLinkedNode nuevonodo = new DoubleLinkedNode(author, file, name, trackNo);
		
		if (this.head == null) {
			this.head = nuevonodo;
			this.tail = nuevonodo;
		} else {
			nuevonodo.setNext(head);
			head.setNext(nuevonodo);
			head = nuevonodo;
		}
		System.out.println(trackNo);

	}

	public void inserthead(String author, String file, String name, String trackNo) {

		DoubleLinkedNode nuevonodo = new DoubleLinkedNode(author, file, name, trackNo);

		if (this.head == null) {
			this.head = nuevonodo;
			this.tail = nuevonodo;
			this.Aux = nuevonodo;
		} else {

			nuevonodo.setNext(head);
			this.head.setPrev(nuevonodo);
			this.head = nuevonodo;
		}

		System.out.println(trackNo);

	}

	
}
