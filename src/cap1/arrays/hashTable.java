package cap1.arrays;

public class hashTable {
	// Step 1. Create attributes
	private int size;
	private float chargeFactor;
	private Persons[] elements;
	//private String[] tablePersonas;
	
	// Step 1.1. Create Constructor
	public hashTable(int newsize) {
		this.size = newsize;
		this.chargeFactor = 0;
		this.elements = new Persons[newsize];
		//this.elements = testPersona;
	}
	// Step 2. Create methods
	// Step 2.1. Generate encapsulation methods

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public float getChargeFactor() {
		return chargeFactor;
	}

	public void setChargeFactor(float chargeFactor) {
		this.chargeFactor = chargeFactor;
	}

	public Persons[] getElements() {
		return elements;
	}

	public void setElements(Persons[] elements) {
		this.elements = elements;
	}	
	
	// Step 2.2. Create CRUD methods
	public Persons[] insertPersona(Persons expectedPersonas) {
		//Get the index which we will use to save the Person's data
		int positionExpected = hashFunction(expectedPersonas.getDocument());
		//Save the Person's data in the index that we get previously
		elements[positionExpected]=expectedPersonas;
		//return the elements array
		return elements;
	}
	
	public int hashFunction(int Document) {
		int sizeArr = String.valueOf(Document).length();
		int Sumatoria = 0;
		for(int i=0; i<sizeArr/2; i++) {
			Sumatoria += Document % 100 ;
			Document = Document / 100 ;
		}
		int IndexGetted = Sumatoria % size ;
		return IndexGetted;
	}
	
	public int searchPersona(int Position, int Document) {
		
		if(elements[Position].getDocument()==Document) {
			return Position;
		}else {
			//We return the document in case of the field indicated by the Position is empty
			return Document;
		}
	}
}