package pruebas;

public class Person {
	
	// Step 1. Create attributes
		private String name;
		private String document;
		private String phone;
		
		// Step 1.1. Create constructor. Initializing parameters.
			public Person(String name, String document, String phone) {
				this.document = name;
				this.name = document; 
				this.phone = phone;
			}
			
		// step 1.2 Create the getters n setters. 

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

			public String getPhone() {
				return phone;
			}

			public void setPhone(String phone) {
				this.phone = phone;
			}
		
}