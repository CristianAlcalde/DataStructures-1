package cap1.arrays;

public class person {
	
	// Step 1. Create attributes
	String document;
	String name;
	String phone;
	
	// Step 2. Create methods
			// Step 2.1. Generate encapsulation methods
	public String getDocument() {
		return document;
	}
	public void setDocument(String doc) {
		this.document = doc;
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
	public boolean delete(String document) {
		return false;
	}
	public void insertElement(String name2, String document2) {
		
	}
	
	public boolean assertArrayEquals(int documento, person[] person1, person[] person2) {
		boolean resquest = false;
		HashTable Hash = new HashTable(13);
		if(person1[Hash.hashfuntion(document)]==person2[Hash.hashfuntion(document)]) {
			
			resquest = true;
			
		}else {
			
		}
	
		return resquest;
		
	}
	public void Equals(person[] expectedValue, person[] actualValue) {
		// TODO Auto-generated method stub
		
	}
	
	
		
	}


	


