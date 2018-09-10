package cap1.arrays;

public class HashTable {

	private String[] Persona;
	private float chargeFactor;
	private int size;

	public HashTable(int size) {
		this.size = size;
		this.Persona = new String[size];
	}

	public String[] getPersona() {
		return Persona;
	}

	public void setPersona(String[] persona) {
		Persona = persona;
	}

	public float getChargeFactor() {
		return chargeFactor;
	}

	public void setChargeFactor(float chargeFactor) {
		this.chargeFactor = chargeFactor;
	}

	public int hashFuncion(String documento) {
		// la funcion hash sirve para ingresar un elemento y me devuelve la posicion
		// donde se va a guardar
		int cedula = Integer.parseInt(documento);
		double hola = Math.pow(cedula, 2);
		String mitad = Double.toString(hola);
		int cantidad = mitad.length();
		int mitad1 = cantidad / 2;
		int numero1 = Integer.parseInt(mitad.substring(mitad1 - 2, mitad1 - 1));
		int numero2 = Integer.parseInt(mitad.substring(mitad1 - 1, mitad1));
		int suma = numero1 + numero2;
		int valorHash = suma % size;
		return valorHash;
	}

	public String[] insertartElemento(String elemento) {
		int posicion = hashFuncion(elemento);
		this.Persona[posicion] = elemento;
		return this.Persona;
	}

	public int buscarElemento(String elemento) {
		int posicion = hashFuncion(elemento);
		return posicion;

	}

	public String[] borrarElemento(String elemento) {
		int posicion = hashFuncion(elemento);
		this.Persona[posicion] = null;
		return this.Persona;
	}

	public String[] actualizarElemto(String elemento, String elementoActualizado) {
		int posicion = hashFuncion(elemento);
		this.Persona[posicion] = elementoActualizado;
		return this.Persona;
	}

}
