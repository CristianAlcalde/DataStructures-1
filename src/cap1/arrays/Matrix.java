package cap1.arrays;

public class Matrix {
	// Step 1. Crear atributos
	private int columnas;
	private int filas;
	private int elementos[][];

	public Matrix(int filas, int columnas) {
		this.filas = filas;
		this.columnas = columnas;
		this.elementos = new int[this.filas][this.columnas];
	}
	// Step 2. crea methods
	// Step 2.1. genera el encapsulamiento de los metodos

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
		
	// Step 2.2. Creamos los CRUD

	public int insertarElemento(int filas, int columnas, int elementos) {

		this.elementos[filas][columnas] = elementos;
		return this.elementos[filas][columnas];

	}

	public int[][] updateElement(int filas, int columnas, int elementos) {

		this.elementos[filas][columnas] = elementos;
		return this.elementos;
	}

	public int[][] deleteElement(int filas, int columnas) {

		this.elementos[filas][columnas] = 0;
		return this.elementos;
	}

	public int[] serchElement(int elemento) {
		int[] salida = new int[2];
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				if (this.elementos[i][j] == elemento) {
					salida[0] = i;
					salida[1] = j;
					break;
				}
			}
		}
		return salida;
	}

}
