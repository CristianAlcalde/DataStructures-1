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
	
	//------------------------------------------
	public void insertaOrdenado(String author, String file, String name, String trackNo) {
		String mayor="";
		// Step 1. create the new node
		DoubleLinkNode newNode = new DoubleLinkNode(author, file, name, trackNo);
		// If the head is null
		if (this.head == null) {
			// The new node is the head
			this.head = newNode;
			this.tail = newNode;
			this.cursor=newNode;
			newNode.setNext(null);
			newNode.setPrev(null);
		} 
		else{
			if( Integer.parseInt(trackNo) > Integer.parseInt(cursor.getDato().getTrackNo()) ){
				mayor="SI";
			}else{mayor="NO";}
			
			while(mayor=="SI" && cursor.getNext()!= null) {
				if ( Integer.parseInt(trackNo) > Integer.parseInt(cursor.getDato().getTrackNo())){				
					this.cursor=this.cursor.getNext();				
				}
				else{
					newNode.setNext(this.cursor);
					newNode.setPrev(this.cursor.getPrev());
					this.cursor.getPrev().setNext(newNode);
					this.cursor.setPrev(newNode);
					this.cursor= this.head;
					mayor="FIN";
				}
			}
			
			if(mayor=="SI") {
				this.cursor.setNext(newNode);
				newNode.setPrev(this.cursor);
				newNode.setNext(null);
				this.tail=newNode;
			}		
			
			if(mayor=="NO") {
				this.head.setPrev(newNode);
				newNode.setNext(this.head);
				newNode.setPrev(null);
				this.head=newNode;
			}
						
		}
		this.cursor= this.head;
	}
	//------------------------------------------
	
	public String listar(DoubleLinkedList myList) {
		
		while(myList.getCursor()!=null) {
			System.out.println(myList.getCursor().getDato().getTrackNo());			
			myList.cursor=myList.cursor.getNext();
		}	
		myList.setCursor(myList.tail);
		return myList.getCursor().getDato().getTrackNo();
		
	}
	//------------------------------------------
		
	public String buscarportrack(DoubleLinkedList myList, String notrack) {
		String sale="no";
		while(myList.getCursor()!=null && sale=="no") {
			if(myList.getCursor().getDato().getTrackNo()==notrack) {
				System.out.println("----------------------------");	
				System.out.println(myList.getCursor().getDato().getTrackNo());	
				System.out.println(myList.getCursor().getDato().getAuthor());
				System.out.println(myList.getCursor().getDato().getName());
				sale="si";
				System.out.println("----------------------------");
			}
			else {
				myList.cursor=myList.cursor.getNext();
			}
		}	
		
		return myList.getCursor().getDato().getName();
		
	}
	//-------------------------------------------
	public String eliminaportrack(DoubleLinkedList myList, String notrack) {
		String sale="no";
		while(myList.getCursor()!=null && sale=="no") {
			if(myList.getCursor().getDato().getTrackNo()==notrack) {				
				myList.getCursor().getPrev().setNext(myList.getCursor().getNext());
				myList.getCursor().getNext().setPrev(myList.getCursor().getPrev());
				myList.cursor=myList.head;				
				sale="si";				
			}
			else {
				myList.cursor=myList.cursor.getNext();
			}
		}			
		return myList.getCursor().getDato().getName();		
	}
	//------------------------------------------
	
}
