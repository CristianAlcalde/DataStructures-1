package cap1.arrays;

public class HashTable {
	private int size;
	private Person[] elements;
	private float chargeFactor;
	
	    
	// Step 1.1. Create Constructor
	 


	public HashTable(int newSize) {
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
		
		public int functionHash(String document){
	        
	        int vecht[]=new int[10];
	        Integer num = Integer.parseInt(document);
	        int pos;
	        for(int i =0; i<10; i++){
	            
	            int rest=num%10;
	            num=num/10;
	            vecht[i]=rest;                      
	        }
	        
	        pos=vecht[0]+vecht[1]+vecht[2];
	        pos=pos*pos;
	        if(this.elements[pos]==null){
	           return pos; 
	        }
	        else{
	            
	            while(this.elements[pos]!=null){
	                
	                if(pos<this.size){
	                   pos=pos+1; 
	                }
	                else{
	                    pos=0;
	                }
	            }
	            
	            return pos;
	        }
	    }


public Person[] insertElement(String name, String document){
    
    Person person=new Person();
    person.setName(name);
    person.setDocument(document);
    
    this.elements[functionHash(document)] = person;
    return this.elements;
    
}  

public String searchElement(String document){
  String elementFound= " ";
  if(this.elements[functionHash(document)].getDocument().equals(document)){
	  elementFound = document;    
      }
  return elementFound;
      
   }


public Person[] updateElement(String name, String document) {
  this.elements[functionHash(document)].setName(name);
  return this.elements;

}

public Person[] deleteElement(String document){
  this.elements[functionHash(document)] = null;
  return this.elements;
}


}
	
		        