package cap2.lists;

import utils.Mp3;

public class DoubleLinkNode {
	private Mp3 dato;
	private DoubleLinkNode next;
	private DoubleLinkNode prev;
	
	public DoubleLinkNode(String author, String file, String name, String trackNo) {		
		this.dato = new Mp3(author, file, name, trackNo);
	}
		
	public Mp3 getDato() {
		return dato;
	}

	public void setDato(Mp3 dato) {
		this.dato = dato;
	}

	public DoubleLinkNode getNext() {
		return next;
	}

	public void setNext(DoubleLinkNode next) {
		this.next = next;
	}

	public DoubleLinkNode getPrev() {
		return prev;
	}

	public void setPrev(DoubleLinkNode prev) {
		this.prev = prev;
	}

}
