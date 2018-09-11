package cap1.arrays;

public class HashTable {
	// Step 1. Create attributes
	private Person[] Elements;
	private float ChargeFactor;
	private int Size;

	// Create constructor
	public HashTable(int size) {
		this.Size = size;
		this.Elements = new Person[size];
	}

	// Step 2. Create methods
	// Step 2.1. Generate encapsulation methods
	public Person[] getElements()
	{
		return Elements;
	}

	public void setElements(Person[] elements)
	{
		this.Elements = elements;
	}

	public float getChargefactor()
	{
		float occupieds = 0;

		for (int i = 0; i < Elements.length; i++)
		{
			if (Elements[i] != null)
			{
				occupieds++;
			}
		}

		this.ChargeFactor = (occupieds / Elements.length) * 100;
		return ChargeFactor;
	}

	public void setChargefactor(float chargefactor)
	{
		this.ChargeFactor = chargefactor;
	}

	public int getSize()
	{
		return Size;
	}

	public void setSize(int size)
	{
		this.Size = size;
	}

	// Step 2.2. Create CRUD and others methods

	public int ToHash(Person obj)
	{

		int Position;
		int sum = 0;
		String value = obj.getDocument();
		int doc = Integer.parseInt(value);

		for (int i = 2; i <= value.length(); i += 2)
		{
			sum += (int) (doc / (Math.pow(10, value.length() - i)));
			doc = (int) (doc % (Math.pow(10, value.length() - i)));
		}

		Position = sum % getSize();

		return Position;

	}

	public Person[] insertElement(String Document, String Name, String Phone)
	{
		Person person = new Person();
		person.setDocument(Document);
		person.setName(Name);
		person.setPhone(Phone);
		int position = ToHash(person);
		this.Elements[position] = person;
		return this.Elements;
	}

	public Person searchElementbyPosition(int hashvalue)
	{
		return this.Elements[hashvalue];
	}

	public Person searchElementbyValue(String document)
	{
		Person person = new Person();
		person.setDocument(document);
		int position = ToHash(person);

		return this.Elements[position];
	}

	public String listElement(Person[] elements)
	{
		String list = "";
		for (int i = 0; i < elements.length; i++)
		{
			if (i != elements.length - 1)
			{
				list += this.Elements[i] + ", ";

			} else
			{
				list += this.Elements[i];
			}
		}
		return list;
	}

	public Person[] updateElement(String Document, String Name,String Phone)
	{
		Person person = new Person();
		person.setDocument(Document);
		person.setName(Name);
		person.setName(Phone);
		int position = ToHash(person);
		this.Elements[position] = person;
		return this.Elements;
	}

	public Person[] deleteElement(int hashvalue)
	{
		for (int i = 0; i < Elements.length; i++)
		{
			if (i == hashvalue)
				Elements[i] = null;
		}
		return this.Elements;
	}

	public int HashFunction(String Document) {
		// TODO Auto-generated method stub
		return 0;
	}

}
