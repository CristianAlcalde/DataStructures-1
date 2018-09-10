package cap1.arrays;

public class HashTable {
	// Step 1. Create attributes
	private Person[] elements;
	private float chargefactor;
	private int size;

	// Create constructor
	public HashTable(int size) {
		System.out.println("Creating HashTable with size = " + size + "\n");
		this.size = size;
		this.elements = new Person[size];
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

	// Step 2.2. Create CRUD and others methods

	public void occupied()
	{
		int occupieds = 0;

		for (int i = 0; i < elements.length; i++)
		{
			if (elements[i] != null)
			{
				occupieds++;
			}
		}

		this.setChargefactor(occupieds / elements.length);
	}

	public int ToHash(Person obj)
	{

		int position;
		int sum = 0;
		String value = obj.getDocument();
		int doc = Integer.parseInt(value);

		for (int i = 2; i <= value.length(); i += 2)
		{
			sum += (int) (doc / (Math.pow(10, value.length() - i)));
			doc = (int) (doc % (Math.pow(10, value.length() - i)));
		}

		position = sum % getSize();

		return position;

	}

	public Person[] insertElement(String document, String name, String phone)
	{
		Person person = new Person();
		person.setDocument(document);
		person.setName(name);
		person.setPhone(phone);
		int position = ToHash(person);
		this.elements[position] = person;

		return this.elements;
	}

	public Person searchElementbyPosition(int hashvalue)
	{
		return this.elements[hashvalue];
	}

	public Person searchElementbyValue(String document)
	{
		Person person = new Person();
		person.setDocument(document);
		int position = ToHash(person);

		return this.elements[position];
	}

	public String listElement(Person[] elements)
	{
		String list = "";
		for (int i = 0; i < elements.length; i++)
		{
			if (i != elements.length - 1)
			{
				list += this.elements[i] + ", ";

			} else
			{
				list += this.elements[i];
			}
		}
		return list;
	}

	public Person[] updateElement(String document, String name)
	{
		Person person = new Person();
		person.setDocument(document);
		person.setName(name);
		int position = ToHash(person);
		this.elements[position] = person;
		return this.elements;
	}

	/*
	 * public int[] deleteElement(int value) { for (int i = 0; i < elements.length;
	 * i++) { if (elements[i] == value) elements[i] = 0; } return this.elements; }
	 */

}
