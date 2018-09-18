package cap2.list;

import utils.Mp3;
//Step 1 Create the attributes 
public class DoubleLinkNode {
	private Mp3 dato;				//Date tipe Mp3
	private DoubleLinkNode next;	//Node next
	private DoubleLinkNode prev;	//Node Prev
//Step 2 Encapsulate the attributes
	public DoubleLinkNode (String author, String file, String name, String trackNo ) { 
		this.dato = new Mp3 (author, file, name, trackNo);  //
	}
//Step 3 Generate getters and setters
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
