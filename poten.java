package poten;
import java.util.*;
public class poten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double base=0;
		int cont=0;
		double aux=1;
		int exp=1;
		double comp=0;
		double exponente=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("ingrese su base");
		base=sc.nextDouble();
		System.out.println("ingrese su exponente, recuerde que tiene que ser entero");
		exponente=sc.nextDouble();
		exp=(int)exponente;
		comp=exponente-exp;
		if(comp!=0){
			System.out.println(Math.pow(base,exponente));//solucion parche
		}else{
		while(cont<exponente){
			aux=aux*base;
			cont++;
		}
		System.out.println("su resultado es: "+aux);
		}
	}
}
