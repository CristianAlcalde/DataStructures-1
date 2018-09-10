package cap1.arrays;

public class HashTable {
	private Person[] elements;
	private float chargefactor;
	private int size;
	private Integer num;


	// Step 1. Create attributes
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
		
	
	// Step 1.1. Create Constructor
	
	public Person[] getElements() {
		return elements;
	}
	public void setElements(Person[] elements) {
		this.elements = elements;
	}
	public float getChargefactor() {
		return chargefactor;
	}
	public void setChargefactor(float chargefactor) {
		this.chargefactor = chargefactor;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	
	public HashTable(int newSize) 
	{ 
		System.out.println("The Size the HashTable is: "+newSize);
		this.size = newSize;
		this.elements = new Person[newSize];
	} 
	
	                                           
	public int HashFuntion(String documents) {
		Integer dijit1 = (Integer.parseInt(documents))%100;
		Integer dijit2 = (Integer.parseInt(documents))/100 % 100;
		Integer dijit3 = (Integer.parseInt(documents))/100 /100 % 100;
		Integer dijit4 = (Integer.parseInt(documents))/100 /100 /100 %100;
		Integer dijit5 = (Integer.parseInt(documents))/100 /100 /100 /100 %100;
		Integer dijit6 = (Integer.parseInt(documents))/100 /100 /100 /100 /100 %100;
		Integer dijit7 = (Integer.parseInt(documents))/100 /100 /100 /100 /100 /100 %100;
		
		return ((dijit1+dijit2+dijit3+dijit3+dijit4+dijit5+dijit6+dijit7)%11);
		
	}
	
	
	public Person[] insertElements( String document, String name,String phone) {
		Person NewDato = new Person();
		NewDato.setDocument(document);
		NewDato.setName(name);
		NewDato.setPhone(phone);
		this.elements[HashFuntion(document)] = NewDato;
		return this.elements;
	}
	
	
	public Person[] updateElements(String documento, String name, String phone) {
		Person NewDato = new Person();
		NewDato.setDocument(documento);
		NewDato.setName(name);
		NewDato.setPhone(phone);
		this.elements[HashFuntion(documento)] = NewDato;
		return this.elements;
	}
	
		public String SearchTableHash(String document) {
		String found = "";
		if (this.elements[HashFuntion(document)].getDocument().equals(document)) {
			found = document;
		}
		return found;
	}

	
	public Person[] DeleteTableHash(String document) {
		this.elements[HashFuntion(document)] = null;
		this.setChargefactor(getChargefactor() - (float) 7.69);
		return this.elements;
	}
	// Step 2.2. Create CRUD methods
	

	
}
