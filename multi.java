package multi;
import java.util.*;
public class multi {

	public static void main(String[] args) {
		String realizar="";
		double valor1=0;
		double valor2=0;
		double resultado=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Seg�n la siguiente tabla:");
		System.out.println("_________________________");
		System.out.println("|simbolo|   operacion    | ");
		System.out.println("|-------|----------------|");
		System.out.println("|   +   | suma           |");
		System.out.println("|   -   | resta          |");
		System.out.println("|   *   | multiplicaci�n |");
		System.out.println("|   /   | division       |");
		System.out.println("|   ^   | elevaci�n      |");
		System.out.println("|-------|----------------|");
		System.out.println("");
		System.out.println("Ingrese el simbolo de la operaci�n que desea realizar");
		System.out.print("a continuacion:-->");
		realizar= sc.nextLine();
		if(realizar.equals("*")||realizar.equals("/")||realizar.equals("-")||realizar.equals("+")||realizar.equals("^")){
			System.out.println("");
			System.out.println("ingrese su primer valor");
			System.out.print("a continuacion:-->");
			valor1= sc.nextDouble();
			System.out.println("");
			System.out.println("ingrese su segundo valor");
			System.out.print("a continuacion:-->");
			valor2= sc.nextDouble();
			if(realizar.equals("*")){
				resultado=valor1*valor2;
				System.out.println("");
				System.out.println(valor1+" "+realizar+" "+valor2+" = "+resultado);
			}
			if(realizar.equals("/")){
				resultado=valor1/valor2;
				System.out.println("");
				System.out.println(valor1+" "+realizar+" "+valor2+" = "+resultado);
			}
			if(realizar.equals("+")){
				resultado=valor1+valor2;
				System.out.println("");
				System.out.println(valor1+" "+realizar+" "+valor2+" = "+resultado);
			}
			if(realizar.equals("-")){
				resultado=valor1-valor2;
				System.out.println("");
				System.out.println(valor1+" "+realizar+" "+valor2+" = "+resultado);
			}
		}else{
			System.out.println("");
			System.out.println("ingreso mal un dato reinicie el programa");
		}
	}
}