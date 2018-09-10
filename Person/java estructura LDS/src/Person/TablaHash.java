package Person;
public class TablaHash {
	// Step 1. Creo los atributos
	private int size;
	private Person[] elements;
    private float ChargeFactor; // me cagar el factor de carga 
	
	// Step 1.1. Creo el Constructor
	public TablaHash(int newSize) {
		System.out.println("Creating vector with size=" + newSize);
		this.size = newSize;
		this.elements = new Person[newSize];
	}

	// Step 2. Creo metodos
	// Step 2.1. Generate encapsulation methods
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Person[] getElements() {
		return elements;
	}

	public void setElements(Person[] elements) {
		this.elements = elements;
	}
     
	public float getChargeFactor() {
		return ChargeFactor;
	}
	
	public void setChargeFactor(float ChargeFactor) {
		this.ChargeFactor = ChargeFactor;
	}
	
	// la funcion hash (Metodo de mitad del cuadrado)
		public int hashFunction(String document) {
			int numero = Integer.parseInt(document);
			double cuadrado1 = Math.pow(numero, 2);
			String cuadrado = String.valueOf(cuadrado1);
			int cifras = cuadrado.length();
			int mitad = (int) cifras / 2;
			String valor = cuadrado.substring(mitad - 1, mitad + 1);
			int valorHash = Integer.parseInt(valor) % size;
			return valorHash;
		}
	
	// Step 2.2. Create CRUD methods
	public Person[] insertElement(Person persona) {
	     int position = hashFunction(persona.getDocument());
	     this.elements[position] = persona;
		return this.elements;
	}

	public Person searchElementByPosition(Person persona) {
		int Position = hashFunction(persona.getDocument());
		return this.elements[Position];
	}
	
	
	public Person[] updateElement(Person newElement, Person persona) {
		int position = hashFunction(persona.getDocument());
		this.elements[position] = newElement;
		return this.elements;
	}

	public Person[] deleteElement(Person persona) {

		int position = hashFunction(persona.getDocument());
		this.elements[position] = new Person();
		return this.elements;
	}
} 

	
	
	
	
	
	
	
	

