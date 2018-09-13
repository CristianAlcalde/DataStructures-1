package Cap2.lists;

public class LinkedList {

	// creacion de la cabeza y cola, el punto de inicio y fin de la lista
	private int size = 0;
	private Node head;// cabeza
	private Node tail;// cola

	// encapsulado
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
		Node newNode = new Node(author, file, name, trackNo);
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

}
