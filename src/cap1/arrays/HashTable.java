package cap1.arrays;

public class HashTable {

	// Step 1. Create attributes

	private Person[] elements;
	private float chargeFactor;
	private int size;

	// Step 1.1. Create Constructor

	public HashTable(int newSize) {
		System.out.println("Creating tabla with size=" + newSize);
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
	// Step 2.2. Create CRUD methods

	public int hashFunction(String document) {
		Integer numero = Integer.parseInt(document) * Integer.parseInt(document);
		int digit = numero.toString().length();
		int hashValue = Integer.parseInt(numero.toString().substring((digit / 2), ((digit / 2) + 1)));
		return hashValue;
	}

	public Person[] insertElement(String name, String document, String telephone) {
		Person personInserted = new Person ();
		this.elements[hashFunction(document)]= personInserted;
		return this.elements;
		
	}
}