package cap1.arrays;

public class Person {
	// Step 1. Create attributes
	private String document;
	private String name;
	private String phone;
	
	// Step 2. Generate encapsulation methods
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
		
	public boolean Equals(Person[] person1, Person[] person2) {
    	boolean respon = false;
    	HashTable hash= new HashTable(17);
    	if(person1[hash.FuntionHash(this.document)].document.equals(person2[hash.FuntionHash(this.document)].document)) {
    		respon=true;
    	}
    	return respon;
    }
	
	
}
