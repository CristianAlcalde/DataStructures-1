package cap1.arrays; //

import Utils.Person;

public class HashTable {
	// Step 1. Create attributes
	private Person[] elements;
	private float chargeFactor;
	private int size;

	// Step 1.1. Create Constructor
	public HashTable(int newSize) {
		System.out.println("vector is created with size = " + newSize);
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

	// Creating Hash Function 
	public int hashFunction(String document) {
		
		int documentLength = document.length(); 
		
		switch (documentLength) {
			case 9:	document = "0" + document;
					break;
			case 8:	document = "00" + document;
					break;
			case 7:	document = "0000" + document;
					break;
			case 6:	document = "0000" + document;
					break;
			case 5:	document = "00000" + document;
					break;
			default:	document = "" + document;
            		break;
		} 
		
		String a = document.substring(0,2);
		String b = document.substring(2,4);
		String c = document.substring(4,6);
		String d = document.substring(6,8);
		String e = document.substring(8,10);
		
		int result = ((Integer.parseInt(a) + Integer.parseInt(b) + Integer.parseInt(c) +
						Integer.parseInt(d) + Integer.parseInt(e)) % this.size); 
		
		return result;
		
	}
	
	// Step 2.2. Create CRUD methods

	public Person[] insertElement(String document, String name, String phone) {
		
		Person newPerson = new Person();
		
		newPerson.setDocument(document);
		newPerson.setName(name);
		newPerson.setPhone(phone);
		
		int element = hashFunction(document);
		
		this.elements[element] = newPerson;
		
		return this.elements;
	}

	public Person[] deleteElement(String document) {
		
		int element = hashFunction(document);
		
		this.elements[element] = null;
		return this.elements;

	}
	
	public Person[] updateElement(String document, String newName, String newPhone) {
		
		int element = hashFunction(document);
		
		this.elements[element].setName(newName);
		this.elements[element].setPhone(newPhone);
		
		return this.elements;

	}
	
	public Person[] searchElementByPosition(String document) {
		
		String DocPerson = this.elements[hashFunction(document)].getDocument();
		
		if (document == DocPerson) {
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

