package cap1.arrays;

public class Person {
	String name;
	String document;
	
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
	
	public boolean equals(Person[] person1, Person[] person2) {
		boolean response = false;
		HashTable hash = new HashTable(13);
		if(person1[hash.functionHash(document)]==person2[hash.functionHash(document)]) {
			response = true;
		}
		else {
			
		}
		return response;
	}
	

}
