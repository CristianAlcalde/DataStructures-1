package cap1.arrays;

public class NodeList {
	
	private int clave;
	private String valor;
	NodeList siguiente;

	public NodeList() {
		siguiente = null;
	}


	public NodeList(int clave, String valor) {
		this.clave = clave;
		this.valor = valor;
		siguiente = null;
	}
	
	
	public void setClave(int clave) {
		this.clave = clave;
	}

	public void setSig(NodeList sig) {
		siguiente = sig;
	}

	public int getClave() {
		return clave;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getValor() {
		return valor;
	}

	public NodeList getSig() {
		return siguiente;
	}

}
