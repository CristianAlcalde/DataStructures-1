package cap1.arrays;

public  class  Matrix {
	// Step 1. Create attributes
		private int sizeA, sizeB;
		private int[][] elements;

		// Create constructor
		public Matrix(int newsizeA, int newsizeB) {
			System.out.println("Creating Matrix with size = " + newsizeA + "A" + newsizeB + "\n");
			this.sizeA = newsizeA;
			this.sizeB = newsizeB;
			this.elements = new int[newsizeA][newsizeB];
		}

		// Step 2. Create methods
		// Step 2.1. Generate encapsulation methods
		public int getSizeA() {
			return sizeA;
		}

		public void setSizeA(int sizeA) {
			this.sizeA = sizeA;
		}

		public int getSizeB() {
			return sizeB;
		}

		public void setSizeB(int sizeB) {
			this.sizeB = sizeB;
		}

		public int[][] getElements() {
			return elements;
		}

		public void setElements(int[][] elements) {
			this.elements = elements;
		}

		// Step 2.2. Create CRUD methods

		public int[][] insertElement(int element, int posx, int posy) {
			this.elements[posx][posy] = element;
			return this.elements;
		}

		public int searchElementbyPosition(int posx, int posy) {
			return this.elements[posx][posy];
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

		public int[][] updateElement(int element, int posx, int posy) {
			this.elements[posx][posy] = element;
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
