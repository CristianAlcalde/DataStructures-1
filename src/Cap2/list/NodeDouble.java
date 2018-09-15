package Cap2.list;

//bpublic class NodeDouble {
import Utils.MP3;

public class NodeDouble {
	private MP3 dato;
	private NodeDouble next;
	private NodeDouble previus;

	public NodeDouble(String author, String file, String name, String trackNo) {
		this.dato = new MP3(author, file, name, trackNo);
	}

	public MP3 getDato() {
		return dato;
	}

	public void setDato(MP3 dato) {
		this.dato = dato;
	}

	public NodeDouble getNext() {
		return next;
	}

	public void setNext(NodeDouble newNode) {
		this.next = newNode;
	}

	public NodeDouble getPrevius() {
		return previus;
	}

	public void setPrevius(NodeDouble tail) {
		this.previus = tail;
	}

}
