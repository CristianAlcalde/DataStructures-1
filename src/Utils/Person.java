package Utils; // 

import cap1.arrays.HashTable;

public class Person {

	String document;
	String name;
	String phone;

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

	public boolean equals(Person[] person1, Person[] person2) {
		
		boolean response = false;
		HashTable hash = new HashTable(12);
		
		int position = hash.hashFunction(this.document);
		
		if (person1[position].document.equals(person2[position].document)) {
			response = true;
		}

		return response;

	}

}

