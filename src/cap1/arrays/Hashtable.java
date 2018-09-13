package cap1.arrays;

public class Hashtable {
	/*
	public static void main( String[] args) {
		Person per = new Person();
		per.setDocumento("12345672");
		per.setName("Carlos");
		per.setPhone("345666555");
		
		Hashtable per2= new Hashtable(5,0);
		per2.insertaPersona(per,"12345672");
	}*/
	
	// Step 1. Create attributes
	private Person[] elements;
	private int size;		
	private float chargefactor;
	private int nroelem=0;
	
	// Step 1.1. Create Constructor	
	public Hashtable(int newSize, float factorcarga) {				
		this.size = newSize;
		this.chargefactor = factorcarga;
		this.elements = new Person[newSize];
	}
	
	// Step 2. Create methods
	public int hashFunction(String cedula) {
		
		int suma=0;
		String ced=cedula;
		
		while(ced.length()>1) {
			//System.out.println(ced);
			String parte1= ced.substring(0,2);
			if (ced.length()==3) {
				ced= ced.substring(2,3);
				suma=suma+Integer.parseInt(parte1)+Integer.parseInt(ced);
			}else {
				ced= ced.substring(2);
				suma=suma+Integer.parseInt(parte1);
			}	
			
			//System.out.println(suma);
		}
		
		int mod= suma % 5;	
		return mod;
	}
	
	public float CalculaFactorCarga(int n) {
		float factor= 100/this.size * n;
		return factor;
	}
	

	// Step 2.1. Generate encapsulation methods
	public Person[] getElements() {
		return elements;
	}
	
	public void setElements(Person[] elements) {
		this.elements = elements;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public float getChargefactor() {
		return chargefactor;
	}

	public void setChargefactor(float chargefactor) {
		this.chargefactor = chargefactor;
	}
	
	// Step 3. Create CRUD methods

	public Person[] insertaPersona(Person persona, String doc) {
		int indice= hashFunction(doc);
		this.elements[indice]=persona;
		this.nroelem= this.nroelem+1;		
		setChargefactor(CalculaFactorCarga(this.nroelem));
		return this.elements;
	}
	
	public int buscarPersona(String doc) {
		return hashFunction(doc);		
	}
	
	public Person[] borrarPersona(String doc) {
		int indice =hashFunction(doc);
		this.elements[indice]=null;
		this.nroelem= this.nroelem-1; 
		setChargefactor(CalculaFactorCarga(this.nroelem));
		return 	this.elements;	
	}
	
	public Person[] actualizaPersona(Person persona, String doc){
		int indice =hashFunction(doc);
		this.elements[indice]=persona;
		return 	this.elements;
	}

}
