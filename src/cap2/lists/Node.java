package cap2.lists;

import utils.Mp3;

public class Node {

	private Mp3 dato;
	private Node next;

	public Node() {
	}

	public Node(String author, String file, String name, String trackNo) {
		this.dato = new Mp3(author, file, name, trackNo);
	}

	public Mp3 getDato() {
		return dato;
	}

	public void setDato(Mp3 dato2) {
		this.dato = dato2;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}
