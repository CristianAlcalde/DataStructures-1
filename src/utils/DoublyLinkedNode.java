package utils;

public class DoublyLinkedNode {
	String dato;
	DoublyLinkedNode anterior;
	DoublyLinkedNode siguiente;

	public String getDato() {
		return dato;
	}

	public void setDato(String dato) {
		this.dato = dato;
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
