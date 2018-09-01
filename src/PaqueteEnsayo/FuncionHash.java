package PaqueteEnsayo;

public class FuncionHash {

	
	public static void main(String[] args) {
				
		String document = "108834124";
		//if ((document.length())%2!=0){
		//	document= "0000" + document.length();
		//	System.out.println(document);
		
		
	/*	if (document.length() == 2) {
			document = document.length() + "00";
		}*/
	//	if (document.length() == 4) {
	//		document = document.length() + "0000";
	//	}
		//if (document.length() == 6) {
		//	document = document.length() + "000000";
		//}
		//if (document.length() == 8) {
		//	document = document.length()+ document;
		//}
		//if (document.length() == 10) {
		//	document = document.length() + "0000000000";
		String a = document.substring(0, 2);
		System.out.println("Dato en [0, 2] = " + a);
		String b = document.substring(2, 4);
		System.out.println("Dato en [2, 4] = " + b);
		String cinco = document.substring(5, 5);
		String c = document.substring(4, 6);
		System.out.println("Dato en [4, 6] = " + c);
		String d = document.substring(6, 8);
		System.out.println("Dato en [6, 8] = " + d);
		
		if ((document.length())%2!=0) {
			document = "0" + document.charAt(8);
			System.out.println("Valor en la posición 8 : " + document);
			
		}
		String nueve = "00" + document.substring(9); 
		String e = document.substring(8, 10) + document;
		System.out.println("Dato en [0, 2] = " + e);
		
	

		int Suma = Integer.parseInt(a) + Integer.parseInt(b) + Integer.parseInt(cinco) + Integer.parseInt(c) + Integer.parseInt(d) 
		+ Integer.parseInt(nueve) + Integer.parseInt(e) ;
		

		System.out.println("La suma de las posiciones son: " + Suma);

		// TODO Auto-generated method stub

		
	}
	
	}
