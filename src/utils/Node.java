package utils;

public class Node {
	String dato;
	Node anterior;
	Node siguiente;

	public String getDato() {
		return dato;
	}

	public void setDato(String dato) {
		this.dato = dato;
	}

	public Node getAnterior() {
		return anterior;
	}

	public void setAnterior(Node anterior) {
		this.anterior = anterior;
	}

	public Node getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Node siguiente) {
		this.siguiente = siguiente;
	}
}
