package cap1.arrays;

public class Matrix {
	// Step 1. Create attributes
	
	private int filas, columnas;
	private int [][] elementos;
	
	// Step 1.1. Create Constructor
	
	public Matrix(int newFilas, int NewColumnas) {
		System.out.println("Creating matrix with filas and columnas=" + newFilas, newColumnas);
		this.filas = newFilas;
		this.columnas = newColumnas
		this.elementos = new int[newFilas][newColumnas];
	
	// Step 2. Create methods
		
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
		
		
		
	// Step 2.1. Generate encapsulation methods
	// Step 2.2. Create CRUD methods
}
