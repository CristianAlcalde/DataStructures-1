package cap1.arrays;

public class Matrix {
	// Step 1. Creando atributos
	private int filas;
	private int columnas;
	private int[][] elements;

	public Matrix(int newFilas, int newColumnas) {
		System.out.println("Creating matrix with filas" + newFilas);
		System.out.println("Creating matrix with columnas" + newColumnas);
		this.filas = newFilas;
		this.columnas = newColumnas;
		this.elements = new int[newFilas][newColumnas];

	}

	// Step 2. Creando metodos
	// Step 2.1. Generando encapsulacion

	public int getFilas() {
		return filas;
	}

	public void setFilas(int filas) {
		this.filas = filas;
	}

	public int getColumnas() {
		return columnas;
	}

	public void setColumnas(int columnas) {
		this.columnas = columnas;
	}

	public int[][] getElements() {
		return elements;
	}

	public void setElements(int[][] elements) {
		this.elements = elements;
	}

	// Step 2.2. Creando CRUD metodos
	public int[][] insertElemento(int elemento, int position1, int position2) {
		this.elements[position1][position2] = elemento;
		return this.elements;
	}

	public int searchElemento(int position1, int position2) {
		return this.elements[position1][position2];
	}

	public int searchElementbyValue(int element) {
		int result = 0;
		for (int i = 0; i < elements.length; i++) {
			for (int j = 0; j < elements[i].length; j++) {

				if (elements[i][j] == element)
					result = element;
			}
		}
		return result;
	}

	public int[][] listElement() {
		for (int i = 0; i < elements.length; i++) {
			for (int j = 0; j < elements[i].length; j++) {
				System.out.print(elements[i][j] + " ");
				if ((j + 1) == elements[i].length)
					System.out.println("");
			}
		}
		return elements;
	}

	public int[][] updateElement(int Nelement, int position1, int position2) {
		this.elements[position1][position2] = Nelement;
		return this.elements;
	}

	public int[][] deleteElement(int elemento) {
		for (int i = 0; i < elements.length; i++) {
			for (int j = 0; j < elements[i].length; j++)
				if (elements[i][j] == elemento)
					elements[i][j] = 0;
		}
		return this.elements;
	}

}
