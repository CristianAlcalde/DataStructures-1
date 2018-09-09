package cap1.arrays;

public class Person {
	
	private String Documento;
	private String Name;
	private String Phone;
	public String getDocumento() {
		return Documento;
	}
	public void setDocumento(String documento) {
		Documento = documento;
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
	
	public boolean equals(Person person2) {
		boolean response=false;
		if (this.Name.equals(person2.Name) && this.Documento.equals(person2.Documento) && this.Phone.equals(person2.Phone));
		{
			response=true;
		}
		
		return response;
	}

}
