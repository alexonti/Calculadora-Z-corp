package calculadora;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class Multiplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);

		double a = 0,b = 0,res,x,temp;
		
		System.out.println("Ingrese el primer número");
		System.out.println();

	    a=entrada.nextDouble();
	    int enta= (int)a;
	    double deca= a - enta;
	    
	    System.out.println("Ingrese el segundo número");
		System.out.println();
	    b=entrada.nextDouble();
	    int entb= (int)b;	     
	    double decb= b - entb;
	    
	    temp=entb;
		for (x=1;x<enta;x++){
		temp=temp+entb;}
		//temp=res;
		//System.out.println(temp);
		entrada.close();
		
		
	    double solodeca=deca*10;
	    
	    double solodecb=decb*10;
	    
	    solodeca= (int)solodeca;
	    solodecb= (int)solodecb;
	    
	    double temp2 = solodecb;
	    for (x=1;x<solodeca;x++){
	    double res2 = temp2+solodecb;
	    temp2=res2;
	    }
	   
	    double temp3 = solodeca;
	    for (x=1;x<solodecb;x++){
	    double res3 = temp3+solodeca;
	    temp3=res3/10;
	    
	        
	
}
	    double suma=temp2+temp3;
	    double suma2=suma/10;
	    double suma1=suma2+suma;
	    
	    BigDecimal resultado = new BigDecimal(suma1).setScale(2, RoundingMode.HALF_UP);
	    System.out.println("El producto es:"+ resultado.doubleValue());
	    
		
	    }
}






/*System.out.println("Ingrese el primer numero: ");
a=entrada.nextDouble();

System.out.println();

System.out.println("Ingrese el segundo numero: ");
b=entrada.nextDouble();
System.out.println();

temp=b;
for (x=1;x<a;x++){
res=temp+b;
temp=res;
System.out.println(temp);
entrada.close();

}
System.out.println();
*/


