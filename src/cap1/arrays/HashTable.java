package cap1.arrays;

public class HashTable {

	// Step 1. Create attributes
	private Person[] elements;
	private float chargeFactor;
	private int size;
	

	// Step 1.1. Create Constructor
	public HashTable(int newSize) {
		System.out.println("Creating vector with size: " + newSize);
		this.size = newSize;
		this.elements = new Person[newSize];
	}

	// Step 2. Generate encapsulation methods
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
	
	
	
	// metodo para hallar el indice Hash
	public Integer hashFunction(String code) {

		Integer[] vec = new Integer[code.length() / 2 + 1];
		int suma = 0;
		int pos = 0;

		if (code.length() % 2 == 0) {
			for (int i = 0; i <= code.length() - 2; i += 2) {
				String separate = code.substring(i, i + 2);
				vec[pos] = Integer.parseInt(separate);
				pos = pos + 1;
				vec[pos] = 0;
			}
		} else {
			for (int i = 0; i <= code.length() - 2; i += 2) {
				String separate = code.substring(i, i + 2);
				vec[pos] = Integer.parseInt(separate);
				pos = pos + 1;
				vec[pos] = Integer.parseInt(code.substring(code.length() - 1, code.length()));
			}
		}

		for (int i = 0; i < vec.length; i++) {
			suma = suma + vec[i];
		}
		
		Integer index = suma%elements.length;

		return index;
		
	}
	
	// Step 3. Create CRUD methods
	public Person[] insertElements(Person element, String position) {
		this.elements[hashFunction(position)] = element;
		return this.elements;
	}
	
	
	
	
	
	
	
	
	

	// Step 3.1 Creating Insert methods

}
