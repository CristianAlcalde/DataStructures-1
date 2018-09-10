package cap1.arrays;

public class HashTable {

	// Step 1. Create attributes
	private Person[] elements;
	private int size;
	private float chargeFactor;

	// Step 1.1. Create Constructor
	public HashTable(int newSize) {
		System.out.println("Creating Hash Table with size = " + newSize);
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

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public float getChargeFactor() {
		return chargeFactor;
	}

	public void setChargeFactor(float changeFactor) {
		this.chargeFactor = changeFactor;
	}

	// Step 2.2. Create CRUD methods

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

	public Person[] insertElement(String document, String name, String phone) {
		Person newPerson = new Person();
		newPerson.setDocument(document);
		newPerson.setName(name);
		newPerson.setPhone(phone);

		this.elements[hashFunction(document)] = newPerson;
		this.setChargeFactor(this.getChargeFactor() + (float) 7.69);
		System.out.println("Charge factor (Insert Element):" + this.getChargeFactor() + "%");
		return this.elements;
	}

	public Person[] deleteElement(String document) {
		this.elements[hashFunction(document)] = null;
		this.setChargeFactor(this.getChargeFactor() - (float) 7.69);
		System.out.println("Charge factor (Delete Element):" + this.getChargeFactor() + "%");
		return this.elements;
	}

	public Person[] updateElement(String document, String newName, String newPhone) {
		this.elements[hashFunction(document)].setName(newName);
		this.elements[hashFunction(document)].setPhone(newPhone);
		return this.elements;
	}

	public boolean searchElement(String document) {
		boolean result = false;
		if (this.elements[hashFunction(document)].getDocument().equals(document)) {
			result = true;
		}
		return result;
	}

	public void listElement(String documentOnePerson, String documentTwoPerson, String documentThreePerson) {
		System.out.println("\n" + "*********************************List Hash Table.*********************************");
		System.out.println("****Firts Person****");
		System.out.println("Document:" + this.elements[hashFunction(documentOnePerson)].getDocument() + "\n" + "Name:"
				+ this.elements[hashFunction(documentOnePerson)].getName() + "\n" + "Phone:"
				+ this.elements[hashFunction(documentOnePerson)].getPhone() + "\n");
		
		
		System.out.println("****Second Person****");
		System.out.println("Document:" + this.elements[hashFunction(documentTwoPerson)].getDocument() + "\n" + "Name:"
				+ this.elements[hashFunction(documentTwoPerson)].getName() + "\n" + "Phone:"
				+ this.elements[hashFunction(documentTwoPerson)].getPhone() + "\n");
		
		System.out.println("****Third Person****");
		System.out.println("Document:" + this.elements[hashFunction(documentThreePerson)].getDocument() + "\n" + "Name:"
				+ this.elements[hashFunction(documentThreePerson)].getName() + "\n" + "Phone:"
				+ this.elements[hashFunction(documentThreePerson)].getPhone());
		System.out.println("\n" + "Charge factor (Lits Hash Table):" + this.getChargeFactor() + "%");
	}

}
