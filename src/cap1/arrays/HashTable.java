package cap1.arrays;

public class HashTable {
	
	// Step 1. Create attributes
	private Person[] elements;
	private float chargeFactor;
	private int size;
	private String[] vec;
	
	// Step 1.1. Create Constructor
	public HashTable(int newSize) {
		System.out.println("Creating vector with size: " + newSize);
		this.size = newSize;
		this.elements = new Person[newSize];
		this.vec = new String[newSize/2+1];
		
	}
	
	// Step 2. Generate encapsulation methods
	public Person[] getElements() {
		return elements;
	}
	public void setElements(Person[] elements) {
		this.elements = elements;
	}
	
	public float getChargeFactor() {
		return chargeFactor;
	}
	public void setChargeFactor(float chargeFactor) {
		this.chargeFactor = chargeFactor;
	}
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
		
	public String[] getVec() {
		return vec;
	}

	public void setVec(String[] vec) {
		this.vec = vec;
	}

	// metodo para hallar el indice Hash
	public Integer convert(Person intDocument) {
		
		int newSize=intDocument.getDocument().length();
		String[] vec = new String[newSize/2+1];

		int pos=0;
		for(int i=0; i<=intDocument.getDocument().length()-2; i+=2) {
			String separate = intDocument.getDocument().substring(i, i+2);
			vec[pos]=separate;
			pos=pos+1;
			vec[pos]=" ";
		}
		if(intDocument.getDocument().length()%2==1) {
			vec[pos]=intDocument.getDocument().substring(intDocument.getDocument().length()-1, intDocument.getDocument().length());
		}
		
				
		
		
		return 0;
		
		
	}
	
//	public int hashFunction(Person intDocument) {
		
		
//	}
//		intDocument.setDocument()
			
//	}
	
	// Step 3. Create CRUD methods
	
	
	
	// Step 3.1 Creating Insert methods
	
	
	

}
