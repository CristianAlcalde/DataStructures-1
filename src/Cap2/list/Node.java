package Cap2.list;

import Utils.MP3;

public class Node {
	public Node(String author, String file, String name, Integer trackNo) {
		this.dato = new MP3(author, file, name, trackNo); 
	}
	private MP3 dato;
	private Node next;
	
	public MP3 getDato() {
		return dato;
	}
	public void setDato(MP3 dato) {
		this.dato = dato;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}

}
