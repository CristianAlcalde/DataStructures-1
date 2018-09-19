package cap2.lists;

import utils.Mp3;

public class DoubleLinkedList {

	private DoubleLinkNode head; // Head
	private DoubleLinkNode tail; // Tale
	private DoubleLinkNode cursor; // Location
	private int size = 0;

	// Encapsulate the required fields
	public DoubleLinkNode getHead()
	{
		return head;
	}

	public void setHead(DoubleLinkNode head)
	{
		this.head = head;
	}

	public DoubleLinkNode getTail()
	{
		return tail;
	}

	public void setTail(DoubleLinkNode tail)
	{
		this.tail = tail;
	}

	public DoubleLinkNode getCursor()
	{
		return cursor;
	}

	public void setCursor(DoubleLinkNode cursor)
	{
		this.cursor = cursor;
	}

	public int getSize()
	{
		return size;
	}

	public void setSize(int size)
	{
		this.size = size;
	}

	// CRUD
	
	public void add(String author, String file, String name, String trackNo)
	{

		// Step 1. create the new node
		DoubleLinkNode newDoubleNode = new DoubleLinkNode(author, file, name, trackNo);
		// If the head is null
		if (this.head == null)
		{
			// The new node is the head
			this.head = newDoubleNode;
			this.tail = newDoubleNode;
		} else
		{
			// The tail's next is newNode
			this.tail.setNext(newDoubleNode);
			// The new node is the tail
			this.tail = newDoubleNode;
		}
		this.size ++;
	}
	
	public Mp3 searchByName(String name)
	{
		Mp3 result = null;
		// Create a temporal node to travel around the else nodes.
		DoubleLinkNode tmp = this.head;
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
		DoubleLinkNode tmp = this.head;
		// Creating the position indicator
		int posTmp = 0;
		// While we are not in the input position
		while (posTmp <= pos)
		{
			// Storing the current value in temporal object
			result = tmp.getDato();
			// Incrementing the post
			posTmp ++;
			// Incrementing temporal
			tmp = tmp.getNext();
		}
		// When the while finish temporal is located in the correct node.
		return result;
	}
}
