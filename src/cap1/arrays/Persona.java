package cap1.arrays;

public class Persona {

	private String documento;
	private String nombre;
	private String telefono;
	
	public Persona (String documento,String nombre,String telefono)
	{
		this.documento = documento;
		this.nombre    = nombre;
		this.telefono  = telefono;
	}
	
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public boolean assertArrayEquals(Persona[] per1, Persona[] per2) {

		boolean result = false;
		HashTable hashtable = new HashTable(12);
		if (per1[hashtable.funcionHash(this.documento,0)].documento.equals(per2[hashtable.funcionHash(this.documento,0)].documento)) {
			if (per1[hashtable.funcionHash(this.documento,0)].nombre.equals(per2[hashtable.funcionHash(this.documento,0)].nombre)) {
				if (per1[hashtable.funcionHash(this.documento,0)].telefono.equals(per2[hashtable.funcionHash(this.documento,0)].telefono)) {
					result = true;
				}
			}

		}
		return result;
	}
	
}