package cap2.lists;

import utils.Node;
import utils.Person;

public class Queue {
	Node first;
	Node last;
	int size = 0;

	public boolean enQueue(Person dato) {
		boolean respuesta = false;
		Node newNode = new Node();
		newNode.setDato(dato);
		if (size == 0) {
			// Significa que no hay nodos en la cola
			first = newNode;
			respuesta = true;
			size++;
		} else if (size > 0) {
			Node temp = new Node();
			temp = first;
			while (respuesta == false) {
				if (temp.getSiguiente() == null) {
					temp.setSiguiente(newNode);
					respuesta = true;
					size++;
				} else {
					temp = temp.getSiguiente();
				}
			}
		}
		return respuesta;
	}

	public boolean deQueue() {
		boolean respuesta = false;
		Node temp = new Node();
		temp = first;
		first = temp.getSiguiente();
		temp = null;
		respuesta = true;
		size--;
		return respuesta;
	}

	public String listQueue() {
		String respuesta = "";
		Node temp = new Node();
		temp = first;
		for (int i = 0; i < size; i++) {
			respuesta = respuesta + temp.getDato().getName();
			temp = temp.getSiguiente();
		}
		return respuesta;
	}
}
