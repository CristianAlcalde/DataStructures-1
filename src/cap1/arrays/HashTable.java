package cap1.arrays;

public class HashTable {
	private int[] person;
	private int changefactor;
	private int size;

	// Step 1. Create attributes
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int[] getPerson() {
		return person;
	}
	public void setPerson(int[] person) {
		this.person = person;
	}
	public int getChangefactor() {
		return changefactor;
	}
	public void setChangefactor(int changefactor) {
		this.changefactor = changefactor;
	}
	
	// Step 1.1. Create Constructor
	
	public HashTable(int newSize) 
	{
		System.out.println("The Size the HashTable is: "+newSize);
		this.size = newSize;
		this.person = new int[newSize];
	} 

}
