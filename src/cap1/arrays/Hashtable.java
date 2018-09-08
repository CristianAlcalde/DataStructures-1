package cap1.arrays;

public class Hashtable {
	
	Person[] elements;
	
	
	
	public static void main( String[] args) {
		int a = hashFunction("12345672");
		int b = hashFunction("81313214");
		int c = hashFunction("451358");
		int d = hashFunction("3408505");
		int e = hashFunction("43634643");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}
	
	static int hashFunction(String cedula) {
		
		int suma=0;
		String ced=cedula;
		
		while(ced.length()>1) {
			System.out.println(ced);
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

}
