package cap1.arrays;

public class Matrix {
	// Step 1. Create attributes
	private int file;
	private int column;
	private int[][] elements;

	// Step 1.1. Create Constructor
	public Matrix(int newFile, int newColumn) {
		System.out.println("Creating Matrix with size= " + newFile + " x " + newColumn);
		this.file = newFile;
		this.column = newColumn;
		this.elements = new int[newFile][newColumn];
	}

	// Step 2. Create methods
	// Step 2.1. Generate encapsulation methods

	public int getFile() {
		return file;
	}

	public void setFile(int file) {
		this.file = file;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	public int[][] getElements() {
		return elements;
	}

	public void setElements(int[][] elements) {
		this.elements = elements;
	}

	// Step 2.2. Create CRUD methods
	// INSERTAR ELEMENTO
	public int[][] insertElement(int element, int x, int y) {
		this.elements[x][y] = element;
		return this.elements;
	}

	// BUSCAR ELEMENTO en POSICION
	public int searchElementByxyPosition(int x, int y) {
		return this.elements[x][y];
	}

	// BUSCAR EL VALOR
	public int searchElementoByValue(int value) {
		int result = 6;
		// Recorrer el vector buscando el elemento a eliminar
		for (int i = 0; i < elements.length; i++) {
			// Si el elemento es encontrado reemplazarlo por 0
			for (int j = 0; j < elements.length; j++) {
				if (elements[i][j] == value) {
					result = value;
				}
			}
		}
		return result;

	}

	// ACTUALIZAR
	public int[][] updateElement(int newElement, int x, int y) {
		this.elements[x][y] = newElement;
		return this.elements;
	}

	// LISTAR
	public int[][] listElement() {
		for (int i = 0; i < elements.length; i++) {
			for (int j = 0; j < elements.length; j++) {
				System.out.print(elements[i][j] + " ");
			}
			System.out.println(" ");
		}
		return elements;

	}

	// ELIMINAR
	public int[][] deleteElement(int element) {
		for (int i = 0; i < elements.length; i++) {
			for (int j = 0; j < elements.length; j++) {
				if (elements[i][j] == element) {
					elements[i][j] = 0;
				}
			}
		}
		return this.elements;
	}
}
