package Cap2.lists;

import utils.Mp3;

public class doubleLinkedListNode {

	private Mp3 data;
	private doubleLinkedListNode next;
	private doubleLinkedListNode prev;

	//contructor solo
	public doubleLinkedListNode() {
		
	}
	 
	public doubleLinkedListNode(String author, String file, String name, int trackNum) {
		
		this.data = new Mp3(author, file, name, trackNum);
	}
	//encapsular

	public Mp3 getData() {
		return data;
	}

	public void setData(Mp3 data) {
		this.data = data;
	}

	public doubleLinkedListNode getNext() {
		return next;
	}

	public void setNext(doubleLinkedListNode next) {
		this.next = next;
	}

	public doubleLinkedListNode getPrev() {
		return prev;
	}

	public void setPrev(doubleLinkedListNode prev) {
		this.prev = prev;
	}




}
