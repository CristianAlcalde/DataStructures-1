package cap1.arrays;

public class Vector {
	// Step 1. Create attributes
	private int size;
	private int[] elements;

	// Step 1.1. Create Constructor
	public Vector(int newSize) {
		System.out.println("Creating vector with size=" + newSize);
		this.size = newSize;
		this.elements = new int[newSize];
	}

	// Step 2. Create methods
	// Step 2.1. Generate encapsulation methods
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int[] getElements() {
		return elements;
	}

	public void setElements(int[] elements) {
		this.elements = elements;
	}

	// Step 2.2. Create CRUD methods
	public int[] insertElement(int element, int position) {
		this.elements[position] = element;
		return this.elements;
	}

	public int searchElementByPosition(int position) { // Se inserta un elemento para despues buscarlo
		return this.elements[position];
	}
	
	public boolean searchElementByValue(int element) {
		boolean result = false;
		// Recorrer el vector buscando el elemento a eliminar
		for (int i = 0; i < elements.length; i++) {
			// Si el elemento es encontrado reemplazarlo por 0
			if (elements[i] == element) {
				result = true;
			}
		}
		return result;
	}

	public int[] updateElement(int newElement, int position) {
		this.elements[position] = newElement;
		return this.elements;
	}

	public int[] deleteElement(int element) {

		// Recorrer el vector buscando el elemento a eliminar
		for (int i = 0; i < elements.length; i++) {
			// Si el elemento es encontrado reemplazarlo por 0
			if (elements[i] == element) {
				elements[i] = 0;
			}
		}
		return this.elements;
	}
	
	// Metodo Listar
		public void listarElementos(){
			for(int i=0; i<elements.length; i++) {
				System.out.print(elements[i] + " ");
				}
		}
	
	
	
	
}
