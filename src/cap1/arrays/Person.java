package cap1.arrays;
//import java.util.*;

public class Person {

private String name;
private String document;
private String phone;
//encapsulamiento
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
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

  public Person(String name,String document,String phone) {
	
	this.name = name;
	
	this.document = document;
	
	this.phone = phone;
	
	
}
	public Person () {
		
	}
	
	
}