package cap2.LinkedLists;

public class DoubleNode<Mp3>{
	
	@SuppressWarnings("unchecked")
	public DoubleNode(Object elemento) {
		this.dato = (Mp3) elemento;
		this.siguiente = null;
		this.anterior = null;
	}

	private Mp3 dato;
	private DoubleNode<?> siguiente;
	private DoubleNode<?> anterior;
	
	public Mp3 getDato() {
		return dato;
	}
	
	@SuppressWarnings("unchecked")
	public void setDato(Object elementoNuevo) {
		this.dato = (Mp3) elementoNuevo;
		
	}
	
	public DoubleNode<?> getSiguiente() {
		return siguiente;
	}
	
	public void setSiguiente(DoubleNode<?> siguiente) {
		this.siguiente = siguiente;
		
	}
	
	public DoubleNode<?> getAnterior1() {
		return anterior;
	}

	public void setAnterior(DoubleNode<?> anterior) {
		this.anterior = anterior;
		
	}
	
	public DoubleNode<?> getEnlace() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public DoubleNode<?> getAnterior() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
