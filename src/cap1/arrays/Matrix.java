package cap1.arrays;

public class Matrix {
	// Step 1. Create attributes
	private int size;
	private int[][] elements;
	private int[][] expectedValue;
	
	public Matrix(int newsize,int newsize1) {
	// Step 1.1. Create Constructor
		System.out.println("Creating Matrix with size=" + newsize + newsize1);
		this.size = newsize;
		this.elements = new int[newsize] [newsize1];
	}
	// Step 2. Create methods
	// Step 2.1. Generate encapsulation methods
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int[][] getElements() {
		return elements;
	}
	public void setElements(int[][] elements) {
		this.elements = elements;
	}
	// Step 2.2. Create CRUD methods
	public int[][] insertElements(int rows,int columns, int elements) {
		this.elements[rows][columns]=elements;
		
		return this.elements;
	}
	public int[] searchElementByPosition(int position) {
		return this.elements[position];
	}
	public int searchElementsbyValue(int element) {
		int result=-1;
		for (int x =0; x <elements.length;x++) {
			for(int y=0; y <elements.length; y++) {
				if(elements[x][y]==element);
				result=element;
			}
		}
		return result;
	}
	public int[][] updateElements( int[] i,int position) {
		this.elements[position]= i;
		return this.elements;
	}
	public int [][] DeleteElements(int element){
		for(int x=0; x < elements.length; x ++) {
			for(int y=0; y < elements.length; y++) {
				elements[x][y]=element;
				element=0;
			}
		}
		return this.elements;
	}
	
	public static void listarMatriz(int rows,int columns) {
		int [][] matriz={{7,14,8,3},{6,19,7,2},{3,13,4,1}};
		for(int x = 0; x <= matriz.length;x++) {
			for(int y = 0; y <= matriz.length;y++) {
				System.out.println(matriz[x][y]);
			}
		}
	}
}
