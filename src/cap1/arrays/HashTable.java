package cap1.arrays;

public class HashTable {
    private static final String Person = null;
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
	public Person insertElements(Person elements,int module) {
		this.elements[module]= elements;
		return elements;
	}
	public int HashFuntion(String documents) {
		Integer dijit1 = (Integer.parseInt(documents))% 100;
		Integer dijit2 = (Integer.parseInt(documents)) / 100 % 100;
		Integer dijit3 = (Integer.parseInt(documents)) / 100 / 100 % 100;
		Integer dijit4 = (Integer.parseInt(documents)) / 100 / 100 / 100 % 100;
		Integer dijit5= (Integer.parseInt(documents)) / 100 / 100 / 100 /100 % 100;
		Integer dijit6 = (Integer.parseInt(documents)) / 100 / 100 / 100 /100 /100 % 100;
		Integer dijit7 = (Integer.parseInt(documents)) / 100 / 100 / 100 /100 /100 % 100;
		
		return ((dijit1+dijit2+dijit3+dijit4+dijit5+dijit6+dijit7)%11);

	}
}