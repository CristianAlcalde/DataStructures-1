package cap1.arrays;

import utils.Person;

public class HashTable {
	private float ChargeFactor;
	int Size;
	private Person[] elements;
	
	public HashTable(int newSize) {
		System.out.println("Creating vector with size: " + newSize);
		this.Size = newSize;
		this.elements = new Person[newSize];
	}
	
	//In this line, create the getters n setters.}
	
	public float getChargeFactor() {
		return ChargeFactor;
	}
	public void setChargeFactor(float chargeFactor) {
		ChargeFactor = chargeFactor;
	}
	public int getSize() {
		return Size;
	}
	public void setSize(int size) {
		Size = size;
	}
	public Person[] getElements() {
		return elements;
	}
	public void setElements(Person[] elements) {
		this.elements = elements;
	}
	
	//Create CRUD Methods + Funtion Hash.
	
	public int hashFunction(String document) {

		Integer a = (Integer.parseInt(document)) % 100;
		Integer b = (Integer.parseInt(document)) / 100 % 100;
		Integer c = (Integer.parseInt(document)) / 100 / 100 % 100;
		Integer d = (Integer.parseInt(document)) / 100 / 100 / 100 % 100;
		Integer e = (Integer.parseInt(document)) / 100 / 100 / 100 / 100 % 100;
		Integer f = (Integer.parseInt(document)) / 100 / 100 / 100 / 100 / 100 % 100;
		Integer g = (Integer.parseInt(document)) / 100 / 100 / 100 / 100 / 100 % 100;

		return ((a + b + c + d + e + f + g) % this.Size);

	}

	public Person[] insertElement(String document, String name, String phone) {
		Person newPerson = new Person();
		newPerson.setDocument(document);
		newPerson.setName(name);
		newPerson.setPhone(phone);

		this.elements[hashFunction(document)] = newPerson;
		return this.elements;
	}
	
	public Person[] deleteElement(String document) {
		this.elements[hashFunction(document)] = null;
		return this.elements;
	}
	
	public Person[] updateElement(String document, String newName, String newPhone) {
		this.elements[hashFunction(document)].setName(newName);
		this.elements[hashFunction(document)].setPhone(newPhone);
		return this.elements;
	} 

}
