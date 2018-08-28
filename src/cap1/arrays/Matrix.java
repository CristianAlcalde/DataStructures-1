package cap1.arrays;

public class Matrix {
	// Step 1. Creando atributos
		private int filas;
		private int columnas;
		private int[] elements;
		
		public Matrix(int newFilas, int newColumnas) {
			System.out.println("Creating matrix with filas"+newFilas);
			System.out.println("Creating matrix with columnas"+newColumnas);
			this.filas = newFilas;
			this.columnas = newColumnas;
			this.elements = new int[newFilas];
			
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

		public int[] getElements() {
			return elements;
		}

		public void setElements(int[] elements) {
			this.elements = elements;
		}

		// Step 2.2. Creando CRUD metodos
		public int[] insertElement(int element, int position) {
			this.elements[position] = element;		
			return this.elements;
		}
		
		public int searchElement(int position) {
			return this.elements[position];
		}
		
		
}
