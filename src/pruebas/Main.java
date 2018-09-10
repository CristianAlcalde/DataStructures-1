package pruebas;

public class Main {

	public static void main(String[] args) {
		
		Person persona1 = new Person();
		
		persona1.serName("Juan");
		persona1.setDocument("1094949423");
		
		Persona persona2 = new Person();

		persona2.serName("Persona");
		persona2.setDocument("149423");
		
		if(persona1.equals(persona2)) {
			System.out.println("Iguales");
		)else {
			System.out.println("Diferente");
		}
		}		

		System.out.println("Persona 1:" + persona1.hashCode());
		System.out.println("Persona 2:" + persona2.hashCode());
		
		System.out.println("Caracter 4:" + persona1.getDocument().charAt(4)));
		System.out.println("Persona 2:" + persona2.hashCode());
		
	
		int mod = 87 % 2;
		System.out.println();
	}
}
