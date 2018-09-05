package cap1.arrays;

public class HashTable {
	private String[] Person;
	private float chargeFactor;
	private int size;

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

	// CRUD
	public String[] insertElement(String element) {
		int position = hashFunction(element);
		this.Person[position] = element;
		return this.Person;
	}

	// HashFunction (Metodo de plegado)
	public int hashFunction(String element) {
		int valorHash = 0;
		int size = element.length();
		int number = (int) Math.sqrt(size);
		// Se hace condicional para saber si se puede separar por la misma cantidad
		if (number % 1 == 0) {
			// Se separan los numeros para poder sumarlos
			String[] concatenar = new String[number];
			// Se hace for para limpiar ya que el vector inicializa cond atos null
			for (int i = 0; i < number; i++) {
				concatenar[i] = "";
			}
			int contador = 0;
			// Se hace for para llenar las ranuras de la tabla hash de tamaño number
			for (int c = 0; c < number; c++) {
				// Se hace for para guardar size numero en cada pocision de la tabla
				for (int z = 0; z < number; z++) {
					concatenar[c] += element.split("")[z + contador];
				}
				contador += number;
			}
			// Se suma los elementos
			for (int i = 0; i < number; i++) {
				valorHash += Integer.parseInt(concatenar[i]);
			}
			valorHash = valorHash % this.size;
		} else {
			// Se crea un vector con el tamaño entero de numero ya que no se puede dividir
			// en
			// partes iguales
			for (int i = 0; i < size; i++) {
				valorHash += Integer.parseInt(element.split("")[i]);
			}
			valorHash = valorHash % this.size;
		}
		return valorHash;
	}

	public int hashFunction1(String element) {
		int numero = Integer.parseInt(element);
		Integer cuadrado = numero * numero;
		int cifras = cuadrado.toString().length();
		int mitad = (int) cifras / 2;
		String valor = cuadrado.toString().substring(mitad - 1, mitad + 1);
		int valorHash = Integer.parseInt(valor) % size;
		return valorHash;
	}

}
