package cap1.arrays;

public class Matrix {
	// Step 1. Create attributes
	// Step 1.1. Create Constructor
	// Step 2. Create methods
	// Step 2.1. Generate encapsulation methods
	// Step 2.2. Create CRUD methods
	 private int fil;
	  private int col;
	  private int[][] matrix;
	  
	  public Matrix(int fil, int col) { 
		this.fil = fil;
	    this.col = col;
	    matrix = new int[fil][col];
	  }
	  
	  public void agregar(int i, int a, int valor) {
	    if ((i < fil) && (i >= 0) && (a < col) && (a >= 0))
	      matrix[i][a] = valor;
	  }
	  
	  public int eliminarElemento(int pos2, int pus) {
	    int i = 0;int a = 0;
	    System.out.println("eliminar algun elemento");
	    return matrix[i][a] = 0;
	  }
	  
	  public int listar()
	  {
	    for (int i = 0; i < fil; i++) {
	      for (int j = 0; j < col; j++) {
	        System.out.print(matrix[i][j] + " ");
	      }
	      System.out.println(" ");
	    }
	    return 0;
	  }
	  
	  public int multi() {
	    int mul = 0;
	    for (int i = 0; i < fil; i++) {
	      for (int j = 0; j < col; j++) {
	        mul = i * j;
	        System.out.print(mul);
	      }
	    }
	    
	    return mul;
	  }
	  
	  public int buscar(int i, int a) {
	    if ((i < fil) && (i >= 0) && (a < col) && (a >= 0)) {
	      System.out.print(matrix[i][a] + " ");
	      return matrix[i][a];
	    }
	    
	    return -1;
	  }
	  
	  public int actualizar(int i, int a, int valor)
	  {
	    if ((i < fil) && (i >= 0) && (a < col) && (a >= 0)) {
	      matrix[i][a] = valor;
	    }
	    return valor;
	  }
}

