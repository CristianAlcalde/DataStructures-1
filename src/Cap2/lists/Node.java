package Cap2.lists;

import utils.Mp3;

public class Node {

	private Mp3 data;
	private Node next;
	
	//contructor solo
	public Node() {
		
	}

	//contructor con datos
	
	/* se cambio el contrsctor que recibia 2 datos "public Node(Mp3 data, Node next)" 
	 *por "public Node(String author, String file, String name, String trackNo)"
	 * para que se me reciba son los datos del disco Mp3 
	 * ya que solo recibia el Mp3 complejo, el cual era la lista enlazada la que creaba el Mp3
	 * con el cambio el que crea el dato crea el Mp3
	 * como el Node es el papa del Mp3 se coje "this.data = new Mp3(author, file, name, trackNo);"
	 * y se cambia la asiganacion this.data =data;
	 * se quita el "this.next = next" ya que se estaba creando en el limbo, y se quita del constructor y de la asigancion
	  */
	 
	public Node(String author, String file, String name, String trackNo) {
		
		this.data = new Mp3(author, file, name, trackNo);
	}



	//encapsular
	public Mp3 getData() {
		return data;
	}

	public void setData(Mp3 data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}
