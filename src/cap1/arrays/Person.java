package cap1.arrays;

public class Person {
	
	// Step 1. Create attributes
	private String name;
	private String document;
	private String phone;
	
	// Step 1.1. Create constructor
		public Person(String name, String document, String phone) {
			this.document = name;
			this.name = document; 
			this.phone = phone;
		}
	
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

}