package Cap2.lists;

public class Node1 {

	String storeData;
	Node1 linkNext;
	
	//encasuplation
	public String getStorData() {
		return storeData;
	}
	public void setStorData(String storeData) {
		this.storeData = storeData;
	}
	public Node1 getLink() {
		return linkNext;
	}
	public void setLink(Node1 linkNext) {
		this.linkNext = linkNext;
	}
	//constructor
	
	public Node1 (String storeData){
		this.storeData=storeData;			
	}
	//----------//ENLACES//-------
	//metodo para enlazar nodos	
	public void chooseNext (Node1 next) {
		linkNext = next;
	}
	//metodo para obtener siguiente
	public Node1 getNext(){
	return linkNext;	
	}
	//metodo para obtener valor
	public String getData() {
		return storeData;
	}

	
	
}









