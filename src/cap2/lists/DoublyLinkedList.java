package cap2.lists;

import utils.DoublyNode;
import utils.Mp3;

public class DoublyLinkedList {
	DoublyNode head = new DoublyNode();
	DoublyNode tail = new DoublyNode();
	int size = 0;

	// CRUD
	public boolean insertNode(Mp3 dato) {
		boolean respuesta = false;
		DoublyNode newNode = new DoublyNode();
		newNode.setDato(dato);
		if (head.getDato() == null) {
			// Significa que no hay nada en la lista
			head = newNode;
			size++;
			respuesta = true;
		} else {
			// Significa que hay nodos en la lista
			DoublyNode tempo = new DoublyNode();
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
					DoublyNode anterior = new DoublyNode();
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

	public boolean deleteNode(int track) {
		boolean respuesta = false;
		DoublyNode review = new DoublyNode();
		review = head;
		while (review != null) {
			if (review.getDato().getTrack() == track) {
				DoublyNode anterior = new DoublyNode();
				DoublyNode siguiente = new DoublyNode();
				anterior = review.getAnterior();
				siguiente = review.getSiguiente();
				anterior.setSiguiente(siguiente);
				siguiente.setAnterior(anterior);
				review = null;
				size--;
				respuesta = true;
			} else {
				review = review.getSiguiente();
			}
		}
		return respuesta;
	}

	public String listNodes() {
		String respuesta = "";
		DoublyNode review = new DoublyNode();
		review = head;
		for (int j = 0; j < size; j++) {
			respuesta = respuesta + review.getDato().getNombre();
			review = review.getSiguiente();
		}
		return respuesta;
	}

}
