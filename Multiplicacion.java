package calculadora;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class Multiplicacion {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in); // Se crea variable teclado que permite capturar lo que se ingresa por teclado
        double x = 0;           // Se declara variable Double x, donde se guardara conversion de string a Double primer termino de la suma
        double y = 0;           // Se declara variable Double y, donde se guardara conversion de string a Double segundo termino de la suma
        int i=0;
        int j=0;
        double xMult;
        double yMult;
        double res1;
        double res2;
        
        
        while(i<1){                                 // primer while para volver a solicitar numero
            System.out.print("ingrese a: ");         
            
            try{                                    // primer try para validar primer numero
                x=teclado.nextDouble();             // se puede traspasar directamente a double lo ingresado por teclado
                i++;                                // incremento para salir del while
            }catch(Exception e){
                teclado.next();
                System.out.println( "error");
        }
        }
        
        while(j<1){                                 // segundo while para volver a solicitar numero
            System.out.print("ingrese b: ");        
            
            try{                                    // segundo try para validar primer numero
                y=teclado.nextDouble();                
                j++; 
            }catch(Exception e){
                teclado.next();
                System.out.println( "error");
                teclado.close();
        }
        }
         
        xMult=(double)x*10;
        yMult=(double)y*10;
        
        res1=Multiplicar(xMult, yMult);
        res2=res1/100;
        
        BigDecimal resAprox = new BigDecimal(res2).setScale(2, RoundingMode.HALF_UP); //Codigo para aprox. resultado double
        System.out.println("El producto es: "+resAprox.doubleValue()); // Se completa el codigo anterior para mostrar resultado aprox.        
        
    } 
       
    
    public static double Multiplicar(double x, double y){   
        double producto=0.0;
        if((x>0)&&(y>0)){               // se evalua si valore de x e y son positivos
            for(int i=0;i<x;i++){
                producto=producto+y;
            }
        }
        if((x<0)&&(y<0)){               // se evalua si valore de x e y son negativos
            x=x*(-1);
            y=y*(-1);
            for(int i=0;i<x;i++){
                producto=producto+y;
            }
        }
        if((x<0)&&(y>0)){               // se evalua si valore de x es negativa e y es positiva
            x=x*(-1);
            for(int i=0;i<x;i++){
                producto=producto+y;
            }
            producto=producto*(-1);
        }
        if((x>0)&&(y<0)){               // se evalua si valore de x es positiva e y es negativa
            y=y*(-1);
            for(int i=0;i<x;i++){
                producto=producto+y;
            }
            producto=producto*(-1);
        }
        return producto;
        
    }
}