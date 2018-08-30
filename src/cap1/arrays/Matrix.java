package cap1.arrays;

public class Matrix {
	// Step 1. Create attributes
	private int SizeA, SizeB;
	private int[][] elements;

	// Create constructor
	public Matrix(int NewSizeA, int NewSizeB) {
		System.out.println("Creating Matrix with size = " + NewSizeA + "A" + NewSizeB + "\n");
		this.SizeA = NewSizeA;
		this.SizeB = NewSizeB;
		this.elements = new int[NewSizeA][NewSizeB];
	}

	// Step 2. Create methods
	// Step 2.1. Generate encapsulation methods
	public int getSizeA() {
		return SizeA;
	}

	public void setSizeA(int SizeA) {
		this.SizeA = SizeA;
	}

	public int getSizeB() {
		return SizeB;
	}

	public void setSizeB(int SizeB) {
		this.SizeB = SizeB;
	}

	public int[][] getElements() {
		return elements;
	}

	public void setElements(int[][] elements) {
		this.elements = elements;
	}

	// Step 2.2. Create CRUD methods

	public int[][] insertElement(int element, int positionA, int positionB) {
		this.elements[positionA][positionB] = element;
		return this.elements;
	}

	public int searchElementbyPosition(int positionA, int positionB) {
		return this.elements[positionA][positionB];
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

	public int[][] updateElement(int element, int positionA, int positionB) {
		this.elements[positionA][positionB] = element;
		return this.elements;
	}

	public int [][] deleteElement(int value) {
		for (int i = 0; i < elements.length; i++) {
			for (int j = 0; j < elements[i].length; j++) {
				if (elements[i][j] == value)
					elements[i][j] = 0;
			}
		}
		return this.elements;
	}

}