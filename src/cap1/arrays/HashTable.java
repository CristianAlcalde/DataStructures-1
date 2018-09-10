package cap1.arrays;

public class HashTable {
	// Step 1. Create attributes
	private Person[] elements;
	private float chargefactor;
	private int size;

	// Create constructor
	public HashTable(Person[] elements, float chargefactor, int size) {
		System.out.println("Creating HashTable with size=" + size + "\n");
		this.elements = elements;
		this.chargefactor = chargefactor;
		this.size = size;
	}

	// Step 2. Create methods
	// Step 2.1. Generate encapsulation methods
	public Person[] getElements()
	{
		return elements;
	}

	public void setElements(Person[] elements)
	{
		this.elements = elements;
	}

	public float getChargefactor()
	{
		this.chargefactor = this.size; // falta generar el numerador que hace referancia al numero de elementos
										// ocupados en el vector.
		return chargefactor;
	}

	public void setChargefactor(float chargefactor)
	{
		this.chargefactor = chargefactor;
	}

	public int getSize()
	{
		return size;
	}

	public void setSize(int size)
	{
		this.size = size;
	}

	// Step 2.2. Create CRUD methods

	public Person[] insertElement(String document, Person name)
	{

		int value = 0;
		int doc = Integer.parseInt(document);

		for (int i = 2; i <= document.length(); i = +2)
		{
			value = +(int) (doc / (Math.pow(10, document.length() - i)));
			doc = (int) (doc % (Math.pow(10, document.length() - i)));
		}

		this.elements[value % getSize()] = name;

		return this.elements;
	}

	public Person searchElementbyPosition(int hashvalue)
	{
		return this.elements[hashvalue];
	}

	public int searchElementbyValue(int value)
	{
		int position = -1;
		for (int i = 0; i < elements.length; i++)
		{
			if (elements[i] == value)
				position = i;
		}
		return position;
	}

	public String listElement(int[] elements)
	{
		String vector = "";
		for (int i = 0; i < elements.length; i++)
		{
			if (i != elements.length - 1)
			{
				vector += this.elements[i] + " ";

			} else
			{
				vector += this.elements[i];
			}
		}
		return vector;
	}

	public int[] updateElement(int element, int position)
	{
		this.elements[position] = element;
		return this.elements;
	}

	public int[] deleteElement(int value)
	{
		for (int i = 0; i < elements.length; i++)
		{
			if (elements[i] == value)
				elements[i] = 0;
		}
		return this.elements;
	}

}
