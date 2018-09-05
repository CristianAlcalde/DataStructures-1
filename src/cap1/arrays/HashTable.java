package cap1.arrays;



public class HashTable {
	private  String Person;
	private  Person[] elements;
    private float ChargeFactor;
    int size;
	
    //create constructor
    public HashTable(int newSize) {
    	//System.out.println("Creating hashtable with size=" + newSize);
		this.size = newSize;
		this.elements = new Person[newSize];
	}
	public Person[] getElements() {
		return elements;
	}
	public void setElements(Person[] elements) {
		this.elements = elements;
	}
	public float getChargeFactor() {
		return ChargeFactor;
	}
	public void setChargeFactor(float chargeFactor) {
		ChargeFactor = chargeFactor;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	//Create CRUD Methods
	public int HashFuntion(String documents) {
		Integer dijit1 = (Integer.parseInt(documents))% 100;
		Integer dijit2 = (Integer.parseInt(documents)) / 100 % 100;
		Integer dijit3 = (Integer.parseInt(documents)) / 100 / 100 % 100;
		Integer dijit4 = (Integer.parseInt(documents)) / 100 / 100 / 100 % 100;
		Integer dijit5= (Integer.parseInt(documents)) / 100 / 100 / 100 /100 % 100;
		Integer dijit6 = (Integer.parseInt(documents)) / 100 / 100 / 100 /100 /100 % 100;
		Integer dijit7 = (Integer.parseInt(documents)) / 100 / 100 / 100 /100 /100 % 100;
		
		return ((dijit1+dijit2+dijit3+dijit4+dijit5+dijit6+dijit7)%13);

	}
	public Person[] insertElements(String name, String document, String phone) {
		Person NewDato = new Person();
	    NewDato.getDocument();
	    NewDato.getName();
	    NewDato.getPhone();
	    this.elements[HashFuntion(document)]= NewDato;
		return this.elements;
	}
	
	public Person searchElement(String document) {
		return this.elements[HashFuntion(document)];
	}
	public Person[] updateElement(Person newdocument,int HashFuntion) {
		this.elements[HashFuntion(Person)]= newdocument;
		return this.elements;
	}
	public Person[] deleteElement(String document) {
		this.elements[HashFuntion(document)]=null;
		return this.elements;
	}
}