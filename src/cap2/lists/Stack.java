package cap2.lists;

import utils.NodeProcess;
import utils.Process;

public class Stack {
	NodeProcess top;
	int size;

	public boolean add(Process dato) {
		boolean respuesta = false;
		NodeProcess newNode = new NodeProcess();
		newNode.setDato(dato);
		if (top == null) {
			// Siginica que no hay nodos
			top = newNode;
			respuesta = true;
			size++;
		} else {
			NodeProcess temp = new NodeProcess();
			temp = top;
			top = newNode;
			top.setSiguiente(temp);
			respuesta = true;
			size++;

		}
		return respuesta;
	}

	public boolean remove() {
		boolean respuesta = false;
		NodeProcess temp = new NodeProcess();
		temp = top;
		top = temp.getSiguiente();
		temp = null;
		respuesta = true;
		size--;
		return respuesta;
	}
	
	public String list () {
		String respuesta = "";
		NodeProcess temp = new NodeProcess();
		temp = top;
		for(int i = 0; i < size; i++) {
			respuesta = respuesta + temp.getDato().getName();
			temp = temp.getSiguiente();
		}
		return respuesta;
	}

}
