package cap1.arrays;

public class Matrix {
	// Step 1. Create attributes
	
	private int[] sizex;
	private int[] sizey;
	private int[][] elementox,elementoy;
	public int[] getSizex() {
		return sizex;
	}
	public void setSizex(int[] sizex) {
		this.sizex = sizex;
	}
	public int[] getSizey() {
		return sizey;
	}
	public void setSizey(int[] sizey) {
		this.sizey = sizey;
	}
	public int[][] getElementox() {
		return elementox;
	}
	public void setElementox(int[][] elementox) {
		this.elementox = elementox;
	}
	public int[][] getElementoy() {
		return elementoy;
	}
	public void setElementoy(int[][] elementoy) {
		this.elementoy = elementoy;
	}
	
	// Step 2. Create methods
		// Step 2.1. Generate encapsulation methods
	
	
	/*	
	
	// Step 1.1. Create Constructor
	public Matrix(int newSizex, int newSizey) {
		System.out.println("Creating matrix with size=" + newSizex + newSizey);		
		this.sizex = new int[newSizex];
		this.sizey = new int[newSizey];
		
		
		
	// Step 2. Create methods
	// Step 2.1. Generate encapsulation methods
		public int getSize(){
			return size;
			
		}

		public void setSize(int size) {
			this.size = size;
		}

		public int[] getElements() {
			return elements;
		}

		public void setElements(int[] elements) {
			this.elements = elements;
		}

		// Step 2.2. Create CRUD methods
		public int[] insertElement(int element, int position) {
			this.elements[position] = element;
			return this.elements;
		}

		public int searchElementByPosition(int position) {
			return this.elements[position];
		}
		
		public int searchElementByValue(int element) {
			int result = -1;
			// Recorrer el vector buscando el elemento a eliminar
			for (int i = 0; i < elements.length; i++) {
				// Si el elemento es encontrado reemplazarlo por 0
				if (elements[i] == element) {
					result = i;
				}
			}
			return result;
		}

		public int[] updateElement(int newElement, int position) {
			this.elements[position] = newElement;
			return this.elements;
		}

		public int[] deleteElement(int element) {

			// Recorrer el vector buscando el elemento a eliminar
			for (int i = 0; i < elements.length; i++) {
				// Si el elemento es encontrado reemplazarlo por 0
				if (elements[i] == element) {
					elements[i] = 0;
				}
			}
			return this.elements;
		}
	}

}

*/

}