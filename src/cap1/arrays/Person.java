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
	public void setDocument(String document2) {
		this.document = document2;
	}

	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	public boolean equals(Person person2) {
		boolean response = false;
		if(this.name.equals(person2.name) && (this.document.equals(person2.document))) {
			response = true;
			
		}
		
		return response;
		
	}
	public void equals(Person[] expectedValue, Person[] actualValue) {
		// TODO Auto-generated method stub
		
	}
}



