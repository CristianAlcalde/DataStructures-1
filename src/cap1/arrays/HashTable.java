package cap1.arrays;

public class HashTable {

	// Step 1. Create attributes
	person[] elements;
	float chargefactor;
	int size;

	

	// Step 2. Create methods
	// Step 2.1. Generate encapsulation methods
	public person[] getElements() {
		return elements;
	}

	public void setElements(person[] elements) {
		this.elements = elements;
	}

	public float getChargefactor() {
		return chargefactor;
	}

	public void setChargefactor(float chargefactor) {
		this.chargefactor = chargefactor;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	// Step 1.1. Create Constructor
	public HashTable(int newSize) {
		System.out.println("Creating tabla with size=" + newSize);
		this.size = newSize;
		this.elements = new person[newSize];

	}

	// Step 2.2. Create CRUD methods

	public int hashfuntion(String element) {
		Integer numero = Integer.parseInt(element) * Integer.parseInt(element);
		int cifras = numero.toString().length();
		int valorHash = Integer.parseInt(numero.toString().substring((cifras / 2), ((cifras / 2) + 1)));
		return valorHash;

	}

	public String[] insertElement(String[] person1) {
		return person1;
	}
	

}
