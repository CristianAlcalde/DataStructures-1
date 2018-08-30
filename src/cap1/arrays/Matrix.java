package cap1.arrays;

public class Matrix {
	// Step 1. Create attributes
	private int size;
	private int size2;
	private int[][] elements;
	
	// Step 1.1. Create Constructor
		public Matrix(int newsize,int newsize2)
		{
			this.size = newsize;
			this.size2 = newsize2;
			this.elements = new int[newsize][newsize2];
		}
	// Step 2.1. Generate encapsulation methods
		
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getSize2() {
		return size2;
	}
	public void setSize2(int size2) {
		this.size2 = size2;
	}
	public int[][] getElements() {
		return elements;
	}
	public void setElements(int[][] elements) {
		this.elements = elements;
	}	
	// Step 2.2. Create CRUD methods
	//Insert in Matrix
	public int[][] insertMatrix(int element, int fil, int col){
		this.elements[fil][col] = element;
		return this.elements;
		
	}
	public int searchMatrix(int fil,int col) {
		return this.elements[fil][col];
	}
	
	public int searchMatrixValue(int element) {
		int result=-1;
		for (int i = 0; i < elements.length; i++) {
			for (int j = 0; j < elements.length; j++)
			{
			if (elements[i][j] == element) {
				result = element;
			}
			}
		}
		return result;
	}
	
	public int[][] updateMatrix(int element, int fil, int col)
	{
		this.elements[fil][col] = element;
		return this.elements;
		
	}
	
	public int[][] deleteMatrix(int element)
	{
		for (int i = 0; i < elements.length; i++)
		{
		 for (int j = 0; j < elements.length; j++)
		 {
			 if (elements[i][j] == element)
			 {
				this.elements[i][j] = 0;
			 }
		 }
		}
		return this.elements;
	}
	
	public void listarMatrix()
	{
		for (int i = 0; i < size; i++)
		{
			System.out.println(" ");
			for (int j = 0; j < size2; j++)
			{
				System.out.print(elements[i][j]+" ");
			}
		}
	}
	
}
