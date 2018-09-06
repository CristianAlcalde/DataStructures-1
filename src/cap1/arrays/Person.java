package cap1.arrays;
import javax.lang.model.element.Element;

public class Person {
	// Step 1. Create attributes
	private Element[] elements; 
	private float chargeFactor;
	private int size;

	// Step 1.1. Create Constructor
	public Person(int newSize) {
		System.out.println("Creating hastTable with size= " + newSize);
		this.size=newSize;		
		this.elements = new Element [newSize];
		this.chargeFactor = 0; 
		}

	// Step 2. Create methods
    // Step 2.1. Generate encapsulation methods
	public Element[] getElements() {
		return elements;
	}

	public void setElements(Element[] elements) {
		this.elements = elements;
	}

	public float getChargeFactor() {
		return chargeFactor;
	}

	public void setChargeFactor(float chargeFactor) {
		this.chargeFactor = chargeFactor;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	// Step 2.2. Create CRUD methods
	
}
	
	


/*
 * public int funcionHash(int llave) { n = llave % k; return n; }
 * 
 * public int hash(int clave) { return clave % this.size; }
 * 
 * public void setInsertar(int clave, String valor) { int posicion =
 * hash(clave); vector[posicion].insertarInicio(clave, valor); }
 * 
 * public String setBuscar(int clave) { int posicion = hash(clave); return
 * vector[posicion].getBuscar(clave); }
 * 
 * public void Actualizar(int nuevaclave, String nuevavalor, int clave) { int
 * posicion = hash(clave); vector[posicion].setActualizar(nuevaclave,
 * nuevavalor, clave); }
 * 
 * public void listar() { for (int i = 0; i < vector.length; i++) {
 * vector[i].mostrar(); } } }
 * 
 */
