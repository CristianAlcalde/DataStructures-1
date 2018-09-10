package cap1.arrays;

public class HashTable {
	private float ChargeFactor;
	int Size;
	private Person[] elements;
	
	//In this line, create the getters n setters.
	
	public float getChargeFactor() {
		return ChargeFactor;
	}
	public void setChargeFactor(float chargeFactor) {
		ChargeFactor = chargeFactor;
	}
	public int getSize() {
		return Size;
	}
	public void setSize(int size) {
		Size = size;
	}
	public Person[] getElements() {
		return elements;
	}
	public void setElements(Person[] elements) {
		this.elements = elements;
	}
	
	//Create CRUD Methods
	
		public Person insertElements(Person elements,int module) {
			this.elements[module]= elements;
			return elements;
		}
}
