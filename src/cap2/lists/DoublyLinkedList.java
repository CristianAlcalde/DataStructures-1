package cap2.lists;

import utils.DoublyLinkedNode;

public class DoublyLinkedList {
	DoublyLinkedNode head = new DoublyLinkedNode();
	DoublyLinkedNode tail = new DoublyLinkedNode();

	// CRUD
	public DoublyLinkedNode insertNodeHead(String dato) {
		if (head == null) {
			// Significa que no hay nada en la lista entonces olo hay que insertar el nodo
			this.head.setDato(dato);
			this.head.setAnterior(null);
			this.head.setSiguiente(null);
		} else {
			// Significa que hay cabeza pero no cola por ende hacemos a cola cabeza ya a
			// cabeza tempo que seria el nodo
			if (tail == null) {
				this.tail = this.head;
				DoublyLinkedNode tempo = new DoublyLinkedNode();
				tempo.setAnterior(null);
				tempo.setSiguiente(this.tail);
				tempo.setDato(dato);
				this.head = tempo;
			} else {
				// Significa que hay cabeza y hay cola por ende se pone cabeza en la mitad y se
				// inserta el nodo en head
				DoublyLinkedNode tempo = new DoublyLinkedNode();
				tempo = this.head;
				tempo.setAnterior(head);
				this.head.setDato(dato);
				this.head.setSiguiente(tempo);
				this.head.setAnterior(null);
			}
		}
		return this.head;
	}

}
