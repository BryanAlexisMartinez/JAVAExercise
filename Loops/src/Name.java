import java.util.Scanner;

public class Name {
	
	 public static void main(String[] args) {
	    	Scanner in = new Scanner(System.in);
	    	System.out.print("Ingresa tu nombre: ");
	    	String nombre = in.nextLine();
	    		    	
	    	System.out.println("Las letras de tu nombre son: ");
	    	for (int i = 0; i < nombre.length(); i++) {
	    		char letra = nombre.charAt(i);
	    		System.out.println(letra);				
			}   	
	 }
}