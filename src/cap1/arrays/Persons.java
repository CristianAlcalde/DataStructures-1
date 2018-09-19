package cap1.arrays;

public class Persons {
	
	private int document; //Documento de identidá
	private String phone; //Teléfono de la persona
	private String name; //Nombre de la persona
	
	public Persons(){
		document = 0;
		name = "";
		phone = "";
	}

	public int getDocument() {
		return document;
	}

	public void setDocument(int document) {
		this.document = document;
	}

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
	
	
	
}
