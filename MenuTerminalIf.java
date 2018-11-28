package menuterminal;
import java.util.*;
public class MenuTerminalIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("      ******************************");
        System.out.println("      * **********Z-corp********** *");
        System.out.println("      *    Calculadora Zeneniana   *");
        System.out.println("      ******************************");
        System.out.println();
        System.out.println("              Bienvenido          ");
        System.out.println();
        System.out.println();
        System.out.println("Seleccione una de las siguientes opciones \n");
        
        
		Scanner sn = new Scanner(System.in);
        boolean salir = false;
        boolean regresar = false;
        int opcion = 0; //menu principal
        int opcion2;// menu operaciones matemàticas
        int opcion3;// menu multiplicacion
        int opcion4;
        int opcion5;
        int opcion6;
        int opcionsalir;
        int opcionregresar;
        int opcionacerca;
        
       // System.out.println("Calculadora Z-Corp \n\n");
       // System.out.println("Bienvenido \n\n");
       // System.out.println("Selecciona una opción \n");
        
 
        while (!salir) {
 
            System.out.println("1. Operaciones matemáticas");
            System.out.println("2. Operaciones binarias");
            System.out.println("3. Orden de datos");
            System.out.println("4. Promedios");
            System.out.println("5. Acerca");// muestra información acerca de quien realizo el trabajo y email de contacto.
            System.out.println("6. Salir \n");
            
            
 
            try {
            	
                System.out.println("Ingrese una opción \n");
                opcion = sn.nextInt();
                
 //menu general de la calculadora
                
                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado Operaciones matemáticas \n");
                        break;
                    case 2:
                        System.out.println("Has seleccionado Operaciones binarias \n");
                        break;
                    case 3:
                        System.out.println("Has seleccionado Orden de datos \n");
                        break;
                    case 4:
                        System.out.println("Has seleccionado Promedios \n");
                        break;
                    case 5:
                        System.out.println("Has seleccionado Acerca \n");
                        System.out.println();
                        break;
                    case 6:
                    	
                    	System.out.println();
                    	            	
                        salir = true;
                        break;
                    default:
                        System.out.println("\nSeleccione una opción entre 1 y 6 \n");
                       
                } //switch menu principal
                	} //try menu principal
               
             catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
                
            } // catch menu principal
       
           
        
       
        
        
            
            if(opcion==1) {
            	
            	System.out.println("Seleccione una opción");
            	System.out.println();
            	
            	System.out.println("1. Suma");
            	System.out.println("2. Resta");
            	System.out.println("3. Multiplicación");
            	System.out.println("4. División");
            	System.out.println("5. Regresar \n");


            	try {
            		
            	    System.out.println("Ingrese una opción \n");
            	    opcion2 = sn.nextInt();
            	    System.out.println();

            	    switch (opcion2) {
            	        case 1:
            	            System.out.println("Has seleccionado Suma \n");
            	            break;
            	        case 2:
            	            System.out.println("Has seleccionado Resta \n");
            	            break;
            	        case 3:
            	            System.out.println("Has seleccionado Multiplicación \n");
            	            break;
            	        case 4:
            	            System.out.println("Has seleccionado División \n");
            	            break;
            	        case 5:
            	        	System.out.println("\n Ingrese una opción \n");
            	        	regresar = true; //opción que nos devuelve al menu anterior
            	            
            	            break;
            	        default:
            	            System.out.println("\nSeleccione una opción entre 1 y 5 \n");
            	    
            	    } //switch operaciones matematicas
            	}//try menu principal

            	catch (InputMismatchException e) {
            	    System.out.println("Debes insertar un número");
            	    sn.next();
            	    
            	}
            } //if operaciones matematicas
        
            if (opcion==2) {
            	
            	System.out.println("Seleccione una opción");
            	System.out.println();
            	System.out.println("1. Suma binaria");
                System.out.println("2. Suma hexadecimal");
                System.out.println("3. Cambio de base");
                System.out.println("4. Decimal - Binario");
                System.out.println("5. Decimal - Hexadecimal");
                System.out.println("6. Regresar");
         
                try {
                	
                    System.out.println("Ingrese una opción \n");
                    opcion3 = sn.nextInt();

                    switch (opcion3) {
                        case 1:
                            System.out.println("Has seleccionado Suma binaria \n");
                            break;
                        case 2:
                            System.out.println("Has seleccionado Suma hexadecimal \n");
                            break;
                        case 3:
                            System.out.println("Has seleccionado Cambio de base \n");
                            break;
                        case 4:
                            System.out.println("Has seleccionado Decimal - binario \n");
                            break;
                        case 5:
                            System.out.println("Has seleccionado Decimal - hexadecimal \n");
                            break;
                        case 6:
                        	System.out.println("\n Ingrese una opción \n");
                            regresar = true;
                            break;
                        default:
                            System.out.println("\nSeleccione una opción entre 1 y 5 \n");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Debes insertar un número");
                    sn.next();
                    
                }
            	
            	
            	
            	
            } //if operaciones binarias
            
            if(opcion==3) {
            	
            	System.out.println("Seleccione una opción");
            	System.out.println();
            	
            	System.out.println("1. Aleatorio");
                System.out.println("2. Personalizado");
                System.out.println("3. Regresar");
                
         
                try {
                	
                    System.out.println("Ingrese una opción \n");
                    opcion3 = sn.nextInt();

                    switch (opcion3) {
                        case 1:
                            System.out.println("Has seleccionado Orden Aleatorio \n");
                            break;
                        case 2:
                            System.out.println("Has seleccionado Orden Personalizado \n");
                            break;
                        
                        case 3:
                            regresar = true;
                            break;
                        default:
                            System.out.println("\nSeleccione una opción entre 1 y 3 \n");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Debes insertar un número");
                    sn.next();
                    
                }
            } // if menu orden de datos
            
            if(opcion==4) {
            	
            	System.out.println("Seleccione una opción");
            	System.out.println();
            	
            	System.out.println("1. General");
                System.out.println("2. Ponderado");
                System.out.println("3. Regresar");
                
         
                try {
                	
                    System.out.println("Ingrese una opción \n");
                    opcion4 = sn.nextInt();

                    switch (opcion4) {
                        case 1:
                            System.out.println("Has seleccionado Promedio General \n");
                            break;
                        case 2:
                            System.out.println("Has seleccionado Promedio Ponderado \n");
                            break;
                        
                        case 3:
                            regresar = true;
                            break;
                        default:
                            System.out.println("\nSeleccione una opción entre 1 y 3 \n");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Debes insertar un número");
                    sn.next();
                    
                }
            	
            	
            	
            	
            } // if menu ponderado
            
            if(opcion==5) {
            	
            	System.out.println("      ******************************");
                System.out.println("      * **********Z-corp********** *");
                System.out.println("      *    Calculadora Zeneniana   *");
                System.out.println("      ******************************");
                System.out.println();
                System.out.println("            Creada y diseñada       ");
                System.out.println("            By Hijos de Zenen       ");
                System.out.println();
                System.out.println();
                System.out.println("             Víctor Barraza         ");
                System.out.println();
                System.out.println("             Zenen Canales          ");
                System.out.println();
                System.out.println("             Luis Galleguillos      ");
                System.out.println(); 
                System.out.println("             Miguel Ocque           ");
                System.out.println();
                System.out.println("             Alejandro Ontiveros    ");
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println("            Si lo dijo Zenen       ");
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println("               *Es ley*            ");
                
                break;
                
                
       
            	
            	
            	
            } // menu acerca de
            
            if(opcion==6) {
            	
            }
            
        
        } //while menu principal
        
        
        
        
        
	}// main string
} // class
	
	

