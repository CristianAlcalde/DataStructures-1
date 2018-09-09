package cap1.arrays;

public class Person {

	// Step 1. Create attributes
	
		private String document;
		private String name;
		private String phone;
		
	//step 1.1 Create constructor
		
		
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
		
		public boolean equals(Person[] person1,Person[] person2) {
	    	boolean respon = false;
	    	HashTable hash= new HashTable(17);
	    	if(person1[hash.hashFunction(this.document)].document.equals(person2[hash.hashFunction(this.document)].document)) {
	    		respon=true;
	    	}
	    	return respon;
	    }
	 // Step 2.2. Create CRUD methods
		
		
		
		
		
		
}
