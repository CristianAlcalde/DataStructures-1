package cap1.arrays;

public class HashTable {
	String[] Person;
	float chargeFactor;
	int size;

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
	public String[] insertElement(int position, String element) {
		this.Person[position] = element;
		return this.Person;
	}

	// HashFunetion (Metodo de plegado)
	public int hashFunction(String element) {
		int valorHash = 0;
		int size = element.length();
		int number = (int) Math.sqrt(size);
		// Se hace condicional para saber si se puede separar por la misma cantidad
		if (number % 1 == 0) {
			// Se separan los numeros para poder sumarlos
			String[] concatenar = new String[number];
			//Se hace for para limpiar ya que el vector inicializa cond atos null
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
			valorHash = valorHash%number;
			
		} else {

		}
		return valorHash;
	}

}
