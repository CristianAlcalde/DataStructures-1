package cap1.arrays;

public class Matrix {
	// Step 1. Create attributes
	private int tamFila;
	private int tamColumna;
	private int[][] matriz;
	
	// Step 1.1. Create Constructor
	public Matrix(int nuevoTamFila, int nuevoTamColumna) {
		System.out.println("Creando matriz con tamaño=" + nuevoTamFila + "*" + nuevoTamColumna);
		this.tamFila = nuevoTamFila;
		this.tamColumna = nuevoTamColumna;
		this.matriz = new int[nuevoTamFila][nuevoTamColumna];
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
		this.matriz= matriz;
	}
		
	// Step 2.2. Create CRUD methods
	public int[][] insertarElementos(int elemento, int posFila, int posColumna){
		this.matriz[posFila][posColumna] = elemento;
		return this.matriz;
	}
	
	
	
}
