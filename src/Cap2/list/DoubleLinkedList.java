package Cap2.list;

import Utils.MP3;

public class DoubleLinkedList {
	private NodeDouble head;
	private NodeDouble tail;
	private NodeDouble cursor;

//Encapsulate
	public NodeDouble getHead() {
		return head;
	}

	public void setHead(NodeDouble head) {
		this.head = head;
	}

	public NodeDouble getTail() {
		return tail;
	}

	public void setTail(NodeDouble tail) {
		this.tail = tail;
	}

	public NodeDouble getCursor() {
		return cursor;
	}

	public void setCursor(NodeDouble cursor) {
		this.cursor = cursor;
	}

	// CRUD
	// Insert or ADD to head.
	public void DoubleLinkedListAddHead(String author, String file, String name, Integer trackNo) {
	// Step 1. create the new node
		NodeDouble newNode = new NodeDouble(author, file, name, trackNo);
		//Integer comparar = trackNo; // esta linea trae el track number del nuevo nodo para poder compararlo.  
		// If the head is null
		
		if (this.head == null) {
		// The new node is the head
		this.head = newNode;
		this.tail = newNode;
		this.cursor = newNode;
		} else {
			newNode.setNext(head);
			head.setPrevius(newNode);
			head=newNode;	
		}
	}
		// Insert in tail. 
		public void DoubleLinkedListAddTail(String author, String file, String name, Integer trackNo) {
		
		}
	
		
		}


