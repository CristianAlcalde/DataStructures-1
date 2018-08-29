package cap1.arrays;

public class Matrix {
	// Step 1. Create attributes

	private int size;
	private int[][] elements;
	
	// Step 1.1. Create Constructor		
	public Matrix(int newsizex, int newsizey) {
		System.out.println("Creating vector with size=" );
		this.size = size;
		this.elements = new int[newsizex][newsizey];
	}
	// Step 2. Create methods
		// Step 2.1. Generate encapsulation methods
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int[][] getElement() {
		return elements;
	}
	public void setElement(int[][] element) {
		this.elements = element;
	}
	
	// Step 2.2. Create CRUD methods
	
	public int [][] insertElement(int element1 ,int positionx,int positiony) {
		this.elements[positionx][positiony] = element1;
		return this.elements;
	}
	
	public int searchElementByPosition(int positionx, int positiony) {
		return this.elements[positionx][positiony];
	}
	public int searchElementByValue(int element) {
		int result = -1;
		// Recorrer el vector buscando el elemento a eliminar
		for (int i = 0; i < 3 ; i++) {
			for (int j = 0; i < 3; j++) {
			// Si el elemento es encontrado reemplazarlo por 0
			if (elements[i][j] == element) {
				result = elements [i][j];
			}
			}
		}
		return result;
	}
	public int[][] updateElement(int newElement, int positionx, int positiony) {
		this.elements[positionx][positiony] = newElement;
		return this.elements;
	}
	
	public int[][] deleteElement( int positionx, int positiony) {
		int element=-1;
		// Recorrer el vector buscando el elemento a eliminar
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
			// Si el elemento es encontrado reemplazarlo por 0
			if (elements[i][j] == element) {
				elements[i][j] = 0;
			}
			}			
		}
		return this.elements;
	
	}
}