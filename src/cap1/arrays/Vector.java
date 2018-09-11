package cap1.arrays;

public class Vector {
	// Step 1. Create attributes
	private int size;
	private int[] elements;

	// Step 1.1. Create Constructor
	public Vector(int newSize) {
		System.out.println("Creating vector with size=" + newSize);
		this.size = newSize;
		this.elements = new int[newSize];
	}

	// Step 2. Create methods
	// Step 2.1. Generate encapsulation methods
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int[] getElements() {
		return elements;
	}

	public void setElements(int[] elements) {
		this.elements = elements;
	}

	// Step 2.2. Create CRUD methods
	public int[] insertElement(int element, int position) {
		this.elements[position] = element;
		return this.elements;
	}

	public int searchElementByPosition(int position) {
		return this.elements[position];
	}
	
	public int searchElementByValue(int element) {
		int result = -1;
		// Recorrer el vector buscando el elemento a eliminar
		for (int i = 0; i < elements.length; i++) {
			// Si el elemento es encontrado reemplazarlo por 0
			if (elements[5] == element) {
				result = i;
			}
		}
		return result;
	}

	public int[] updateElement(int newElement, int position) {
		this.elements[position] = newElement;
		return this.elements;
	}

	public int[] deleteElement(int element) {

		// Recorrer el vector buscando el elemento a eliminar
		for (int i = 0; i < elements.length; i++) {
			// Si el elemento es encontrado reemplazarlo por 0
			if (elements[i] == element) {
				elements[i] = 0;
			}
		}
		return this.elements;
	}
}

_______________________________________________
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
[22:30, 10/9/2018] Leonardo (La Rosa): esta es la clase persona
[22:30, 10/9/2018] Leonardo (La Rosa): 

}
[22:31, 10/9/2018] Leonardo (La Rosa): y  este es el test
[22:31, 10/9/2018] Leonardo (La Rosa): 
	
	
package test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertArrayEquals;
import org.junit.jupiter.api.Test;
import cap1.arrays.HashTable;
import cap1.arrays.Person;

class HasTable {


	@Test
	void testhashFunction() {
		HashTable testedHashTable =new HashTable(13);
		String Person1="1032363651";
		Integer expectedValue= 7;
		Integer actualValue=testedHashTable.hashFunction(Person1);
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	void testchargeFactor() {
		HashTable testedHashTable =new HashTable(8);
		float expectedValue= 0.5f;
		float actualValue=testedHashTable.chargeFactor(4);
		assertEquals(expectedValue, actualValue);
	}
	@Test
	void testinsertElement() {
		HashTable testedHashTable =new HashTable(13);
		Person[] expectedValue = new Person[13];
		Person Person1 = new Person("1054922771","Estefania","321456789");
		expectedValue[7]=Person1;
		Person[] actualValue =testedHashTable.insertElement(Person1, Person1.getDocument());
		assertArrayEquals(expectedValue, actualValue);
	}
	@Test
	void testsearchElementByValue() {
		HashTable testedHashTable = new HashTable(13); 
		Person[] expectedValue = new Person[13];	
		Person Person1 = new Person("1054922771", "Estefania", "312456789");
		expectedValue[7] = Person1;
		testedHashTable.insertElement(Person1, Person1.getDocument());
		Person[] actualValue = testedHashTable.searchElementByValue(Person1.getDocument());	
		assertArrayEquals(expectedValue, actualValue);
	}
	@Test
	void testupdateElement() {
		
		HashTable testedHashTable = new HashTable(13);
		Person[] expectedValue = new Person[13];			
		Person Person1 = new Person("1054922771", "Estefania", "312456789");
		Person Person2 = new Person("1054922771", "Teresa", "312456789");
		expectedValue[7] = Person2;
		testedHashTable.insertElement(Person1, Person1.getDocument());
		Person[] actualValue = testedHashTable.updateElement(Person2, Person2.getDocument());		
		assertArrayEquals(expectedValue, actualValue);
	}
	@Test
		void testDeleteElements() {
		HashTable testedHashTable = new HashTable(13); 
		Person[] expectedValue = new Person[13];			
		Person Person1 = new Person("1054922771", "Estefania", "312456789");
		expectedValue[7] = null;
		testedHashTable.insertElement(Person1, Person1.getDocument());
		Person[] actualValue = testedHashTable.deleteElements(Person1.getDocument());		
		assertArrayEquals(expectedValue, actualValue);
	}



}