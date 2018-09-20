package cap2.lists;

import utils.Mp3;

public class LinkedList {
	private Node head; // Head
	private Node tail; // Tale
	private int size = 0;
	
	
	// Encapsulate the required fields
	public int getSize() 
	{
		return size;
	}
	public void setSize(int size) 
	{
		this.size = size;
	}
	public Node getHead() 
	{
		return head;
	}
	public void setHead(Node head)
	{
		this.head = head;
	}
	public Node getTail()
	{
		return tail;
	}
	public void setTail(Node tail) 
	{
		this.tail = tail;
	}
	
	// CRUD
		public void add(String author, String file, String name, String trackNo)
		{

			// Step 1. create the new node
			Node newNode = new Node(author, file, name, trackNo);
			// If the head is null
			if (this.head == null)
			{
				// The new node is the head
				this.head = newNode;
				this.tail = newNode;
			} else
			{
				// The tail's next is newNode
				this.tail.setNext(newNode);
				// The new node is the tail
				this.tail = newNode;
			}
			this.size++;
		}

		public Mp3 searchByName(String name)
		{
			Mp3 result = null;
			// Create a temporal node to travel around the else nodes.
			Node tmp = this.head;
			// While the next to temporal is not null.
			while (tmp != null)
			{
				// Compare temporal's fact with the entrace's fact
				if (tmp.getDato().getName().equals(name))
				{
					result = tmp.getDato();
				}
				tmp = tmp.getNext();
			}
			return result;
		}

		public Mp3 getAt(int pos)
		{
			Mp3 result = null;
			Node tmp = this.head;
			// Creating the position indicator
			int posTmp = 0;
			// While we are not in the input position
			while (posTmp <= pos)
			{
				// Storing the current value in temporal object
				result = tmp.getDato();
				// Incrementing the post
				posTmp++;
				// Incrementing temporal
				tmp = tmp.getNext();
			}
			// When the while finish temporal is located in the correct node.
			return result;
		}

		public String listElements()
		{
			String list = "";
			
			Node temp = this.head;
			
			int pos = 1;
			
			while (temp != null) {
			
					list += "N° "+ Integer.toString(pos) + "- ";
					list += temp.getDato().getAuthor() + ", ";
					list += temp.getDato().getFile() + ", ";	
					list += temp.getDato().getName() + ", ";
					list += temp.getDato().getTrackNo()+ "\n";
					pos ++;
					temp = temp.getNext();
			}
			return list;
		}
		
		public void deletebyName(String name)
		{
			Node newNode = new Node("", "", "", "");

			Node node = this.head;

			Node prevNode = null;

			// While the next to temporal is not null.
			while (node != null)
			{
				// Compare temporal's fact with the entrace's fact
				if (node.getDato().getName().equals(name))
				{
					prevNode.setNext(node.getNext());
					node = newNode;
				}
				prevNode = node;
				node = node.getNext();
			}
			this.size--;
		}


}

