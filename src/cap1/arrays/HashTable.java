package cap1.arrays;

public class HashTable {
	
	private Persona[] elementos;
	private float factorCambio;
	private int tamano;
	
	public HashTable (int nuevoTamano)
	{
		this.elementos = new Persona[nuevoTamano];
		this.factorCambio = 0;
		this.tamano = nuevoTamano;
	}

	public Persona[] getElementos() {
		return elementos;
	}

	public void setElementos(Persona[] elementos) {
		this.elementos = elementos;
	}

	public float getFactorCambio() {
		return factorCambio;
	}

	public void setFactorCambio(float factorCambio) {
		this.factorCambio = factorCambio;
	}

	public int getTamano() {
		return tamano;
	}

	public void setTamano(int tamano) {
		this.tamano = tamano;
	}
	//Funcion recursiva
	public int funcionHash (String documento,int cont)
	{
		int cedula   = Integer.parseInt(documento);
		int div      = cedula/100;
		int modulo   = cedula % 100;
		int suma   	 = cont + modulo;
		String docto = Integer.toString(div);		
		if (div == 0)
		{
		  return suma % this.tamano;
		}
		else {
		 return funcionHash (docto,suma);
		}
	}
	
	public Persona[] InsertHash(String documento, String nombre, String telefono) {
		Persona nuevaPersona = new Persona(documento, nombre, telefono);
		this.elementos[funcionHash(documento,0)] = nuevaPersona;
		this.setFactorCambio(getFactorCambio() + (float) 7.5);
		return this.elementos;
	}

	public Persona[] DeleteHash(String documento) {
		this.elementos[funcionHash(documento,0)] = null;
		this.setFactorCambio(getFactorCambio() - (float) 7.5);
		return this.elementos;
	}

	public String SearchHash(String documento) {
		String buscar = "";
		if (this.elementos[funcionHash(documento,0)].getDocumento().equals(documento)) {
			buscar = documento;
		}
		return buscar;
	}

	public Persona[] UpdateHash(String documento, String nombre, String telefono) {
		this.elementos[funcionHash(documento,0)].setNombre(nombre);
		this.elementos[funcionHash(documento,0)].setTelefono(telefono);
		return this.elementos;
	}

	public void ListaHash(String documento01,String documento02) {
		System.out.println("##### LISTA DE PERSONAS #####");
		System.out.println(this.elementos[funcionHash(documento01,0)].getDocumento()+ "," + this.elementos[funcionHash(documento01,0)].getNombre()+ "," +this.elementos[funcionHash(documento01,0)].getTelefono());
		System.out.println(this.elementos[funcionHash(documento02,0)].getDocumento()+ "," + this.elementos[funcionHash(documento02,0)].getNombre()+ "," +this.elementos[funcionHash(documento02,0)].getTelefono());
	}

}