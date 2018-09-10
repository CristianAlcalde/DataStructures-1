package cap1.arrays;

import Utils.Person;

public class HashTable {

	// Step 1. Create attributes
	private Person[] elements;
	private float chargeFactor;
	private int size;

	// Step 1.1. Create Constructor
	public HashTable(int newSize) {
		System.out.println("Creating vector with size = " + newSize);
		this.chargeFactor = 0;
		this.size = newSize;
		this.elements = new Person[newSize];
	}
	// Step 2. Create methods
	// Step 2.1. Generate encapsulation methods

	public Person[] getElements() {
		return elements;
	}

	public void setElements(Person[] elements) {
		this.elements = elements;
	}

	public float getChargeFactor() {
		return chargeFactor;
	}

	public void setChargeFactor(float chargeFactor) {
		this.chargeFactor = chargeFactor;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	// FUNCION HASH
	public int hashFunction(String document) {

		Integer a = (Integer.parseInt(document)) % 100;
		Integer b = (Integer.parseInt(document)) / 100 % 100;
		Integer c = (Integer.parseInt(document)) / 100 / 100 % 100;
		Integer d = (Integer.parseInt(document)) / 100 / 100 / 100 % 100;
		Integer e = (Integer.parseInt(document)) / 100 / 100 / 100 / 100 % 100;
		Integer f = (Integer.parseInt(document)) / 100 / 100 / 100 / 100 / 100 % 100;
		Integer g = (Integer.parseInt(document)) / 100 / 100 / 100 / 100 / 100 % 100;

		return ((a + b + c + d + e + f + g) % this.size);
	}
	// Step 2.2. Create CRUD methods

	public Person[] insertElement(String document, String name, String phone) {
		Person nuevapersona = new Person();
		nuevapersona.setDocument(document);
		nuevapersona.setName(name);
		nuevapersona.setPhone(phone);
		this.elements[hashFunction(document)] = nuevapersona;
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

	public Person [] searchElementByPosition(String document) {
		//int hashFunction;
		//hashFunction = this.hashFunction(document);
		if (document == this.elements[hashFunction(document)].getDocument()) {
			return this.elements;
		} else {
			return null;
		}
	}

}
