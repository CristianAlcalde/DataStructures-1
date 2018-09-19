package cap2.lists;

public class DoubleLinkedList {

	private DoubleLinkedNode head;
	private DoubleLinkedNode tail;
	private DoubleLinkedNode cursor;

	public DoubleLinkedNode getCursor() {
		return cursor;
	}

	public void setCursor(DoubleLinkedNode cursor) {
		this.cursor = cursor;
	}

	public DoubleLinkedNode getHead() {
		return head;
	}

	public void setHead(DoubleLinkedNode head) {
		this.head = head;
	}

	public DoubleLinkedNode getTail() {
		return tail;
	}

	public void setTail(DoubleLinkedNode tail) {
		this.tail = tail;
	}

}
