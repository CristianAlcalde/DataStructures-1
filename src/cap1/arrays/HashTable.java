package cap1.arrays;

public class HashTable {
    private  Person[] elements;
    private float ChargeFactor;
    int size;
    //create constructor
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
}
