package cap2.lists;

public class Queue {
	QueueNode first;
	QueueNode last;
	int size = 0;
	
	
	public QueueNode getFirst() {
		return first;
	}

	public void setFirst(QueueNode first) {
		this.first = first;
	}

	public QueueNode getLast() {
		return last;
	}

	public void setLast(QueueNode last) {
		this.last = last;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}


	// CRUD
	// Metodo Encolar
	public String enQueue(String document, String name, String phone) {
		QueueNode newNode = new QueueNode(document, name, phone);
		if(this.first == null) {
			this.first = newNode;
			this.last = newNode;
		} else {
			this.last.setNext(newNode);
			this.last = newNode;
		}
		this.size = this.size + 1;
		return newNode.getPerson().getDocument();
	}
	
	// Metodo atender persona en la cola
	public void deQueue() {
		this.first = this.first.getNext();
		this.size = this.size - 1;
	}
	
}
