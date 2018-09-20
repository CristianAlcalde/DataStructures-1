package cap2.lists;

import utils.Person;

public class QueueNode {
	
	private Person person;
	private QueueNode next;
	
	public QueueNode(String document, String name, String phone) {
		this.person = new Person(document, name, phone);
	}
	
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public QueueNode getNext() {
		return next;
	}
	public void setNext(QueueNode next) {
		this.next = next;
	}
	public QueueNode() {
	}

}
