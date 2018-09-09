package cap1.arrays;

public class HashTable {

	// Step 1. Create attributes
		
	    Person[] elements;
		float changeFactor;
		int size;
		private  String Person;
	// Step 1.1 Create constructor
		
		public HashTable(int newsize) {
			this.size = newsize;
			this.changeFactor = 0;
			this.elements = new Person[newsize];
		}

		
	// Step 2. Create methods
	// Step 2.1. Generate encapsulation methods	
			
		
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
		
		
	 // Step 2.2. Create CRUD methods
		
		public int hashFunction(String document) {
			
			Integer a = (Integer.parseInt(document)) % 100;
			Integer b = (Integer.parseInt(document)) / 100 % 100;
			Integer c = (Integer.parseInt(document)) / 100 / 100 % 100;
			Integer d = (Integer.parseInt(document)) / 100 / 100 / 100 % 100;
			Integer e = (Integer.parseInt(document)) / 100 / 100 / 100 / 100 % 100;
			Integer f = (Integer.parseInt(document)) / 100 / 100 / 100 / 100 / 100 % 100;
			Integer g = (Integer.parseInt(document)) / 100 / 100 / 100 / 100 / 100 % 100;

			return ((a + b + c + d + e  + f + g) % this.size);

		}
		
		public Person[] insertElement(String document, String name, String phone) {
			Person person1 = new Person();
			person1.setDocument(document);
			person1.setName(name);
			person1.setPhone(phone);
			this.elements[hashFunction(document)] = person1;
			return this.elements;

		}
		
		
		public Person[] deleteElement(String document) {
			this.elements[hashFunction(document)] = null;
			return this.elements;
		}
		
		
		public Person[] updateElement(Person newDocument,int HashFuntion) {
			this.elements[hashFunction(Person)]= newDocument;
			return this.elements;
		}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
