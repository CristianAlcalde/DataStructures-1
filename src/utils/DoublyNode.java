package utils;

public class DoublyNode {
	Mp3 dato;
	DoublyNode anterior;
	DoublyNode siguiente;

	public Mp3 getDato() {
		return dato;
	}

	public void setDato(Mp3 dato) {
		this.dato = dato;
	}

	public DoublyNode getAnterior() {
		return anterior;
	}

	public void setAnterior(DoublyNode anterior) {
		this.anterior = anterior;
	}

	public DoublyNode getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(DoublyNode siguiente) {
		this.siguiente = siguiente;
	}
}
