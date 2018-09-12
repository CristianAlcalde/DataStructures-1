package Cap2.list;

public class Node {
	
	String data; 
	Node next;
	
	//Encapsulate
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	} 
	
	//Constructor
   
	public Node (String data) {
		this.data = data;  
	}
	
	//Metodo para enlazar los nodos 
	public void linkedNext (Node n) {
		next = n; 
	}
	
	//Metodo para obtener siguente nodo
	public Node procureNext() {
		return next; 
	}
	
	//Metodo para obtener el valor del nodo
	public String procuredata () {
		return data;
	}

}
