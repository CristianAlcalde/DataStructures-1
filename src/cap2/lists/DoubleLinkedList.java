package cap2.lists;

public class DoubleLinkedList {
	private DoubleLinkNode head;
	private DoubleLinkNode tail;
	//Creating cursor
	private DoubleLinkNode cursor;
	
	//Encapsulate the required fields	
	public DoubleLinkNode getHead() {
		return head;
	}
	public void setHead(DoubleLinkNode head) {
		this.head = head;
	}
	public DoubleLinkNode getTail() {
		return tail;
	}
	public void setTail(DoubleLinkNode tail) {
		this.tail = tail;
	}
	public DoubleLinkNode getCursor() {
		return cursor;
	}
	public void setCursor(DoubleLinkNode cursor) {
		this.cursor = cursor;
	}
	
	//CRUD	
	public void insertaPorCola(String author, String file, String name, String trackNo) {

		// Step 1. create the new node
		DoubleLinkNode newNode = new DoubleLinkNode(author, file, name, trackNo);
		// If the head is null
		if (this.head == null) {
			// The new node is the head
			this.head = newNode;
			this.tail = newNode;
			this.cursor=newNode;
		} else {
			// The tail's next is newNode
			this.tail.setNext(newNode);
			this.tail.getNext().setPrev(this.tail);
			// The new node is the tail
			this.tail = newNode;
			this.tail.setNext(null);
		}
		
	}
	
	public void insertaPorCabeza(String author, String file, String name, String trackNo) {

		// Step 1. create the new node
		DoubleLinkNode newNode = new DoubleLinkNode(author, file, name, trackNo);
		newNode.setPrev(null);
		// If the head is null
		if (this.head == null) {
			// The new node is the head
			this.head = newNode;
			this.tail = newNode;
			this.cursor=newNode;
		} else {
			// The tail's next is newNode
			newNode.setNext(this.head);
			this.head.setPrev(newNode);
			this.head = newNode;
		}
		
	}
	
	public void EliminarByTrackNo(String trackNo) {
		if(this.head==null) {
			//Nodos auxiliares y nodo anterior
			DoubleLinkNode Auxiliar =  this.head;
			DoubleLinkNode Previous = null;
			while(Auxiliar != null) {
				if(Auxiliar.getDato().getTrackNo()==trackNo) {
					if(Previous == null) {
						this.head = this.head.getNext();
						Auxiliar.setNext(null);
						Auxiliar = this.head;
					}
					else
					{
						Previous.setNext(Auxiliar.getNext());
						Auxiliar.setNext(null);
						Auxiliar = Previous.getNext();
					}
				}
				else
				{
					Previous = Auxiliar ;
					Auxiliar = Auxiliar.getNext();
				}
			}
		}
	}
	
	public void insertarOrdenado(String author, String file, String name, String trackNo) {
		DoubleLinkNode New = new DoubleLinkNode(author, file, name, trackNo);
		if(this.head==null) {
			this.head = New ;
		}
		else {
			DoubleLinkNode Auxiliar = this.head;
			DoubleLinkNode Previous = null;
			//Obtener el n{umero de track del dato anterior
			String trackNo_Previous =  Auxiliar.getDato().getTrackNo() ;
			int trackNoPrev = Integer.parseInt(trackNo_Previous);
			//Obtener el número de track del dato nuevo
			String trackNo_New = New.getDato().getTrackNo();
			int trackNoNew = Integer.parseInt(trackNo_New);
			while((Auxiliar.getNext()!=this.head) && (trackNoPrev < trackNoNew)) {
				Previous = Auxiliar ;
				Auxiliar = Auxiliar.getNext();
			}
			if(Previous==null) {
				while(Auxiliar.getNext()!=this.head) {
					Auxiliar = Auxiliar.getNext();
				}
				New.setNext(this.head);
				Auxiliar.setNext(New);
				this.head = New ;
			}
			else if(Auxiliar.getNext()==this.head) {
				Previous = Auxiliar ;
				Previous.setNext(New);
				New.setNext(this.head);
			}
			else
			{
				Previous.setNext(New);
				New.setNext(Auxiliar);
			}
		}
	}
	
	
}
