package cap1.arrays;

public class Person {
	
	// Step 1. Create attributes
	private String document;
	private String name;
	private String phone;
	
	// Step 1.1. Create Constructor
		public Person(String document, String name, String phone) {
			this.document = document;
			this.name = name;
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
