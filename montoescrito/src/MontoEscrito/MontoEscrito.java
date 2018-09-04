package MontoEscrito;

import java.util.Scanner;

public class MontoEscrito {

	private int numero;
    private char letra = 96;
    
    
    public MontoEscrito () {
        
        
    } 
    
    
    public void recibeNumeros () {
        
        String cadena;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca los numeros: ");
        cadena = teclado.nextLine();    
        
        String[] split = cadena.split(" +"); // EL SPLIT ES RECORTA LOS ESPACIOS de la cadena que estoy ingresando
        
        int x = 0;
        while (x < split.length) {
            
            this.numero = Integer.parseInt(split[x]);
            
            for (int i = 1; i <= numero; i = i + 1) {
            
                letra++;
            }
        
            System.out.println(letra);
            
            letra = 96;
            x++;
        }
        
                  
        
    }    



}
