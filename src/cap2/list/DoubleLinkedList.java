package cap2.list;

import java.util.NoSuchElementException;

import utils.Mp3;

//import utils.Mp3;

//Step 1 create the attributes
public class DoubleLinkedList {
	private Mp3 date;
	private DoubleLinkNode head;
	private DoubleLinkNode tail;
	// private DoubleLinkNode cursor;
	private int size;

	private class Node {
		Mp3 date;
		Node next;
		Node prev;

		public Node(Mp3 date, Node next, Node prev) {
			this.date = date;
			this.next = next;
			this.prev = prev;
		}
	}

	public DoubleLinkedList() {
		size = 0;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

//Step 2 encapsulate the attributes

	// Generate CRUD methods
//INSERTAR AL INICIO
	public void addFirst(Mp3 date) {
		DoubleLinkNode temp = new DoubleLinkNode(date, head, null);
		if (head != null) {
			head.prev = temp;
		}
		head = temp;
		if (tail == null) {
			tail = temp;
		}
		size++;
		System.out.println("adding: " + date);
	}

//INSERTAR AL FINAL
	public void addLast(Mp3 date) {

		DoubleLinkNode temp = new DoubleLinkNode(date, null, tail);
		if (tail != null) {
			tail.next = temp;
		}
		tail = temp;
		if (head == null) {
			head = temp;
		}
		size++;
		System.out.println("adding: " + date);
	}

//ELIMINAR AL INICIO
	public Mp3 removeFirst() {
		if (size == 0)
			throw new NoSuchElementException();
		DoubleLinkNode tmp = head;
		head = head.next;
		head.prev = null;
		size--;
		System.out.println("deleted: " + this.date);
		return this.date;
	}
//ELIMINAR AL FINAL
	public Mp3 removeLast() {
		if (size == 0)
			throw new NoSuchElementException();
		DoubleLinkNode tmp = tail;
		tail = tail.prev;
		tail.next = null;
		size--;
		System.out.println("deleted: " + this.date);
		return this.date;
	}

}
