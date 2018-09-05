package cap1.arrays;

public class HashTable {
	private String[] Person;
	private float chargeFactor;
	private int size;
	private int contador = 0;

	// Se crea el contructor con la variable size
	public HashTable(int size) {
		this.size = size;
		Person = new String[size];
	}

	// Se encapsula las variables publicas
	public String[] getPerson() {
		return Person;
	}

	public void setPerson(String[] person) {
		Person = person;
	}

	public float getChargeFactor() {
		chargeFactor = contador / size;
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

	// HashFunction (Metodo de mitad del cuadrado)
	public int hashFunction(String element) {
		int numero = Integer.parseInt(element);
		double cuadrado1 = Math.pow(numero, 2);
		String cuadrado = String.valueOf(cuadrado1);
		int cifras = cuadrado.length();
		int mitad = (int) cifras / 2;
		String valor = cuadrado.substring(mitad - 1, mitad + 1);
		int valorHash = Integer.parseInt(valor) % size;
		contador++;
		return valorHash;
	}

	// CRUD
	public String[] insertElement(String element) {
		int position = hashFunction(element);
		this.Person[position] = element;
		return this.Person;
	}

	public int serchElement(String element) {
		int position = hashFunction(element);
		return position;
	}

	public String[] updateElement(String oldElement, String newElement) {
		int position = hashFunction(oldElement);
		this.Person[position] = newElement;
		return this.Person;
	}

	public String[] deleteElement(String element) {
		int position = hashFunction(element);
		this.Person[position] = "null";
		contador = contador - 1;
		return this.Person;
	}

	public String[] deletePosition(int position) {
		this.Person[position] = "null";
		contador = contador - 1;
		return this.Person;
	}

}
