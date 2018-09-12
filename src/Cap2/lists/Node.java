package Cap2.lists;

public class Node {

	String storeData;
	Node linkNext;
	
	//encasuplation
	public String getStorData() {
		return storeData;
	}
	public void setStorData(String storeData) {
		this.storeData = storeData;
	}
	public Node getLink() {
		return linkNext;
	}
	public void setLink(Node linkNext) {
		this.linkNext = linkNext;
	}
	//constructor
	
	public Node (String storeData){
		this.storeData=storeData;			
	}
	//metodo para enlazar nodos	
	public void chooseNext (Node n) {
		linkNext = n;
	}
	//metodo para obtener siguiente
	public Node getNext(){
	return linkNext;	
	}
	//metodo para obtener valor
	public String getData() {
		return storeData;
	}

	
	
}









