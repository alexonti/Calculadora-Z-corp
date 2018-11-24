package calculadora;


import java.math.*;
import java.util.*;

import javax.swing.*;

public class Menuinteractivo {
	
    public static void main(String[] args) {
    	
    	Scanner teclado=new Scanner(System.in);
    	
    	int a = teclado.nextInt();// introduce a
    	int b = teclado.nextInt();// introduce b
    	int suma = a+b;
    	
    	
    	JOptionPane.showMessageDialog(null, "Bienvenidos al reino de Zenen \n");
    	JOptionPane.showConfirmDialog(null, "¿Esta seguro?", "El dios Zenen lo aprueba", JOptionPane.YES_NO_OPTION);
    	String[] operaciones = {
                "Operaciones matemáticas",
                "Operaciones binarias",
                "Promedios",
                "Orden de datos",
                "Salir"
            };
            
            String resp = (String) JOptionPane.showInputDialog(null, "Seleccione una opción", "Z-corp", JOptionPane.DEFAULT_OPTION, null, operaciones, operaciones[0]);// menu desplegable
           switch(resp) {
           case "Operaciones matemáticas":
        	   System.out.println(suma);
           case "Operaciones binarias":
        	  
			
			
        	   
           case "Promedios":
           case "Orden de datos":
           case "Salir":
        	   
            	
            }
            JOptionPane.showConfirmDialog(null, "¿Está seguro?");
            
        
            
    }
    }
    	



//JOptionPane.showMessageDialog(null, "Bienvenidos al reino de Zenen \n");
    	//JOptionPane.showInputDialog(null, "¿Desea continuar?", "Si - No");
    	
    	//menu para ingresar opcion    //int menu = Integer.parseInt(JOptionPane.showInputDialog(null, "Bienvenidos a nuestra calculadora Zeneniana\n\n 1.Operaciones matemáticas\n 2.Operaciones bienarias\n 3.Promedio\n 4.Ordenamiento de datos\n 5.Atras"));
    	   
    	   

    	
    	
    	
    	
    