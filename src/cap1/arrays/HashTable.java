package cap1.arrays;

public class HashTable {

	// Step 1. Create attributes
	private Person[] elements;
	private float chargeFactor;
	private int size;

	// Step 1.1. Create Constructor
	public HashTable(int newSize) {
		System.out.println("Creating vector with size=" + newSize);
		this.size = newSize;
		float newchargeFactor = 0; // Creado por el sistema
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

	// Step 2.2. Create CRUD methods
//INSERTAR
	public Person insertElement(Person element, int position) {
		return this.elements[position] = element;
		// return this.elements;
	}

	public Person hashFunction(String document, int module) {

		String a = document.substring(0, 2);
		System.out.println("Dato en [0, 2] = " + a);
		String b = document.substring(2, 4);
		System.out.println("Dato en [2, 4] = " + b);
		String cinco = document.substring(5, 5);
		String c = document.substring(4, 6);
		System.out.println("Dato en [4, 6] = " + c);
		String d = document.substring(6, 8);
		System.out.println("Dato en [6, 8] = " + d);

		if ((document.length()) % 2 != 0) {
			document = "0" + document.charAt(8);
			System.out.println("Valor en la posición 8 : " + document);

		}
		String nueve = "00" + document.substring(9);
		String e = document.substring(8, 10) + document;
		System.out.println("Dato en [0, 2] = " + e);

		int Suma = Integer.parseInt(a) + Integer.parseInt(b) + Integer.parseInt(cinco) + Integer.parseInt(c)
				+ Integer.parseInt(d) + Integer.parseInt(nueve) + Integer.parseInt(e);

		System.out.println("La suma de las posiciones son: " + Suma);

		// TODO Auto-generated method stub

		return null;

	}

}
