package cap1.arrays;

public class HashTable {

	// Step 1. Creando atributos
	Person[] elements;
	float changeFactor;
	int size;

	// Step 2. Creando Metodos
	// Step 2.1. Generando metodos de encapsulacion

	public Person[] getElements() {
		return elements;
	}

	public void setElements(Person[] elements) {
		this.elements = elements;
	}

	public float getChangeFactor() {
		return changeFactor;
	}

	public void setChangeFactor(float changeFactor) {
		this.changeFactor = changeFactor;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	// 3. Creando Constructor

	public HashTable(int newsize) {
		this.size = newsize;
		this.changeFactor = 0;
		this.elements = new Person[newsize];
	}

	// 4. Creando Cruds.

	public int FuntionHash(String document) {
		// Se crea metodo del Plegado para la funcion Hash
		// Se Analiza el argumento de cadena como un entero.
		Integer OnePar = (Integer.parseInt(document)) % 100;
		Integer TwoPar = (Integer.parseInt(document)) / 100 % 100;
		Integer ThreePar = (Integer.parseInt(document)) / 100 / 100 % 100;
		Integer FourPar = (Integer.parseInt(document)) / 100 / 100 / 100 % 100;
		Integer FivePar = (Integer.parseInt(document)) / 100 / 100 / 100 / 100 % 100;
		Integer SixPar = (Integer.parseInt(document)) / 100 / 100 / 100 / 100 / 100 % 100;
		Integer SevenPar = (Integer.parseInt(document)) / 100 / 100 / 100 / 100 / 100 % 100;

		// Se suman todos los pares de digitos y se divide entre el tamaño de la tabla.
		// El resultado es el residuo.
		return ((OnePar + TwoPar + ThreePar + FourPar + FivePar + SixPar + SevenPar) % this.size);

	}
	
	public Person[] insertPerson(String name, String document, String phone) {
		Person NewDato = new Person();
	    NewDato.getDocument();
	    NewDato.getName();
	    NewDato.getPhone();
	    this.elements[FuntionHash(document)]= NewDato;
		return this.elements;
	}
	
	public Person searchPerson(String document) {
		return this.elements[FuntionHash(document)];
	}
	public Person[] updatePerson(Person newdocument,int FuntionHash) {
		this.elements[FuntionHash(null)]= newdocument;
		return this.elements;
	}
	public Person[] deletePerson(String document) {
		this.elements[FuntionHash(document)]=null;
		return this.elements;
	}
}