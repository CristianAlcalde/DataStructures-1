package cap1.arrays;

public class Matrix {
	// Step 1. Create attributes

		private int sizex;
		private int sizey;
		private int [][]elementsx,elementsy;
		// Step 2. Create methods
		public int getSizex() {
			return sizex;
		}
		public void setSizex(int sizex) {
			this.sizex = sizex;
		}
		public int getSizey() {
			return sizey;
		}
		public void setSizey(int sizey) {
			this.sizey = sizey;
		}
		public int[][] getElementsx() {
			return elementsx;
		}
		public void setElementsx(int[][] elementsx) {
			this.elementsx = elementsx;
		}
		public int[][] getElementsy() {
			return elementsy;
		}
		public void setElementsy(int[][] elementsy) {
			this.elementsy = elementsy;
		}
		
	
	
	/*// Step 1.1. Create Constructor
		public Matrix(int newSizex, int newSizey) {
			System.out.println("Creating matrix with sizex and sizey="+newSizex+newSizey);
			this.sizex = newSizex;
			this.sizey = newSizey;
			this.elementsx = new int[newSizex];
			this.elementsy = new int[newSizey];
		}
	// Step 2. Create methods
	// Step 2.1. Generate encapsulation methods
		public int getSizex() {
			return sizex ;
		}
		public int getSizey() {
			return sizey ;
		}

		public void setSizex1(int sizex) {
			this.sizex = sizex;
		}
		public void setSizey(int sizey) {
			this.sizey = sizey;
		}

		public int[] getElementsx() {
			return elementsx;
		}
			public int[] getElementsy() {
				return elementsy;
		}

		public void setElementsx(int[] elementsx) {
			this.elementsx = elementsx;
		}
	public void setElementsy(int[] elementsy) {
			this.elementsy = elementsy;
		}		
		
	// Step 2.2. Create CRUD methods
		public int[][] insertElement(int elementx,int elementy, int positionx, int positiony) {
			this.elementsx[positionx] = elementx;
			this.elementsy[positiony] = elementy;
			return this.elementx, this.elementy;
		}

		
		
	// step 2.3 prueba	
	// step 2.4 prueba	2*/
}