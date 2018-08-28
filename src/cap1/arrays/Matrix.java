package cap1.arrays;

public class Matrix {
	// Step 1. Create attributes
	private int sizex, sizey;
	private int[][] elements;

	// Create constructor
	public Matrix(int newsizex, int newsizey) {
		System.out.println("Creating Matrix with size = " + newsizex + "x" + newsizey + "\n");
		this.sizex = newsizex;
		this.sizey = newsizey;
		this.elements = new int[newsizex][newsizey];
	}

	// Step 2. Create methods
	// Step 2.1. Generate encapsulation methods
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

	public int[][] getElements() {
		return elements;
	}

	public void setElements(int[][] elements) {
		this.elements = elements;
	}

	// Step 2.2. Create CRUD methods

	public int[][] insertElement(int element, int positionx, int positiony) {
		this.elements[positionx][positiony] = element;
		return this.elements;
	}

	public int searchElementbyPosition(int positionx, int positiony) {
		return this.elements[positionx][positiony];
	}

	public int[] searchElementbyValue(int value) {
		int[] position = new int[2];
		for (int i = 0; i < elements.length; i++) {
			for (int j = 0; j < elements[i].length; j++) {
				if (elements[i][j] == value) {
					position[0] = i;
					position[1] = j;
				}
			}
		}
		return position;
	}

	public String listElement(int[][] elements) {
		String matrix = "";
		for (int i = 0; i < elements.length; i++) {
			for (int j = 0; j < elements[i].length; j++) {
				if (j != elements[i].length - 1) {
					matrix += this.elements[i][j] + " ";
				} else {
					matrix += this.elements[i][j] + "\n";
				}
			}
		}
		return matrix;
	}

	public int[][] updateElement(int element, int positionx, int positiony) {
		this.elements[positionx][positiony] = element;
		return this.elements;
	}

	public int[][] deleteElement(int value) {
		for (int i = 0; i < elements.length; i++) {
			for (int j = 0; j < elements[i].length; j++) {
				if (elements[i][j] == value)
					elements[i][j] = 0;
			}
		}
		return this.elements;
	}

}