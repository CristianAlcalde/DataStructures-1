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
	public Persons[] insertPersona(int docN, String nomN, String phoneN) {
		//Get the index which we will use to save the Person's data
		Persons expectedPersonas = new Persons();
		expectedPersonas.setDocument(docN);
		expectedPersonas.setName(nomN);
		expectedPersonas.setPhone(phoneN);
		int positionExpected = hashFunction(expectedPersonas.getDocument());
		//Save the Person's data in the index that we get previously
		elements[positionExpected]=expectedPersonas;
		//Calculate and print the charge factor
		int chargFact = calculateCharge();
		System.out.println("El factor de carga se encuentra en su "+chargFact+"% completado.");
		//return the elements array
		return elements;
	}
	
	public int calculateCharge() {
		//tempCalc to save the number of elements found on the array
		//Out is the int value to show in the console to know the charge factor
		int tempCalc = 0; int Out = 0;
		for(int i=0; i<size; i++) {
			if(elements[i]==null) {
				/*There is not data, don't calculate and don't up the tempCalc value*/
			}else {
				//There is data on the array position
				tempCalc++;
				//Out = (100% divided by the array size) and multiplied by the number of elements found
				Out = (100 / size) * tempCalc ;
			}
		}
		return Out;
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
	
	public boolean printPersonas() {
		//Count the times that the print works
		int Impresiones = 0;
		//Loop for the elements contained
		for(int i=0; i<size; i++) {
			if(elements[i]==null) {
				//Don't print data, because in this section the value of data is null or empty
			}
			else
			{
				//This section is filled, print document, name, phone.
				System.out.println("\tDocumento de identidá: "+elements[i].getDocument());
				System.out.println("\tNombre de usuario: "+elements[i].getName());
				System.out.println("\tTeléfono: "+elements[i].getPhone());
				System.out.println("\n");
				//Charge the Impresiones variable because the print function was used.
				Impresiones++;
			}
		}
		if(Impresiones>0) {
			//Impresiones was used at least once.
			return true;
		}else {
			//Impresiones wasn't used at least once.
			return false;
		}
		
	}
	
	public Persons[] updatePersonas(int docPrev,int docNew,String nameNew,String phoneNew) {
		//Calculate the index by the docPrev (docPrev is the document of the person, this value can be modified)
		int indexToUpdate = hashFunction(docPrev);
		//If a value to modify is empty or in 0, the update process will not be executed
		if(docNew==0) {/*Don't update*/}else{elements[indexToUpdate].setDocument(docNew);}
		if(nameNew=="") {/*Don't update*/}else{elements[indexToUpdate].setName(nameNew);}
		if(phoneNew=="") {/*Don't update*/}else{elements[indexToUpdate].setPhone(phoneNew);}
		//Return the data
		return elements;
	}
	
	public boolean deletePerson(int docPerson) {
		//Calculate the index by the docPerson
		int indexToRemove = hashFunction(docPerson);
		//If in the section following the index exists data, remove all of these section
		if(elements[indexToRemove].getDocument()==docPerson) {
			elements[indexToRemove].setDocument(0);
			elements[indexToRemove].setName("");
			elements[indexToRemove].setPhone("");
		}
		if(elements[indexToRemove].getDocument()==docPerson) {
			//The remove data process doesn't work correctly
			return false;
		}else {
			return true;
		}
	}
}