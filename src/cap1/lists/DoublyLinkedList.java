package cap1.lists;

import Utils.DoublyLinkedNode;

public class DoublyLinkedList {
	DoublyLinkedNode cabeza = new DoublyLinkedNode();
	DoublyLinkedNode cola = new DoublyLinkedNode();
	
	public DoublyLinkedNode insertNodeCabeza (String dato) {
		
		if (cabeza == null) {
			
			this.cabeza.setDato(dato);
			this.cabeza.setAnterior(null);
		}
	return null;	
	}
}
