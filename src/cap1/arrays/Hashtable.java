package cap1.arrays;

public class Hashtable {
	 private int size;
	 private Person[] elements;
	    
	
	 public Hashtable(int newSize) {
				System.out.println("Creating Hashtable with size=" + newSize);
				this.size = newSize;
				this.elements = new Person[newSize];
			}
	   

	 public int Hashfunction(String document){
			int num = Integer.parseInt(document);
			int hashresult = num % size;
			return hashresult;
	   
	    }
	       
	    
     public Person[] insertElement(String document, String name, String phone){
	        
	        Person Person=new Person();
	        Person.setName(name);
	        Person.setDocument(document);
	        Person.setPhone(phone);
	        
	        this.elements[Hashfunction(document)] = Person;
	        return this.elements;
	        
	    }  
	    
      public Person[] searchElement(String document){
    	  if(document == elements[Hashfunction(document)].getDocument()){
    		  return this.elements;    
	          }
	          else {        
	             return null;
	          }
	       }
      
    
      public Person[] updateElement(String name, String document, String phone) {
    	  this.elements[Hashfunction(document)].setName(name);
    	  this.elements[Hashfunction(document)].setName(phone);
    	  return this.elements;
    	
      }
	    
	  public Person[] deleteElement(String document){
		  for (int i = 0; i < elements.length; i++) {
			
			if (document == this.elements[Hashfunction(document)].getDocument() ) {
				this.elements[Hashfunction(document)] = null;
			}
		}
		  return this.elements;
	}
	        
}
	   
	    
	    
	    
	

