package cap1.arrays;

public class Matrix {
	// Step 1. Create attributes
	private int tamx,tamy;
	private int[][] matriz;
	
	// Step 1.1. Create Constructor
	public Matrix(int newTamx, int newTamy) {
		System.out.println("Se creo una matriz de tamaño=" + newTamx + "," + newTamy );
		this.tamx = newTamx;
		this.tamy = newTamy;
		this.matriz = new int[newTamx][newTamy];
	}
	
	
	// Step 2. Create methods
	// Step 2.1. Generate encapsulation methods
	public int obtieneTamX(){
		return tamx;
	}
     
	public int obtieneTamY(){
		return tamy;
	}
	
	public void asignaTamX(int nuevoTamX) {
		this.tamx = nuevoTamX;
	}
	
	public void asignaTamY(int nuevoTamY) {
		this.tamy = nuevoTamY;
	}

	public int[][] obtieneMatriz() {
		return matriz;
	}

	public void setMatriz(int[][] nuevaMatriz) {
		this.matriz = nuevaMatriz;
	}
		
	// Step 2.2. Create CRUD methods
	public int[][] insertaValor(int valor, int posX, int posY) {
		this.matriz[posX][posY] = valor;
		return this.matriz;
	}
	
	public int buscaValorPorPosicion(int posX, int posY) {
		return this.matriz[posX][posY];
	}
	
	public String buscaPosicionPorValor(int valor) {
		String result = "-1,-1";
		
		// Recorrer el vector buscando el elemento a eliminar
		for (int i = 0; i < tamy; i++) {
			for (int j = 0; j < this.tamx; j++) {
			// Si el elemento es encontrado reemplazarlo por 0
				if (matriz[i][j] == valor) {
					result = i+","+j;
				}
			}
		}
		return result;
	}
	
	
	public int[][] actualizaValor(int nuevoValor, int posX, int posY ) {
		this.matriz[posX][posY] = nuevoValor;
		return this.matriz;
	}
	
	public int[][] borrarValor(int valor) {
		// Recorrer el vector buscando el elemento a eliminar
		for (int i = 0; i < this.tamy; i++) {
			for (int j = 0; j < this.tamx; j++) {
			// Si el elemento es encontrado reemplazarlo por 0
				if (this.matriz[i][j] == valor) {
					this.matriz[i][j] = 0;
				}
			}
		}
		return this.matriz;
	}
		
	
}
