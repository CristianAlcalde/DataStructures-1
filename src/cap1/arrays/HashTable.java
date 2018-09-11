package cap1.arrays;

public class HashTable {
	
	private Person[] elements;
	private float chargeFactor;
	private int size;
	
	public HashTable(int newSize) {
		System.out.println("Creating vector with size=" + newSize);
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
	
	public Person[] insertElement(String document, String name, String phone) {
		Person newPerson = new Person();
		newPerson.setDocument(document);
		newPerson.setName(name);
		newPerson.setPhone(phone);

		this.elements[hashFunction(document)] = newPerson;
		return this.elements;
	}
	
	public Person[] updateElement(String document, String newName, String newPhone) {
		this.elements[hashFunction(document)].setName(newName);
		this.elements[hashFunction(document)].setPhone(newPhone);
		return this.elements;
	} 
	
	public Person[] deleteElement(String document) {
		this.elements[hashFunction(document)] = null;
		return this.elements;
	}
	
	public int hashFunction(String document) {

		Integer ab = (Integer.parseInt(document)) % 100;
		Integer cd = (Integer.parseInt(document)) / 100 % 100;
		Integer ef = (Integer.parseInt(document)) / 100 / 100 % 100;
		Integer gh = (Integer.parseInt(document)) / 100 / 100 / 100 % 100;
		Integer ij = (Integer.parseInt(document)) / 100 / 100 / 100 / 100 % 100;
		Integer kl = (Integer.parseInt(document)) / 100 / 100 / 100 / 100 / 100 % 100;
		Integer mn = (Integer.parseInt(document)) / 100 / 100 / 100 / 100 / 100 % 100;

		return ((ab + cd + ef + gh + ij + kl + mn) % this.size);

	}	

}
