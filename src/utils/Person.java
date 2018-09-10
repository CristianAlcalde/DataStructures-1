package utils;

import cap1.arrays.HashTable;

public class Person {

	// Step 1. Create attributes
	private String document;
	private String name;
	private String phone;

	// Step 2. Create methods
	// Step 2.1. Generate encapsulation methods

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public boolean Equals(Person[] onePerson, Person[] twoPerson) {
		boolean result = false;
		HashTable hash = new HashTable(13);
		if (onePerson[hash.hashFunction(this.document)].document.equals(twoPerson[hash.hashFunction(this.document)].document)) {
			result = true;
		}
		return result;
	}
	

}
