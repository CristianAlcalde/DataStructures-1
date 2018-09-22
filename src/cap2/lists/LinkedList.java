package cap2.lists;

import utils.Mp3;

public class LinkedList {

	private Node head; // Cabeza
	private Node tail; // Cola
	private int size = 0;

	// Encapsulate the required fields
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public Node getTail() {
		return tail;
	}

	public void setTail(Node tail) {
		this.tail = tail;
	}

	// CRUD
	public void add(String author, String file, String name, String trackNo) {

		// Step 1. create the new node
		Node newNode = new Node(author, file, name, trackNo);
		// If the head is null
		if (this.head == null) {
			// The new node is the head
			this.head = newNode;
			this.tail = newNode;
		} else {
			// The tail's next is newNode
			this.tail.setNext(newNode);
			// The new node is the tail
			this.tail = newNode;
		}
		this.size = this.size + 1;
	}
	public void addSort(String author, String file, String name, String trackNo) {
		// Step 1. create the new node
		Node newNode = new Node(author, file, name, trackNo);
		// If the head is null
		if (this.head == null) {
			// The new node is the head
			this.head = newNode;
			this.tail = newNode;
		} else {
			
			// Creamos un nodo temporal para recorrer los demas nodos
			Node tmp = this.head;
			Node anterior = null;
			// Mientras el siguiente del temporal no sea null
			
			boolean inserto = false;
			
			while (tmp != null) {
//				inserto = false;
				// Compare el dato del temporal con el dato de entrada
				if (Integer.parseInt(trackNo) <= Integer.parseInt(tmp.getDato().getTrackNo())) {
					newNode.setNext(tmp);
					if(this.head.equals(tmp)) {
						this.head = newNode;
					}else {
						anterior.setNext(newNode);
					}
					inserto = true;
					break;
					
				}
				anterior = tmp;
				tmp = tmp.getNext();
			}
			
			if(!inserto) {
				// The tail's next is newNode
				this.tail.setNext(newNode);
				// The new node is the tail
				this.tail = newNode;
			}
			
		}
		
		this.size = this.size + 1;
		
	}

	public Mp3 searchByName(String name) {
		// Instanciamos el dato de respuesta
		Mp3 result = null;
		// Creamos un nodo temporal para recorrer los demas nodos
		Node tmp = this.head;
		// Mientras el siguiente del temporal no sea null
		while (tmp != null) {
			// Compare el dato del temporal con el dato de entrada
			if (tmp.getDato().getName().equals(name)) {
				// Si lo encuentra la respuesta es el dato encontrado
				result = tmp.getDato();
			}
			tmp = tmp.getNext();
		}
		return result;
	}

	public Mp3 getAt(int pos) {
		// Instanciamos el dato de respuesta
		Mp3 result = null;
		// Creamos un nodo temporal para recorrer los nodos
		Node tmp = this.head;
		// Creating the position indicator
		int posTmp = 0;
		// While we are not in the input position
		while (posTmp <= pos) {
			//Storing the current value in tmp object
			result = tmp.getDato();
			//Incrementing the pos
			posTmp = posTmp + 1;
			//Incrementing tmp
			tmp = tmp.getNext();
		}
		//When the while finish tmp is located in the correct node.
		return result;
	}
}