package cap2.lists;

import utils.DoublyLinkedNode;
import utils.Mp3;

public class DoublyLinkedList {
	DoublyLinkedNode head = new DoublyLinkedNode();
	DoublyLinkedNode tail = new DoublyLinkedNode();
	int size = 0;

	// CRUD
	public boolean insertNode(Mp3 dato) {
		boolean respuesta = false;
		DoublyLinkedNode newNode = new DoublyLinkedNode();
		newNode.setDato(dato);
		if (head.getDato() == null) {
			// Significa que no hay nada en la lista
			head = newNode;
			size++;
			respuesta = true;
		} else {
			// Significa que hay nodos en la lista
			DoublyLinkedNode tempo = new DoublyLinkedNode();
			tempo = head;
			while (tempo != null) {
				// Se recorre la lista para saber en que lugar va a quedar el nodo segun el
				// track
				if (dato.getTrack() > tempo.getDato().getTrack() && size > 1) {
					// Si el track ingresado es mayor que el nodo que esta guardado en tempo y el
					// siguiente de tempo no es null
					// Es decir que no hay mas nodos
					tempo = tempo.getSiguiente();
				} else if (dato.getTrack() < tempo.getDato().getTrack() && size == 1) {
					head = newNode;
					newNode.setSiguiente(tempo);
					tempo.setAnterior(newNode);
					respuesta = true;
					size++;
					tempo = null;
				} else {
					// Entra si el track es menor que el nodo que sigue o no hay mas nodos despues
					// de tempo
					DoublyLinkedNode anterior = new DoublyLinkedNode();
					if (tempo.getAnterior() != null) {
						// Entra si existe mas nodos que solo la cabeza
						anterior = tempo.getAnterior();
						anterior.setSiguiente(newNode);
						tempo.setAnterior(newNode);
						newNode.setAnterior(anterior);
						newNode.setSiguiente(tempo);
					} else {
						tempo.setSiguiente(newNode);
						newNode.setAnterior(tempo);
						newNode.setSiguiente(anterior);
					}

					respuesta = true;
					size++;
					tempo = null;
				}
			}
		}

		return respuesta;
	}

	public String listElement() {
		String respuesta = "";
		DoublyLinkedNode HOLA = new DoublyLinkedNode();
		HOLA = head;
		System.out.println(size);
		for (int j = 0; j < size; j++) {
			System.out.println(HOLA.getDato().getNombre());
			HOLA = HOLA.getSiguiente();
		}
		return respuesta;
	}

}
