package cap1.arrays;

public class Person {

	
	
	private String Document;
	private String Name;
	private String Phone;
	
	
	public String getDocument() {
		return Document;
	}
	public void setDocument(String document) {
		Document = document;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	
	
	public boolean assertArrayEquals(int documento, Person[] person1, Person[] person2) {
		boolean resquest = false;
		HashTable Hash = new HashTable(13);
		if(person1[Hash.HashFuntion(documents).documento]==person2[Hash.HashFuntion(documents).documento]) {
			
			resquest = true;
			
		}else {
			
		}
		
		
		
		return resquest;
	}
	
}
