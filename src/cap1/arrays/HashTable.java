package cap1.arrays;

import utils.person;

public class HashTable {
	// Step 1. Create attributes
	    private int size;	
	  //1.1. Import to class Person.
	    private person[] elements;  
		private float chargeFactor;


		// Step 1.2. Create Constructor
		public HashTable(int newSize) {
			System.out.println("Creating vector with size: " + newSize);
			this.size = newSize;
			this.elements = new person[newSize];
		
		}

		// Step 2. Create methods
		// Step 2.1. Generate encapsulation methods
		public int getSize() {
			return size;
		}


		public void setSize(int size) {
			this.size = size;
		}


		public person[] getElements() {
			return elements;
		}


		public void setElements(person[] elements) {
			this.elements = elements;
		}


		public float getChargeFactor() {
			return chargeFactor;
		}


		public void setChargeFactor(float chargeFactor) {
			this.chargeFactor = chargeFactor;
		}
		
		// Step 3. Create charge factor methods
		public float chargeFactor1(float nElements) {
			this.setChargeFactor(nElements / elements.length);
			return this.getChargeFactor();
		}
		
		// Step 4. Create index methods
		public Integer hashFunction(String document) {

			Integer vec[] = new Integer[document.length() / 2 + 1];
			int sum = 0;
			int A = 0;

			if (document.length() % 2 == 0) {
				for (int i = 0; i <= document.length() - 2; i += 2) {
					sum = sum + Integer.parseInt(document.substring(i, i + 2));
					A += 1;
					vec[A] = 0;
				}
			} else {
				for (int i = 0; i <= document.length() - 2; i += 2) {
					sum = sum + Integer.parseInt(document.substring(i, i + 2));
					A += 1;
					vec[A] = Integer.parseInt(document.substring(document.length() - 1, document.length()));
				}
			}

			Integer resultado = sum % elements.length;

			return resultado;
		}
		
		public float chargeFactor(float numElements) {
		this.setChargeFactor(numElements / elements.length);
		return this.getChargeFactor();
		}

		public person[] insertElement(person element, String identification) {
			this.elements[hashFunction(identification)] = element;
			return this.elements;
		
		}
		public person[] updateElement(person newPerson, String cedula) {
			this.elements[hashFunction(cedula)] = newPerson;
			return this.elements;
		}
		
		public person[] deleteElements(String document) {
			if (document == elements[hashFunction(document)].getDocument()) {
				this.elements[hashFunction(document)] = null;
				}
				return this.elements;
		}

		public person[] searchElementByValue(String document) {
			String Document;
			if (document == elements[hashFunction(document)].getDocument()) { 
			return this.elements;
			} else {
				return null;
			}
		}
		
}