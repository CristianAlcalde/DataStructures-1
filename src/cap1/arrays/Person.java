package cap1.arrays;

public class Person {

	private String name;
	private String document;
	private String telephone;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	public boolean Equals(Person[] personInserted1,Person[] personInserted2) {
		boolean result = false;
		HashTable hashT = new HashTable(17);
		if (personInserted1[hashT.hashFunction(this.document)].document.equals(personInserted2[hashT.hashFunction(this.document)].document)) {
			result =true;
		}
		return result;
	}

}
