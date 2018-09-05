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
	public void setDocument(String document) {
		this.document = document;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
    public boolean equals(Person[] persona1,Person[] persona2) {
    	boolean respon = false;
    	HashTable hash= new HashTable(13);
    	if(persona1[hash.HashFuntion(this.document)].document.equals(persona2[hash.HashFuntion(this.document)].document)) {
    		respon=true;
    	}
    	return respon;
    }
}
