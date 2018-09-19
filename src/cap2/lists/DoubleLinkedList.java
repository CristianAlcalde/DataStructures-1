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
	
	
}
