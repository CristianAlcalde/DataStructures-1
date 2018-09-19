package utils;

public class NodeProcess {
	Process dato;
	NodeProcess siguiente;

	public Process getDato() {
		return dato;
	}

	public void setDato(Process dato) {
		this.dato = dato;
	}

	public NodeProcess getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(NodeProcess suguiente) {
		this.siguiente = suguiente;
	}
}
