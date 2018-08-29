package cap1.arrays;

public class Matrix {
	// Step 1. Create attributes
	private int size;
	private int[][] elements;
	
	// Step 1.1. Create Constructor
	public Matrix(int newsizex, int newsizey) {	
		System.out.println("Creating vector with size=");
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
	public int [][] insertElement(int element ,int positionA,int positionB) {
		this.elements[positionA][positionB] = element;
		return this.elements;
	}
	
	public int searchElementByPosition(int positionA,int positionB) {
	return this.elements[positionA][positionB];
	}
	
	public int searchElementByValue(int element) {
	int result = -1;
	// Recorrer la matriz buscando el elemento a eliminar
	for (int i = 0; i < elements.length; i++){
	for (int j = 0; j < elements.length; j++) {	
	// Si el elemento es encontrado reemplazarlo por 0
	if (elements[i][j] == element) {
	result = i;	
	}
	}
}
	return result;
	}

	public int[][] updateElement(int newElement, int positionA, int positionB) {
		this.elements[positionA][positionB] = newElement;
	return this.elements;
	}
	
}
