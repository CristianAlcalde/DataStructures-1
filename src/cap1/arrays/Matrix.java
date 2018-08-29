package cap1.arrays;

public class Matrix {
	// Step 1. Create attributes
	private int tamano;
	private int[][] elementos;
	
	// Step 1.1. Create Constructor
	public Matrix(int nuevoTamano) {
		System.out.println("Creating vector with size=" + nuevoTamano);
		this.tamano = nuevoTamano;
		this.elementos = new int[nuevoTamano][nuevoTamano];
	}	
	
	// Step 2. Create methods
		// Step 2.1. Generate encapsulation methods
		public int getTamano() {
			return tamano;
		}

		public void seTtamano(int size) {
			this.tamano = size;
		}

		public int[][] getElementos() {
			return elementos;
		}

		public void setElementos(int[][] elementos) {
			this.elementos = elementos;
		}

	
	// Step 2. Create methods
	// Step 2.1. Generate encapsulation methods
	// Step 2.2. Create CRUD methods
}
