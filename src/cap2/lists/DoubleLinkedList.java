package cap2.lists;

import utils.Mp3;

public class DoubleLinkedList {
	
	private DoubleLinkedNode head; // Cabeza
	private DoubleLinkedNode tail; // Cola
	private int size;
	
	
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
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
public void addSort(String author, String file, String name, String trackNo) {
		
		// Step 1. create the new node
		DoubleLinkedNode newNode = new DoubleLinkedNode(author, file, name, trackNo);
		// If the head is null
		if (this.head == null) {
			// The new node is the head
			this.head = newNode;
			this.tail = newNode;
		} else {
			// Creamos un nodo temporal para recorrer los demas nodos
			DoubleLinkedNode tmp = this.head;
			// Mientras el siguiente del temporal no sea null
			
			boolean inserto = false;
			
			while (tmp != null) {
//							inserto = false;
				// Compare el dato del temporal con el dato de entrada
				if (Integer.parseInt(trackNo) <= Integer.parseInt(tmp.getDato().getTrackNo())) {
					//Se crean las referencias de siguiente y anterior para el nuevo nodo
					newNode.setNext(tmp);
					newNode.setBack(tmp.getBack());
					
					//Se actuliza la cabeza
					if(this.head.equals(tmp)) {
						this.head = newNode;
					}
					
					//Se actualizan las referencias de los elementos que ya se encontraban en la lista
					if(tmp.getBack() != null) {
						tmp.getBack().setNext(newNode);
					}
					
					tmp.setBack(newNode);
					
					inserto = true;
					break;
					
				}
				tmp = tmp.getNext();
			}
			
			if(!inserto) {
				// The tail's next is newNode
				this.tail.setNext(newNode);
				newNode.setBack(this.tail);
				// The new node is the tail
				this.tail = newNode;
			}
		}
		this.size = this.size + 1;
		
	}


}
