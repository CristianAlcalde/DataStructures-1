package cap1.arrays;

public class Person {
	private String name;
	private String document;
	private String phone;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDocument() {
		return document;
	}
	public void setDocument(String doc) {
		this.document = doc;
	}

	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public boolean delete(String document) {
		return false;
	}
	
	
	public boolean Equals(Person[] person1, Person[] person2) {
		boolean response = false;
		Hashtable hash = new Hashtable(13);
		if(person1[hash.Hashfunction(document)]==person2[hash.Hashfunction(document)]) {
			response = true;
		}
		else {
			
		}
		return response;
	}
	
	
}




