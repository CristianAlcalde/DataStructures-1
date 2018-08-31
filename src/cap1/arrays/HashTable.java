package cap1.arrays;

public class HashTable {

	// Step 1. Create attributes
	private Person[] elements;
	private float chargeFactor;
	private int size;

	// Step 1.1. Create Constructor
	public HashTable(int newSize, int newchargeFactor) {
		System.out.println("Creating vector with size=" + newSize);
		this.size = newSize;
		this.chargeFactor = newchargeFactor;
		this.elements = new Person[newSize];
	}
	// Step 2. Create methods
	// Step 2.1. Generate encapsulation methods

	public float getChargeFactor() {
		return chargeFactor;
	}

	public Person[] getElements() {
		return elements;
	}

	public void setElements(Person[] elements) {
		this.elements = elements;
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
}

