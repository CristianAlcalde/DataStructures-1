package cap2.list;

import utils.Mp3;

//Step 1 create the attributes
public class DoubleLinkedList {
	private Mp3 dato;
	private DoubleLinkNode head;
	private DoubleLinkNode tail;
	private DoubleLinkNode cursor;
//Step 2.1 create the constructor

	public DoubleLinkedList() {
		head = null;
		tail = null;
	}

//Step 2 encapsulate the attributes
	public Mp3 getDato() {
		return dato;
	}

	public void setDato(Mp3 dato) {
		this.dato = dato;
	}

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
}
