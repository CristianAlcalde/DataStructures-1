package cap1.arrays;

public class Matrix {
	// Step 1. Create attributes
		private int size;
		private int[][] elements;
	// Step 1.1. Create Constructor
		public Matrix(int Cols, int Rows) {
			//System.out.println("Creating matrix with "+Cols+" columns and "+Rows+" rows.");
			this.size = Cols*Rows;
			this.elements = new int[Rows][Cols];
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
		//Insert a single element in one single position
		public int[][] insert_SingleElement(int element, int Row, int Col) {
			this.elements[Row][Col] = element;
			System.out.println("Adding a single element in the matrix");
			return this.elements;
		}
		
		//Insert many elements
		public int[][] insert_ManyElements(int[][] element_arr) {
			for(int x=0; x<(elements.length); x++) {
				for(int y=0; y<(elements[x].length); y++) {
					this.elements[x][y] = element_arr[x][y];
					System.out.println("Adding the element "+element_arr[x][y]);
				} 
			}
			return this.elements;
		}
		
		//Search an element in all positions, doesn't matter the position
		public boolean search_Element(int element){
			for(int x=0; x<(elements.length); x++) {
				for(int y=0; y<(elements[x].length); y++) {
					if(elements[x][y]==element) {
						return true; 
					}
				}
			}
			return false;
		}
		
		//Update a single element in one single position
		public int[][] update_SingleElement(int NewElement, int Row, int Col) {
			elements[Row][Col] = NewElement;
			return this.elements;
		}
		
		//Update many elements
			//We'll be interpreting a 0 as a way to keep the value in the respecting position
			//We take this by the following way: If you have {{1, 2, 3, 4}, {1, 2, 3, 4}}
			//and you want to update to {{1, 9, 9, 6}, {1, 2, 4, 4}} you MUST send {{0, 9, 9, 6}, {0, 0, 4, 0}}
		public int[][] update_ManyElements(int[][] element_arr_new) {
			for(int x=0; x<(elements.length); x++) {
				for(int y=0; y<(elements[x].length); y++) {
					this.elements[x][y] = element_arr_new[x][y];
				} 
			}
			return this.elements;
		}
		
		
		//Delete a single element
		//We assume that if the element is repeated, these element will be deleted too
		//We assume that 'delete' is setting a 0
		public int[][] remove_SingleElement(int element) {
			for(int x=0; x<(elements.length); x++) {
				for(int y=0; y<(elements[x].length); y++) {
					if(elements[x][y]==element) {
						elements[x][y] = 0;
					}
				} 
			}
			return this.elements;
		}
		
		//Delete all the matrix
		//We assume that 'delete' is setting a 0
		public int[][] remove_Matrix() {
			for(int x=0; x<(elements.length); x++) {
				for(int y=0; y<(elements[x].length); y++) {
			
						elements[x][y] = 0;
					
				} 
			}
			return this.elements;
		}
		
		
}
