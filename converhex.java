package converhex;
import java.util.*;
public class converhex {

	public static void main(String[] args) {
		int valor1=0;
		conhex(valor1);
	}
	 public static void conhex(int decimal){
		int aux=0;
		int suma=0;
		int cont=0;
		String hexadecimal;
		String hexadecimal2;
		Scanner teclado = new Scanner(System.in);
		while(aux==0){
			System.out.println("Introduce un número decimal: ");
		    decimal = teclado.nextInt();
		    suma=decimal+suma;
		    hexadecimal = Integer.toHexString(decimal);
		    System.out.println("su numero decimal es :"+decimal+" su numero hexadecimal es "+hexadecimal);
		    System.out.println("");
	        System.out.println("desea ingreserar otro numero ingrese: 0 para continuar, 1 para terminar ");
		    aux = teclado.nextInt();
		}
		 hexadecimal2 = Integer.toHexString(suma);
		 System.out.println("la suma de sus numeros decimales es : "+suma+" y en numeros hexadecimales es "+hexadecimal2);
         
	 }
         
	
}
