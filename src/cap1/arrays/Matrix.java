package cap1.arrays;

public class Matrix {
	int filas;
	int columnas;
	int [][]elemnts;
	
	public Matrix(int filas, int columnas) {
		System.out.print("Tamaño Matriz "+ filas+ " * " + columnas+" ");
		this.filas=filas;
		this.columnas=columnas;
		this.elemnts= new int[filas][columnas];
	}


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


	public int[][] getElemnts() {
		return elemnts;
	}


	public void setElemnts(int[][] elemnts) {
		this.elemnts = elemnts;
	}
	public int[][] insertarMatriz(int elemnts, int filas, int columnas) {
		this.elemnts[filas][columnas]=elemnts;
		return this.elemnts;
	}
	public int searchElementByPosition(int filas, int columnas) {
		return this.elemnts[filas][columnas];
	}
	
	public int searchElementByValue(int element) {
		int result = -1;
		// Recorrer el vector buscando el elemento a eliminar
		for (int i = 0; i < elemnts.length; i++) {
			for (int j = 0; j < elemnts.length; j++) {
			// Si el elemento es encontrado reemplazarlo por 0
				if (elemnts[i][j] ==element) {
					result = i;
				}
			}
		}
		return result;
	}
	
	public int[][] updateElement(int newElement,int filas, int columnas) {
		this.elemnts[filas][columnas] = newElement;
		return this.elemnts;
	}
	
	public int[][] deleteElement(int element) {

		// Recorrer el vector buscando el elemento a eliminar
		for (int i = 0; i < elemnts.length; i++) {
			for (int j = 0; j < elemnts.length; j++) {
			// Si el elemento es encontrado reemplazarlo por 0
				if (elemnts[i][j] == element) {
					elemnts[i][j] = 0;
				}
			}
		}
		return this.elemnts;
	}
	public void imprimirMatriz() {

	    for (int i = 0; i < filas; i++) {
	    	System.out.println(" ");
			for (int j = 0; j < columnas; j++) {
				System.out.print(elemnts[i][j]) ;


	        }
			
	    }
	}
}