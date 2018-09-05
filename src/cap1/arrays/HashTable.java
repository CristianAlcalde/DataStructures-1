package cap1.arrays;

public class HashTable {
	// Step 1. Create attributes
	
	private Persons[] elements;
	private float chargeFactor;
	private int size;
	
	// Step 1.1. Create Constructor
	public HashTable(int newSize) {
		this.chargeFactor=0;
		this.size = newSize;
		this.elements = new Persons[newSize];
	}
	
	// Step 2. Create methods
	// Step 2.1. Generate encapsulation methods
	
	public Persons[] getElements() {
		return elements;
	}
	public void setElements(Persons[] elements) {
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
	
	public int hashFunction(String Document) {

		String chainItem = Document.substring(0, 2)+ Document.substring(2, 4)+Document.substring(4, 6)+Document.substring(6, 8)+Document.substring(8, 10);
		
		return 0;
		
	}

}