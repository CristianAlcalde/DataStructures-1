package Matriz;

//import java.util.Scanner; 

//import Person.*;

public class Matriz {

	 //atributos de una matriz
	   private int[][] matriz;
	   
	   private int numeroFilas;
	   
	   private int numeroColumnas;
	   
	   // constructor asginar los valores de los atributos para construir un objeto de tipo matriz
	   public Matriz (int numeroFilas,int numeroColumnas) {
	       
	       
	       this.numeroFilas = numeroFilas; //la primera variable es el atributo de la clase y la segunda variable es el valor que recibe el constructor
	               
	       this.numeroColumnas = numeroColumnas;        
	               
	        this.matriz = new int[numeroFilas][numeroColumnas];       
	 }
	   
	  // Creo Metodos
	  //Genero metodos de encapsulamiento 
	  
	   // aqui voy hacer un metodo que me va a retornar el numero de filas
	    public int getNumeroFilas () { // estoy retornando un entero
	        
	        return this.numeroFilas;
	    } 
	    // aqui voy a hacer un metodo que me va a modificar el numero de filas
	    public void setNumeroFilas (int numeroFilas) { // lo que el va a recibr se coloca entre parentesis
	        
	        this.numeroFilas = numeroFilas;
	    }

	     public int getNumeroColumnas () {
	         
	         return this.numeroColumnas;
	     }      
	    
	     public void setNmeroColumnas (int numeroColumnas) {
	         
	         this.numeroColumnas = numeroColumnas;
	     }    
	     // Creo Metodos Crud
	   
	     public void  insertarElemento(int numeroFilas,int numeroColumnas,int Elemento){
	         
	     this.matriz[numeroFilas][numeroColumnas] = Elemento;
	     
	     //return this.Elementos
	     }
	     // buscar un elemento posicion
	     public int buscarElementosPosicion(int numeroFilas, int numeroColumnas) {
	         
	     return matriz[numeroFilas] [numeroColumnas];
	         
	     }
	     // buscar elemento por valor 
	     
	     public int[] buscarElementoValor (int valor){
	         
	         int numFilas = this.numeroFilas;
	         
	         int numColumnas = this.numeroColumnas; 
	         
	         int [] result = new int[2];
	         
	         for (int f = 0; f < numFilas; f++){
	            for (int c = 0; c < numColumnas; c++){
	                
	                if (this.matriz[f][c] == valor){
	                    
	                   result[0] = f;
	                   result[1] = c;
	                } 
	            }
	         }
	         
	         return result;
	     }
	     
	     // Eliminar un elemento
	     public void eliminarElemento(int numeroFilas, int numeroColumnas) {
	         
	         this.matriz[numeroFilas][numeroColumnas] = 0;
	     }
	     
	     
	     
	 
	}






