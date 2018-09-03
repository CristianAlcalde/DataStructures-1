package cap1.arrays;

import java.util.Scanner;

public class HashTable {
	private Person[] elements;
	private float chargefactor;
	private int size;
	private Integer num;
	private static String Documento;
	

	

	// Step 1. Create attributes
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	
	
	// Step 1.1. Create Constructor
	
	public Person[] getElements() {
		return elements;
	}
	public void setElements(Person[] elements) {
		this.elements = elements;
	}
	public float getChargefactor() {
		return chargefactor;
	}
	public void setChargefactor(float chargefactor) {
		this.chargefactor = chargefactor;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public String getDocumento() {
		return Documento;
	}
	public void setDocumento(String documento) {
		Documento = documento;
	}
	public HashTable(int newSize) 
	{
		System.out.println("The Size the HashTable is: "+newSize);
		this.size = newSize;
		this.elements = new Person[newSize];
	} 
	
	
	// Step 2.2. Create CRUD methods
	
	
	
	public static void main(String[] args) {
		
	
		HashTable Ejecutar = new HashTable(13);
	    Scanner entradaEscaner = new Scanner (System.in); 
		
		System.out.println("Digite el documento: ");
		Documento = entradaEscaner.nextLine();
		
		
		Integer suma=0;			
		String deCerooaUno = "";
		String deDosaTres = "";
		String deCuatroaCinco= "";
		String deSeisaSiete = "";
		String deOchoaNueve = "";
		int cont = 0;
		
		for(int i = 0; i<=20;i= i+2){
			//if(Ejecutar.Documento.length<10)
			deCerooaUno = "" + Ejecutar.Documento.charAt(i) + Ejecutar.Documento.charAt(i+1);
			System.out.println(deCerooaUno);
		}

		System.out.println(deDosaTres);
		System.out.println(deCuatroaCinco);
		System.out.println(deSeisaSiete);
		System.out.println(deOchoaNueve);
		
		
		System.out.println(suma);
		//System.out.println(suma % 13);
	}

	
}
