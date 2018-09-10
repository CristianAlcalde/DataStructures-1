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
	
	
	public boolean assertArrayEquals(Person[] person1, Person[] person2) {
		boolean resquest = false;
		
		HashTable Hash = new HashTable(11);
		
		if(person1[Hash.HashFuntion(getDocument())].getDocument()==person2[Hash.HashFuntion(getDocument())].getDocument()){
			
			resquest = true;
			
		}else {
			
			resquest = false;
		}
		
		return resquest;
	}
	
}
