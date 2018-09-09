package cap1.arrays;

public class Person {
	
	private String documento;
	private String nombre;
	private String telefono;
	
	public Person(String documento,String nombre,String telefono) {
		this.documento=documento;
		this.nombre=nombre;
		this.telefono=telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	

}

