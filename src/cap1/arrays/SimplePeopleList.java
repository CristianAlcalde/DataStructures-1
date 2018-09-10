package cap1.arrays;

public class SimplePeopleList {
	private NodeList head;
	private String valor;
	private int buscar;
	private int v;
	
	public SimplePeopleList() {
		head = null;
	}

	public boolean estavacia() {
		return head == null;
	}
	
	public void addBeggining(int clave, String valor) {
		NodeList nuevo = new NodeList(clave, valor);
		if (head == null) {

			head = nuevo;
		} else {

			nuevo.setSig(head);
			head = nuevo;
		}
	}
	
	
	public void addFinal(int clave, String valor) {
		NodeList nuevo = new NodeList(clave, valor);

		if (estavacia()) {

			head = nuevo;
		} else {
			NodeList aux = head;
			while (aux.getSig() != null) {

				aux = aux.getSig();

			}

			aux.setSig(nuevo);

		}
	}

	public String setSearch(int clave) {
		NodeList aux = head;

		while (aux != null && aux.getClave() != v) {
			aux = aux.getSig();
		}

		return aux.getValor();
	}
	

	public void setUpdate(int nuevaclave, String nuevavalor, int clave) {
		NodeList aux = head;

		while (aux != null && aux.getClave() != buscar) {
			aux = aux.getSig();

		}
		aux.setClave(clave);
		aux.setValor(valor);

	}
	

	
	public void show() {
		NodeList aux = head;
		while (aux != null) {
			System.out.println(aux.getValor() + aux.getClave());
			aux = aux.getSig();
		
	    }
    }
}
