package utils;

public class DoublyLinkedNode {
	Mp3 dato;
	DoublyLinkedNode anterior;
	DoublyLinkedNode siguiente;

	public Mp3 getDato() {
		return dato;
	}

	public void setDato(Mp3 dato2) {
		this.dato = dato2;
	}

	public DoublyLinkedNode getAnterior() {
		return anterior;
	}

	public void setAnterior(DoublyLinkedNode anterior) {
		this.anterior = anterior;
	}

	public DoublyLinkedNode getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(DoublyLinkedNode siguiente) {
		this.siguiente = siguiente;
	}
}
