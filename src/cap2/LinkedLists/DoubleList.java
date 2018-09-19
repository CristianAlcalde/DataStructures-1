package cap2.LinkedLists;

public class DoubleList<Mp3> {
	private DoubleNode<Mp3> cabeza;
	private DoubleNode<Mp3> cola;
	private DoubleNode<Mp3> actual;

	int tamaño = 0;

	public int size() {
		return tamaño;
	}
	
	public void insertarCabeza(Object elemento) {

		DoubleNode<Mp3> nuevoNodo = new DoubleNode<Mp3>(elemento);

		if (this.cabeza == null) {

			this.cabeza = nuevoNodo;
			this.cola = nuevoNodo;
			this.cola.setAnterior(this.cabeza);
			this.cabeza.setAnterior(null);

		} else {
			this.actual = this.cabeza;
			this.cabeza = nuevoNodo;

			this.cabeza.setSiguiente(this.actual);
			this.actual.setAnterior(this.cabeza);
			this.cola.setAnterior(this.actual);

		}
		tamaño++;
	}
	
	@SuppressWarnings("unchecked")
	public void insertarCola(Object elemento) {

		DoubleNode<Mp3> nuevoNodo = new DoubleNode<Mp3>(elemento);

		if (this.cabeza == null) {

			this.cabeza = nuevoNodo;
			this.cola = nuevoNodo;

			this.cabeza.setAnterior(null);
			this.cola.setAnterior(this.cabeza);

		} else {

			this.actual = this.cabeza;

			while (this.actual.getSiguiente() != null) {

				this.actual = (DoubleNode<Mp3>) this.actual.getSiguiente();

			}

			this.actual.setSiguiente(nuevoNodo);
			nuevoNodo.setSiguiente(this.actual);
			this.cola = nuevoNodo;
		}

		tamaño++;
	}
	
	@SuppressWarnings("unchecked")
	public boolean buscarElemento(Object elemento) {

		boolean respuesta = false;

		this.actual = this.cola;

		while ((this.actual != null) || (respuesta == false)) {

			if (this.actual.getDato().equals(elemento)) {
				respuesta = true;
			}

			this.actual = (DoubleNode<Mp3>) this.actual.getAnterior();
		}

		return respuesta;
	}
	
	@SuppressWarnings("unchecked")
	public boolean eliminarElemento(Object elemento) {
		boolean respuesta = false;
		if (buscarElemento(elemento)) {
			if (this.cabeza.getDato() == elemento) {

				this.cabeza = (DoubleNode<Mp3>) this.cabeza.getSiguiente();

				respuesta = true;

			} else {

				DoubleNode<?> aux = this.cabeza;

				while (aux.getSiguiente().getDato() != elemento) {
					aux = aux.getSiguiente();
				}

				DoubleNode<?> siguiente = aux.getSiguiente().getSiguiente();

				aux.setSiguiente(siguiente);
				siguiente.setAnterior(aux);
				respuesta = true;
			}

			tamaño--;
		}

		return respuesta;
	}
	
	public Object[] listar() {

		Object[] lista = new Object[tamaño];
		int contador = 0;

		if (this.cabeza == null) {
			System.out.println("La lista no tiene datos");
		} else {

			DoubleNode<?> temp = this.cabeza;

			System.out.print("null <= ");

			while (temp != null) {

				lista[contador] = temp.getDato();
				contador++;

				if (temp.getSiguiente() == null) {
					System.out.print("[ " + temp.getDato() + " ]");
					temp = temp.getSiguiente();

				} else {
					System.out.print("[ " + temp.getDato() + " ]" + " <-" + "-> ");
					temp = temp.getSiguiente();
				}

			}

			System.out.print(" -> null");
		}
		return lista;
	}
	
	@SuppressWarnings("unchecked")
	public boolean ActualizarLista(Object elemento, Object elementoNuevo) {

		boolean respuesta = false;

		this.actual = this.cabeza;

		while ((this.actual != null) || (respuesta == false)) {

			if (this.actual.getDato().equals(elemento)) {
				this.actual.setDato(elementoNuevo);
				respuesta = true;
			}

			this.actual = (DoubleNode<Mp3>) this.actual.getSiguiente();
		}

		return respuesta;
	}

	public void imprimirLista() {
		// TODO Auto-generated method stub
		
	}
	
	


}
