package cap1.arrays;

public class Hashtable {
	
	// Step 1. Create attributes
	
	 private int size;
	 private Person[] elements;
	 private float chargeFactor;
	    
	// Step 1.1. Create Constructor
	 
	 public Hashtable(int newSize) {
				System.out.println("Creating Hashtable with size=" + newSize);
				this.size = newSize;
				this.chargeFactor = 0;
				this.elements = new Person[newSize];
			}
	 
	// Step 2. Create methods
	// Step 2.1. Generate encapsulation methods
	 
	  public int getSize() {
			return size;
		}

		public void setSize(int size) {
			this.size = size;
		}

		public Person[] getElements() {
			return elements;
		}

		public void setElements(Person[] elements) {
			this.elements = elements;
		}
		public float getChargeFactor() {
			return chargeFactor;
		}

		public void setChargeFactor(float chargeFactor) {
			this.chargeFactor = chargeFactor;
		}
		        
	
		  
	// Step 2.2. Create CRUD methods
		
	 public int Hashfunction(String document){
			int num = Integer.parseInt(document);
			int hashresult = num % size;
			return hashresult;
	   
	    }
	       
	    
   
	public Person[] insertElement(String name, String document, String phone){
	        
	        Person person=new Person();
	        person.setName(name);
	        person.setDocument(document);
	        person.setPhone(phone);
	        
	        this.elements[Hashfunction(document)] = person;
	        return this.elements;
	        
	    }  
	    
      public String searchElement(String document){
    	  String elementFound= "*";
    	  if(this.elements[Hashfunction(document)].getDocument().equals(document)){
    		  elementFound = document;    
	          }
    	  return elementFound;
	          
	       }
      
    
      public Person[] updateElement(String name, String document, String phone) {
    	  this.elements[Hashfunction(document)].setName(name);
    	  this.elements[Hashfunction(document)].setPhone(phone);
    	  return this.elements;
    	
      }
	    
	  public Person[] deleteElement(String document){
		  this.elements[Hashfunction(document)] = null;
		  return this.elements;
	}
}

	
	    
	    
	    
	

