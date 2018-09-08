package cap1.arrays;

public class HashTable {
	// Step 1. Create attributes
	    private int size;	
	    private Person[] elements; //Import to Person. 
		private float chargeFactor;
		int cont = 0; // definir funcion de este int 

		// Step 1.1. Create Constructor
		public HashTable(int newSize) {
			System.out.println("Creating vector with size: " + newSize);
			this.size = newSize;
			this.elements = new Person[newSize];
			//this.elements = new Person[newSize];
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
		
/*

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

			Integer index = suma % elements.length;

			return index;

		}

		// Creating chargeFactor methods
		public float chargeFactor(float numElements) {
			this.setChargeFactor(numElements / elements.length);
			return this.getChargeFactor();
		}

		// Step 3. Create CRUD methods

		// Step 3.1 Creating Insert methods
		public Person[] insertElements(Person element, String document) {
			this.elements[hashFunction(document)] = element;
			cont = cont + 1;
			float porcent = chargeFactor(cont);
			if (porcent > 0.5) {
				System.out.println("The charge factor is " + porcent * 100 + "%");
			}

			return this.elements;
		}

		// Step 3.2 Creating Search methods
		public Person[] searchElements(String document) { // Se inserta un elemento para despues buscarlo
			if (document == elements[hashFunction(document)].getDocument()) {
				return this.elements;
			} else {
				return null;
			}
		}

		// Step 3.3 Creating Update methods
		public Person[] updateElements(Person newPerson, String document) {
			this.elements[hashFunction(document)] = newPerson;
			return this.elements;
		}

		// Step 3.4 Creating Delete methods
		public Person[] deleteElements(String document) {
			float porcent;
			if (document == elements[hashFunction(document)].getDocument()) {
				this.elements[hashFunction(document)] = null;
				cont = cont - 1;
				porcent = chargeFactor(cont);
				if (porcent > 0.5) {
					System.out.println("The charge factor is " + porcent * 100 + "%");
				}
				return this.elements;
			} else {
				porcent = chargeFactor(cont);
				if (porcent > 0.5) {
					System.out.println("The charge factor is " + porcent * 100 + "%");
				}
				return this.elements;
			}

		}
*/


}
