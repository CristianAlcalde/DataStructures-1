package cap2;

public class DoubleLinkNode {
	MP3 Dato;
	private DoubleLinkNode next;
	private DoubleLinkNode prev;
	
	public DoubleLinkNode(String author, String file, String name, String trackNo) {		
		this.Dato = new MP3(author, file, name, trackNo);
	}
		
	public MP3 getDato() {
		return Dato;
	}

	public void setDato(MP3 dato) {
		this.Dato = dato;
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
