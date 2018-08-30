package cap1.arrays;

public class Matrix {
	// Step 1. Create attributes
	private int sizeX;
	private int sizeY;
	private int[][] matrix;
		
	// Step 1.1. Create Constructor
	public Matrix(int newSizeX, int newSizeY) {
		System.out.println("Creating vector with size= " + newSizeX + " En X y " + newSizeY +  " en Y");
		this.sizeX = newSizeX;
		this.sizeY = newSizeY;
		this.matrix = new int[newSizeX][newSizeY];
	}
	
	// Step 2. Create methods
	
		// Step 2.1. Generate encapsulation methods
	public int getSizeX() {
		return sizeX;
	}

	public void setSizeX(int sizeX) {
		this.sizeX = sizeX;
	}
	
	public int getSizeY() {
		return sizeY;
	}

	public void setSizeY(int sizeY) {
		this.sizeY = sizeY;
	}

	public int[][] getMatrix() {
		return matrix;
	}

	public void setMatrix(int[][] matrix) {
		this.matrix = matrix;
	}
	
	// Step 2.2. Create CRUD methods
	public int[][] insertElement(int element, int positionX, int positionY) {
		this.matrix[positionX][positionY] = element;
		return this.matrix;
	}
	
	public int searchElementByPosition(int positionX,int positionY) {
		return this.matrix[positionX][positionY];
	}
	
	public int searchElementByValue(int element) {
		int result = -1;
		// Recorrer la matrix buscando el elemento a eliminar
		for (int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
			// Si el elemento es encontrado reemplazarlo por 0
				if ( matrix[i][j] == element) {
					result = element;
				}
			}
		}
		return result;
	}
	
	public int[][] updateElement(int newElement, int positionX, int positionY) {
		this.matrix[positionX][positionY] = newElement;
		return this.matrix;
	}
	
	public int[][] deleteElement(int element) {
		// Recorrer la matrix buscando el elemento a eliminar
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
			// Si el elemento es encontrado reemplazarlo por 0
				if (matrix[i][j] == element) {
					matrix[i][j] = 0;
				}
			}
		}
		return this.matrix;
	}
	
	public int[][] listElements() {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
				if ((j + 1) == matrix[i].length)
					System.out.println("");
				}
		}
	return matrix;
	}
	
}
