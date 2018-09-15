package cap1.arrays;

import utils.Person;

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
		if (document.length() == 9) {
			document = "0" + document;
		}
		if (document.length() == 8) {
			document = "00" + document;
		}
		if (document.length() == 7) {
			document = "000" + document;
		}
		if (document.length() == 6) {
			document = "00000" + document;
		}
		if (document.length() == 5) {
			document = "000000" + document;
		}
		String a = document.substring(0,2);
		String b = document.substring(2,4);
		String c = document.substring(4,6);
		String d = document.substring(6,8);
		String e = document.substring(8,10);
		return ((Integer.parseInt(a) + Integer.parseInt(b) + Integer.parseInt(c) +
				Integer.parseInt(d) + Integer.parseInt(e)) % this.size);
		
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

	public Person[] searchElementByPosition(String document) {
		if (document == this.elements[hashFunction(document)].getDocument()) {
			return this.elements;
		} else {
			return null;
		}
	}

	public float chargeFactor(float porcentage) {
		this.setChargeFactor(porcentage / elements.length);
		return this.getChargeFactor();

	}

}
