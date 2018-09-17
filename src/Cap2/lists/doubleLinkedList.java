package Cap2.lists;

import utils.Mp3;

public class doubleLinkedList {

	// creacion de la cabeza y cola, el punto de inicio y fin de la lista
	private int size = 0;
	private doubleLinkedListNode head;// cabeza
	private doubleLinkedListNode tail;// cola

	// CONTRCTOR
	public doubleLinkedList() {
	}

	// ENCAPSULADO
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public doubleLinkedListNode getHead() {
		return head;
	}

	public void setHead(doubleLinkedListNode head) {
		this.head = head;
	}

	public doubleLinkedListNode getTail() {
		return tail;
	}

	public void setTail(doubleLinkedListNode tail) {
		this.tail = tail;
	}

	// CRUD
	/*// insertar ordenado
	public void addOrder(String author, String file, String name, int trackNo) {
		doubleLinkedListNode newNode = new doubleLinkedListNode(author, file, name, trackNo);
		if (this.head == null) {
			this.head = newNode;
			this.tail = newNode;
		} else {
			this.tail.setNext(newNode);
			this.tail = newNode;
		}
		this.size = this.size + 1;
	}

	}*/
	public void addOrder(String author, String file, String name, int trackNo) {
		doubleLinkedListNode recorre=this.head;
		doubleLinkedListNode ant;
		doubleLinkedListNode newNode = new doubleLinkedListNode(author, file, name, trackNo);
		int salir=0;
		if (this.head == null) {
			this.head = newNode;
		} else {
			ant=recorre;
			while(recorre!=null&&salir==0) {
				if(newNode.getData().getTrackNo()>recorre.getData().getTrackNo()) {
					ant=recorre;
					recorre=recorre.getNext();
					if(recorre==null) {
						salir=1;
					}
					else
						if(this.head!=recorre) {
							salir=2;							
						}
						else {
							salir=3;
						}	
				}
			}
			switch(salir){
			
			case 1:
				ant.getNext()=NewNode;
				newNode.getPrev()=ant;
			break;
			
			case 2:
				ant.getNext()=newNode;
				newNode.getPrev()=ant;
				recorre.getPrev()=newNode;
				newNode.getNext()=recorre;
			break;
			
			case 3:
				recorre.getPrev()=newNode;
				newNode.getNext()=recorre;
				this.head=newNode;
			break;
				
				
			}
			
			
			
			this.tail.setNext(newNode);
			this.tail = newNode;
		}
		this.size = this.size + 1;
	}
}
	
	
	
	
	
	
	/*

	// ---------------Buscar por trackNo de cabeza a cola
	public Mp3 searchByTrackNo(int trackNo) {
		Mp3 result = null;

		doubleLinkedListNode temp = this.head;// temporal creado y apuntando a la cabeza
		while (temp != null) {
			if (temp.getData().getTrackNo() == (trackNo)) {
				result = temp.getData();
			}
			temp = temp.getNext();
		}

		return result;
	}*/

