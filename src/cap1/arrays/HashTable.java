package cap1.arrays;

public class HashTable {
	// Step 1. Create attributes
	    private int size;	
	  //1.1. Import to class Person.
	    private Person[] elements;  
		private float chargeFactor;


		// Step 1.2. Create Constructor
		public HashTable(int newSize) {
			System.out.println("Creating vector with size: " + newSize);
			this.size = newSize;
			this.elements = new Person[newSize];
		
		}

		// Step 2. Create methods
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
			return chargeFactor;
		}


		public void setChargeFactor(float chargeFactor) {
			this.chargeFactor = chargeFactor;
		}
		
		// Step 3. Create charge factor methods
		public float chargeFactor1(float numElements) {
			this.setChargeFactor(numElements / elements.length);
			return this.getChargeFactor();
		}
		
		// Step 4. Create index methods
		public Integer hashFunction(String document) {

			Integer vector[] = new Integer[document.length() / 2 + 1];
			int plus = 0;
			int A = 0;

			if (document.length() % 2 == 0) {
				for (int i = 0; i <= document.length() - 2; i += 2) {
					plus = plus + Integer.parseInt(document.substring(i, i + 2));
					A += 1;
					vector[A] = 0;
				}
			} else {
				for (int i = 0; i <= document.length() - 2; i += 2) {
					plus = plus + Integer.parseInt(document.substring(i, i + 2));
					A += 1;
					vector[A] = Integer.parseInt(document.substring(document.length() - 1, document.length()));
				}
			}

			Integer resultado = plus % elements.length;

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
		public Person[] updateElement(Person newPerson, String cedula) {
			this.elements[hashFunction(cedula)] = newPerson;
			return this.elements;
		}
		
		public Person[] deleteElements(String document) {
			if (document == elements[hashFunction(document)].getDocument()) {
				this.elements[hashFunction(document)] = null;
				}
				return this.elements;
		}

		public Person[] searchElementByValue(String document) {
			String Document;
			if (document == elements[hashFunction(document)].getDocument()) { 
			return this.elements;
			} else {
				return null;
			}
		}
		
}