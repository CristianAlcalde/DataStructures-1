package Cap2.lists;

import utils.Mp3;

public class LinkedList {

	// creacion de la cabeza y cola, el punto de inicio y fin de la lista
	private int size = 0;
	private LinkedListNode head;// cabeza
	private LinkedListNode tail;// cola

	// encapsulado
	public LinkedListNode getHead() {
		return head;
	}

	public void setHead(LinkedListNode head) {
		this.head = head;
	}

	public LinkedListNode getTail() {
		return tail;
	}

	public void setTail(LinkedListNode tail) {
		this.tail = tail;
	}

	public int getSize() {
		return size;
	}

	// CRUD
	public void setSize(int size) {
		this.size = size;
	}
	// no se utiliza contructor ni encapsular ya que no se van a usar, ya que se va
	// a usar los metodos
	// se va usar este contructor para que en cada lista nueva se crea la cabeza y
	// la cola
	// con el Node nuevo o al agregar algo nuevo, elemntos personalizados a la lista
	// enlazada se le ponen los atributos del mp3

	public void add(String author, String file, String name, String trackNo) {
		// boolean result = false;
		// sted 1. creacion del nuevo nodo
		// este recibe los mismos valores que recibe el mp3
		LinkedListNode newNode = new LinkedListNode(author, file, name, trackNo);
		// If the head is null
		if (this.head == null) {
			// si la cabeza es nula pasa a ser la cabeza el nuevo nodo
			this.head = newNode;
			this.tail = newNode;
		} else {
			// la colas siguentes son el nuevo nodo
			this.tail.setNext(newNode);
			// el nuevo node es la cola
			this.tail = newNode;

			// result = true;
			/*
			 * se quita booleano por que si falla sale una excepcion, si es null me crea uno
			 * nuevo y si existe se crea en la cola, se ponen en archivos que no dependan de
			 * mi codigo
			 */

		}
		// return result;
		this.size = this.size + 1;
	}
	//se pedira que devuelva una cancion si no la encuentra retorna null
	//se instancia el dato de respuesta
	public Mp3 searchByName(String name) {
		Mp3 result = null;
		//node temporal, me recorrera toda la lista nodoxnodo hasta escontrar o llegar a null
		LinkedListNode temp = this.head;//temporal creado y apuntando a la cabeza
		//mientras el siguiente del temporal no sea null
		while(temp!=null) {              //el temporal al nodo siguiente de la cabeza y asi avanza a los demas
			//compare el dato del temporal con el dato de entrada
			if(temp.getData().getName().equals(name)) {
				//si lo encuentra la respuesta es el dato encontrado
				result = temp.getData();
				
			}
			temp = temp.getNext();			
		}
		
		return result;
	}
	//meted para buscar por posisition
	public Mp3 getAt(int pos) {
		Mp3 result = null;
		//node temporal, me recorrera toda la lista nodoxnodo hasta escontrar o llegar a null
		LinkedListNode temp = this.head;//temporal creado y apuntando a la cabeza
		int posTemp =0;
		//mientras el siguiente del temporal  sea menor o igual a la pos que esta o null
		while(posTemp <= pos) {              //el temporal al nodo siguiente de la cabeza y asi avanza a los demas
			//compare el dato del temporal con el dato de entrada
			result = temp.getData();
			temp = temp.getNext();
			posTemp =posTemp + 1;	
			}	
		return result;
	}
	
}
