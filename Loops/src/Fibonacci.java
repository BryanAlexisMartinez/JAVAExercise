import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	int numero;
    	int fibo1;
    	int fibo2;
    	int i;
    	do{
    		System.out.print("Introduce el numero n de la serie de Fibonnaci que deseas calcular: ");
    	    numero = in.nextInt();
    	}while(numero<=1);
    	System.out.println("Los " + numero + " primeros numeros de la serie de Fibonacci son:");                 
    	fibo1=1;
    	fibo2=1;
    	System.out.print(fibo1 + " ");
    	for(i=2;i<=numero;i++){
    		System.out.print(fibo2 + " ");
    	    fibo2 = fibo1 + fibo2;
    	    fibo1 = fibo2 - fibo1;
    	}
    	System.out.println();   	
    }
}
