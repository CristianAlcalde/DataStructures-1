package cap2.list;

import utils.Mp3;

//Step 1 Create the attributes 
public class DoubleLinkNode {
	private Mp3 date; // Date tipe Mp3
	DoubleLinkNode next; // Node next
	DoubleLinkNode prev; // Node Prev

	public DoubleLinkNode(Mp3 date, DoubleLinkNode next, DoubleLinkNode prev) {
			this.date = date;
			this.next = next;
			this.prev = prev;
		}

	public Mp3 getDate() {
		return date;
	}

	public void setDate(Mp3 date) {
		this.date = date;
	}

	public DoubleLinkNode getNext() {
		return next;
	}

	public void setNext(DoubleLinkNode next) {
		this.next = next;
	}

	public DoubleLinkNode getPrev() {
		return prev;
	}

	public void setPrev(DoubleLinkNode prev) {
		this.prev = prev;
	}
}

	