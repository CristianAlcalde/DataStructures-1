package cap1.arrays;

public class Matrix {
	// Step 1. Create attributes
	
	private int filas, columnas;
	private int [][] elementos;
	
	// Step 1.1. Create Constructor
	
	public Matrix(int newFilas, int newColumnas) {
		this.filas= newFilas;
		this.columnas= newColumnas;
		this.elementos = new int[newFilas][newColumnas];
				}
	
	// Step 2. Create methods
	// Step 2.1. Generate encapsulation methods	
		
		 public int getColumnas() { 
             return columnas; 
     } 

     public void setColumnas(int columnas) { 
             this.columnas = columnas; 
     } 

     public int[][] getElementos() { 
             return elementos; 
     } 

     public void setElementos(int[][] elementos) { 
             this.elementos = elementos; 
     } 

     public int getFilas() { 
             return filas; 
     } 

     public void setFilas(int filas) { 
             this.filas = filas; 
     }	
	
    // Step 2.2. Create CRUD methods

     public int[][] insertarElementos(int elementos, int filas, int columnas ) {
 		this.filas=filas;
 		this.columnas=columnas;
 		this.elementos[filas][columnas]=elementos;
 				return this.elementos;
 	}
     
     public int buscarElemento(int elemento) {
 		for (int filas=0; filas<this.filas; filas++);
 		for (int columnas=0; columnas<this.columnas; columnas++) {
 		if (this.elementos[filas][columnas]==elemento)
 			System.out.println(filas + "," + columnas);
 	}
 		return elemento; 
}
   
     public int[][] actualizarElemento(int elemento, int fila, int columna) {
 		this.elementos[fila][columna] = elemento;
 		return this.elementos;
 	}
     
     public int[][] eliminarElemento(int elemento) {
 		
 		for(int i=0; i<this.elementos.length; i++) {
 			for (int j = 0; j < elementos.length; j++) {
 				
 				if (elementos[i][j] == elemento) {
 					elementos[i][j] = 0;
 				}
 			}
 		}
 		return this.elementos;
 	}

}
