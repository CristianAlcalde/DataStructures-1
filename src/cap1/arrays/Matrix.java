package cap1.arrays;

public class Matrix {
	// Step 1. Create attributes
	private int tamFila;
	private int tamColumna;
	private int[][] matriz;
	int[] vec;

	// Step 1.1. Create Constructor
	public Matrix(int nuevoTamFila, int nuevoTamColumna) {
		System.out.println("Creando matriz con tamaño=" + nuevoTamFila + "*" + nuevoTamColumna);
		this.tamFila = nuevoTamFila;
		this.tamColumna = nuevoTamColumna;
		this.matriz = new int[nuevoTamFila][nuevoTamColumna];
		this.vec = new int[nuevoTamFila];
	}

	// Step 2. Create methods
	// Step 2.1. Generate encapsulation methods
	public int getTamFila() {
		return tamFila;
	}

	public void setTamFila(int tamFila) {
		this.tamFila = tamFila;
	}

	public int getTamColumna() {
		return tamColumna;
	}

	public void setTamColumna(int tamColumna) {
		this.tamColumna = tamColumna;
	}

	public int[][] getMatriz() {
		return matriz;
	}

	public void setMatriz(int[][] matriz) {
		this.matriz = matriz;
	}

	// Step 2.2. Create CRUD methods

	// Método Insertar

	public int[][] insertarElementos(int elemento, int posFila, int posColumna) {
		this.matriz[posFila][posColumna] = elemento;
		return this.matriz;
	}

	// Metodo Listar

	public void listarElementos() {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println("");

		}

	}

	// Metodo Buscar

	public boolean buscarElemento(int elementoBuscado) {
		int resultado = -1;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] == elementoBuscado) {
					resultado = elementoBuscado;

				}
			}
		}
		if (resultado != -1) {
			return true;
		} else {
			return false;
		}

	}

	// Metodo Eliminar

	public boolean eliminarElemento(int elemento) {
		boolean resultado = false;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] == elemento) {
					matriz[i][j] = 0;
					resultado = true;
				}
			}
		}
		return resultado;

	}

	// Método Actualizar

	public int[][] actualizarElemento(int nuevoElemento, int fila, int columna) {
		this.matriz[fila][columna] = nuevoElemento;
		return this.matriz;
	}

}
