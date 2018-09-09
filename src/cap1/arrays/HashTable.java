package cap1.arrays;

public class HashTable {

	private Person[] elements;
	private float chargeFactor;
	private int size;

	public HashTable(int newSize) {
		System.out.println("Creating vector with size: " + newSize);
		this.size = newSize;
		this.elements = new Person[newSize];
	}

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

	public Integer hashFunction(String cedula) {

		Integer vector[] = new Integer[cedula.length() / 2 + 1];
		int suma = 0;
		int j = 0;

		if (cedula.length() % 2 == 0) {
			for (int i = 0; i <= cedula.length() - 2; i += 2) {
				suma = suma + Integer.parseInt(cedula.substring(i, i + 2));
				j += 1;
				vector[j] = 0;
			}
		} else {
			for (int i = 0; i <= cedula.length() - 2; i += 2) {
				suma = suma + Integer.parseInt(cedula.substring(i, i + 2));
				j += 1;
				vector[j] = Integer.parseInt(cedula.substring(cedula.length() - 1, cedula.length()));
			}
		}

		Integer resultado = suma % elements.length;

		return resultado;
	}
	
	public float chargeFactor(float numElements) {
		this.setChargeFactor(numElements / elements.length);
		return this.getChargeFactor();
	}

	public Person[] insertElement(Person element, String identification) {
		this.elements[hashFunction(identification)] = element;
		return this.elements;
	}
	
	public Person[] searchElementByValue(String cedula) { 
		if (cedula == elements[hashFunction(cedula)].getDocumento()) {
			return this.elements;
		} else {
			return null;
		}
	}
	public Person[] updateElement(Person newPerson, String cedula) {
		this.elements[hashFunction(cedula)] = newPerson;
		return this.elements;
	}
	
	public Person[] deleteElements(String cedula) {
		if (cedula == elements[hashFunction(cedula)].getDocumento()) {
			this.elements[hashFunction(cedula)] = null;
			}
			return this.elements;
	}
}