package menuterminal;
import java.util.*;
import java.math.*;
import java.io.*;
import java.net.*;

public class MenuTerminalIf {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		String black="\033[30m"; 
		   String red="\033[38;5;196m"; 
		   String green="\033[32m"; 
		   String yellow="\033[38;5;208m"; 
		   String blue="\033[34m"; 
		   String purple="\033[35m"; 
		   String cyan="\033[36m"; 
		   String white="\033[37m"; 
		   String bgreen="\u001b[38;5;190m";
		   String reset="\u001B[0m";
		   String backbwhite="\u001b[47;1m";
		   String backbgreen="\u001b[48;5;84m";
		   String underline="\033[4m";
		   String framed="\033[51m";
		   String encircled="\033[4m";
		   String lightgreen="\u001b[38;5;84m";
		   String bold="\033[1m";
		   String purplel="\033[38;5;38m";
		   String yelli="\033[38;5;229m";

		
		System.out.println(purplel+"      * * * * * * * * * * * * * * * *");
        System.out.println(purplel+  "      * * * * *   "+lightgreen+"Z-corp"+purplel+"    * * * * *      "+reset);
        System.out.println(purplel+ "      *        "+lightgreen+"Calculadora"+purplel+"          *      " +reset);
        System.out.println(purplel+"      * * * * * * * * * * * * * * * * "+reset);
        System.out.println();
        System.out.println("              "+bold+framed+lightgreen+" Bienvenido "+reset+"          ");
        System.out.println();
        System.out.println();
        System.out.println(yellow+"Seleccione una de las siguientes opciones \n"+reset);
        
        
		Scanner sn = new Scanner(System.in);
        boolean salir = false;
        boolean regresar = false;
        int opcion = 0; //menu principal
        int opcion2;// menu operaciones matemàticas
        int opcion3;// menu multiplicacion
        int opcion4;
        int opcion5;
     
        
       // System.out.println("Calculadora Z-Corp \n\n");
       // System.out.println("Bienvenido \n\n");
       // System.out.println("Selecciona una opción \n");
        
 
        while (!salir) {
 
            System.out.println(yelli+"1. Operaciones matemáticas");
            System.out.println("2. Operaciones binarias");
            System.out.println("3. Orden de datos");
            System.out.println("4. Promedios");
            System.out.println("5. Acerca");// muestra información acerca de quien realizo el trabajo y email de contacto.
            System.out.println("6. Salir \n"+reset);
            
            
 
            try {
            	
                System.out.println(encircled+yellow+"Ingrese una opción:\n"+reset);
                opcion = sn.nextInt();
                System.out.println();
 //menu general de la calculadora
                
                switch (opcion) {
                    case 1:
                        System.out.println(purplel+"Has seleccionado Operaciones matemáticas \n"+reset);
                        break;
                    case 2:
                        System.out.println(purplel+"Has seleccionado Operaciones binarias \n"+reset);
                        break;
                    case 3:
                        System.out.println(purplel+"Has seleccionado Orden de datos \n"+reset);
                        break;
                    case 4:
                        System.out.println(purplel+"Has seleccionado Promedios \n"+reset);
                        break;
                    case 5:
                    	if(opcion==5)
                        System.out.println(purplel+"Has seleccionado Acerca \n"+reset);
                        System.out.println();
                        
                        
        	        	regresar = true; //opción que nos devuelve al menu anterior
        	            
        	          
                        break;
                    case 6:
                    	
                    	     
                    	System.out.println(yellow+"\n ******    Programa terminado    ******"+reset);
                    	            	
                        salir = true;
                        System.exit(opcion); //Termina el programa
                        break;
                    default:
                        System.out.println(red+"\nSeleccione una opción entre 1 y 6 \n"+reset);
                       
                } //switch menu principal
                	} //try menu principal
               
             catch (InputMismatchException e) {
                System.out.println(cyan+"* * * Debes insertar un número* * * \n"+reset);
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
            	            double x = 0;           // Se declara variable Double x, donde se guardara conversion de string a Double primer termino de la suma
            	            double y = 0;           // Se declara variable Double y, donde se guardara conversion de string a Double segundo termino de la suma
            	            Scanner teclado=new Scanner(System.in); // Se crea variable teclado que permite capturar lo que se ingresa por teclado
            	            int i=0;
            	            int j=0;
            	            double total;
            	            
            	            
            	            
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
            	            }
            	            }
            	            total=Sumar(x, y);                          // se guarda resultado de funcion para codigo de abajo
            	            BigDecimal bigDecimal = new BigDecimal(total).setScale(2, RoundingMode.HALF_UP); //Codigo para aprox. resultado double
            	            System.out.println();
            	            System.out.println();
            	            System.out.println("******************************");
            	            System.out.println("      La suma es: "+bigDecimal.doubleValue()); // Se completa el codigo anterior para mostrar resultado aprox.        
            	            System.out.println("******************************");
            	            System.out.println();
            	            System.out.println();
            	            System.out.println();
            	            System.out.println();
            	            System.out.println();
            	            System.out.println("Seleccione una opción");
            	            System.out.println();
            	           
            	            
            	       
            	            break;
            	            
            	        case 2:
            	            System.out.println("Has seleccionado Resta \n");
            	            double x1 = 0;           // Se declara variable Double x, donde se guardara
            	            double y1 = 0;           // Se declara variable Double y, donde se guardara
            	            Scanner teclado2=new Scanner(System.in); // Se crea variable teclado que permite capturar lo que se ingresa por teclado
            	            int i1=0;
            	            int j1=0;
            	            double resultado;
            	            
            	            while(i1<1){                                 // primer while para volver a solicitar numero
            	                System.out.print("ingrese a: ");         
            	                
            	                try{                                    // primer try para validar primer numero
            	                    x1=teclado2.nextDouble();             // se puede traspasar directamente a double lo ingresado por teclado
            	                    i1++;                                // incremento para salir del while
            	                }catch(Exception e){
            	                    teclado2.next();
            	                    System.out.println( "error");
            	            }
            	            }
            	            
            	            while(j1<1){                                 // segundo while para volver a solicitar numero
            	                System.out.print("ingrese b: ");        
            	                
            	                try{                                    // segundo try para validar primer numero
            	                    y1=teclado2.nextDouble();                
            	                    j1++; 
            	                }catch(Exception e){
            	                    teclado2.next();
            	                    System.out.println( "error");
            	            }
            	            }
            	            resultado=Restar(x1, y1);                          // se guarda resultado de funcion para codigo de abajo
            	            BigDecimal bigDecimal1 = new BigDecimal(resultado).setScale(2, RoundingMode.HALF_UP); //Codigo para aprox. resultado double
            	            	System.out.println();
    	            System.out.println("La diferencia es: "+bigDecimal1.doubleValue()); // Se completa el codigo anterior para mostrar resultado aprox.        
    	            System.out.println();
    	            System.out.println();
    	            System.out.println();
    	            System.out.println();
    	            System.out.println();
    	            System.out.println();
    	            System.out.println();
    	            System.out.println("Seleccione una opción");
    	            System.out.println();
            	            break;
            	            
            	        case 3:
            	            System.out.println("Has seleccionado Multiplicación \n");
            	            Scanner teclado3=new Scanner(System.in); // Se crea variable teclado que permite capturar lo que se ingresa por teclado
            	            double x2 = 0;           // Se declara variable Double x, donde se guardara conversion de string a Double primer termino de la suma
            	            double y2 = 0;           // Se declara variable Double y, donde se guardara conversion de string a Double segundo termino de la suma
            	            int i2=0;
            	            int j2=0;
            	            double xMult = 0;
            	            double yMult = 0;
            	            double res1;
            	            double res2;
            	            
            	            
            	            while(i2<1){                                 // primer while para volver a solicitar numero
            	                System.out.print("ingrese a: ");         
            	                
            	                try{                                    // primer try para validar primer numero
            	                    x2=teclado3.nextDouble();             // se puede traspasar directamente a double lo ingresado por teclado
            	                    i2++;                                // incremento para salir del while
            	                }catch(Exception e){
            	                    teclado3.next();
            	                    System.out.println( "error");
            	            }
            	            }
            	            
            	            while(j2<1){                                 // segundo while para volver a solicitar numero
            	                System.out.print("ingrese b: ");        
            	                
            	                try{                                    // segundo try para validar primer numero
            	                    y2=teclado3.nextDouble();                
            	                    j2++; 
            	                }catch(Exception e){
            	                    teclado3.next();
            	                    System.out.println( "error");
            	            }
            	            }
            	            
				    
            	           // xMult=(double)x2*10;
            	           // yMult=(double)y2*10;
            	            
            	            res1=Multiplicar1(xMult, yMult);
            	          //  res2=res1/100;
            	            
            	            BigDecimal resAprox = new BigDecimal(res1).setScale(2, RoundingMode.HALF_UP); //Codigo para aprox. resultado double
            	            System.out.println();
            	            System.out.println("El producto es: "+resAprox.doubleValue()); // Se completa el codigo anterior para mostrar resultado aprox.        
            	            System.out.println();
            	            System.out.println();
            	            System.out.println();
            	            System.out.println();
            	            System.out.println();
            	            System.out.println();
            	            System.out.println();
            	            System.out.println("Seleccione una opción");
            	            System.out.println();
       
            	            break;
            	        case 4:
            	            System.out.println("Has seleccionado División \n");
            	            break;
            	        case 5://la funcion de division esta abajo 
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
                System.out.println("4. Regresar");
         
                try {
                	
                    System.out.println("Ingrese una opción \n");
                    opcion3 = sn.nextInt();
                    switch (opcion3) {
                        case 1:
                            System.out.println("Has seleccionado Suma binaria \n");
                            
                            Scanner Entrada=new Scanner(System.in);
                            String n1="",n2="";
                            	//Se pide 1er numero binario
                            System.out.print("Ingrese 1º numero ");
                            n1=Entrada.next();
                            	//Se pide 2do numero binario
                            System.out.print("Ingrese 2º numero ");
                            n2=Entrada.next();
                            System.out.println();
                            System.out.print("Su resultado de la suma binaria es "+Suma(n1,n2));
                            System.out.println();
            	            System.out.println();
            	            System.out.println();
            	            System.out.println();
            	            System.out.println();
            	            System.out.println();
            	            System.out.println();
            	            System.out.println("Seleccione una opción");
            	            System.out.println();
               
                            break;
                            
                        case 2:
                            System.out.println("Has seleccionado Suma hexadecimal \n");
                            
                            break;
                        case 3:
                            System.out.println("Has seleccionado Cambio de base \n");
                            
                            Scanner sc=new Scanner (System.in);
                    		System.out.println("Ingrese el numero a transformar");
                    		String valor5="";
                    		valor5=sc.nextLine();
                    		System.out.println("Ingrese el numero de la base a transformar");
                    		int x5=0;
                    		x5=sc.nextInt();
                    		int num5 = 0;
                    		System.out.println("Ingrese el numero de la base a la que desea transformar(hasta base 16)");
                    		int y5=0;
                    		y5=sc.nextInt();
                    		
                    		try{num5=Integer.parseInt(valor5);}
                    		catch (NumberFormatException ex){
                    			if(y5==2){
                    				int resp=AlfaDec(valor5,10);
                    				String respuesta=Decbin(resp,2);
                    				System.out.println();
                    	            System.out.println();
                    	            System.out.println("*****************************************");
                    	            System.out.println("      El nuevo número transformado es: "+ respuesta); // Se completa el codigo anterior para mostrar resultado aprox.        
                    	            System.out.println("*****************************************");
                    	            System.out.println();
                    	            System.out.println();
                    	            System.out.println();
                    	            System.out.println();
                    	            System.out.println();
                    	            System.out.println("Seleccione una opción");
                    	            System.out.println();
                    				break;
                    			}
                    			if(y5==10){
                    				int respuesta=AlfaDec(valor5,y5);
                    				System.out.println();
                    	            System.out.println();
                    	            System.out.println("******************************************");
                    	            System.out.println("      El nuevo número transformado es: "+ respuesta); // Se completa el codigo anterior para mostrar resultado aprox.        
                    	            System.out.println("******************************************");
                    	            System.out.println();
                    	            System.out.println();
                    	            System.out.println();
                    	            System.out.println();
                    	            System.out.println();
                    	            System.out.println("Seleccione una opción");
                    	            System.out.println();
                    				break;
                    			}if(y5<10){
                    				int res=AlfaDec(valor5,10);
                    				int respuesta=DecTodas(res,y5);
                    				System.out.println();
                    	            System.out.println();
                    	            System.out.println("*******************************************");
                    	            System.out.println("      El nuevo número transformado es: "+ respuesta); // Se completa el codigo anterior para mostrar resultado aprox.        
                    	            System.out.println("*******************************************");
                    	            System.out.println();
                    	            System.out.println();
                    	            System.out.println();
                    	            System.out.println();
                    	            System.out.println();
                    	            System.out.println("Seleccione una opción");
                    	            System.out.println();
                    				break;
                    			}if (y5>10 && y5<=16){
                    				int res=AlfaDec(valor5,10);
                    				String respuesta=decalfa(res,y5);
                    				System.out.println();
                    	            System.out.println();
                    	            System.out.println("********************************************");
                    	            System.out.println("      El nuevo número transformado es: "+ respuesta); // Se completa el codigo anterior para mostrar resultado aprox.        
                    	            System.out.println("********************************************");
                    	            System.out.println();
                    	            System.out.println();
                    	            System.out.println();
                    	            System.out.println();
                    	            System.out.println();
                    	            System.out.println("Seleccione una opción");
                    	            System.out.println();
                    				break;
                    			}else{System.out.println();
                	            System.out.println();
                	            System.out.println("************************************************");
                	            System.out.println("            La base no es válida"); // Se completa el codigo anterior para mostrar resultado aprox.        
                	            System.out.println("************************************************");
                	            System.out.println();}
                    		}
                    		if(x5==10){
                    			if(y5==2){
                    				String respuesta=Decbin(num5,y5);
                    				System.out.println();
                    	            System.out.println();
                    	            System.out.println("********************************************");
                    	            System.out.println("      El nuevo número transformado es: "+ respuesta); // Se completa el codigo anterior para mostrar resultado aprox.        
                    	            System.out.println("********************************************");
                    	            System.out.println();
                    	            System.out.println();
                    	            System.out.println();
                    	            System.out.println();
                    	            System.out.println();
                    	            System.out.println("Seleccione una opción");
                    	            System.out.println();
                    				break;
                    			}
                    			if(y5==10){
                    				System.out.println(num5+"");
                    				break;
                    			}if (y5<10 && y5>2){
                    				int respuesta=DecTodas(num5,y5);
                    				System.out.println();
                    	            System.out.println();
                    	            System.out.println("********************************************");
                    	            System.out.println("      El nuevo número transformado es: "+ respuesta); // Se completa el codigo anterior para mostrar resultado aprox.        
                    	            System.out.println("********************************************");
                    	            System.out.println();
                    	            System.out.println();
                    	            System.out.println();
                    	            System.out.println();
                    	            System.out.println();
                    	            System.out.println("Seleccione una opción");
                    	            System.out.println();
                    				break;
                    			}if (y5>10 && y5<=16){
                    				String respuesta=decalfa(num5,y5);
                    				System.out.println();
                    	            System.out.println();
                    	            System.out.println("*********************************************");
                    	            System.out.println("      El nuevo número transformado es: "+ respuesta); // Se completa el codigo anterior para mostrar resultado aprox.        
                    	            System.out.println("*********************************************");
                    	            System.out.println();
                    	            System.out.println();
                    	            System.out.println();
                    	            System.out.println();
                    	            System.out.println();
                    	            System.out.println("Seleccione una opción");
                    	            System.out.println();
                    				break;
                    			}
                    			else{
                    				System.out.println();
                    	            System.out.println();
                    	            System.out.println("*********************************************");
                    	            System.out.println("          La base no es válida"); // Se completa el codigo anterior para mostrar resultado aprox.        
                    	            System.out.println("*********************************************");
                    	            System.out.println();}
                    			
                    		}if (x5<10 && x5>2){
                    			if (y5==2){
                    				int res=TodoDec(num5,x5);
                    				String respuesta=Decbin(res,2);
                    				System.out.println();
                    	            System.out.println();
                    	            System.out.println("*********************************************");
                    	            System.out.println("      El nuevo número transformado es: "+ respuesta); // Se completa el codigo anterior para mostrar resultado aprox.        
                    	            System.out.println("*********************************************");
                    	            System.out.println();
                    	            System.out.println();
                    	            System.out.println();
                    	            System.out.println();
                    	            System.out.println();
                    	            System.out.println("Seleccione una opción");
                    	            System.out.println();
                    				break;
                    			}
                    			if(y5==10){
                    				int respuesta=TodoDec(num5,x5);
                    				System.out.println();
                    	            System.out.println();
                    	            System.out.println("***********************************************");
                    	            System.out.println("      El nuevo número transformado es: "+ respuesta); // Se completa el codigo anterior para mostrar resultado aprox.        
                    	            System.out.println("***********************************************");
                    	            System.out.println();
                    	            System.out.println();
                    	            System.out.println();
                    	            System.out.println();
                    	            System.out.println();
                    	            System.out.println("Seleccione una opción");
                    	            System.out.println();
                    				break;
                    			}if (y5<10){
                    				int res=TodoDec(num5,x5);
                    				//System.out.println(res);
                    				int respuesta=DecTodas(res,y5);
                    				System.out.println();
                    	            System.out.println();
                    	            System.out.println("************************************************");
                    	            System.out.println("      El nuevo número transformado es: "+ respuesta); // Se completa el codigo anterior para mostrar resultado aprox.        
                    	            System.out.println("************************************************");
                    	            System.out.println();
                    	            System.out.println();
                    	            System.out.println();
                    	            System.out.println();
                    	            System.out.println();
                    	            System.out.println("Seleccione una opción");
                    	            System.out.println();
                    				break;
                    			}if (y5>10 && y5<=16){
                    				int res=TodoDec(num5,x5);
                    				String respuesta=decalfa(res,y5);
                    				System.out.println();
                    	            System.out.println();
                    	            System.out.println("************************************************");
                    	            System.out.println("      El nuevo número transformado es: "+ respuesta); // Se completa el codigo anterior para mostrar resultado aprox.        
                    	            System.out.println("************************************************");
                    	            System.out.println();
                    	            System.out.println();
                    	            System.out.println();
                    	            System.out.println();
                    	            System.out.println();
                    	            System.out.println("Seleccione una opción");
                    	            System.out.println();
                    				break;
                    			}
                    			else{System.out.println();
                	            System.out.println();
                	            System.out.println("****************************************************");
                	            System.out.println("             La base no es válida"); // Se completa el codigo anterior para mostrar resultado aprox.        
                	            System.out.println("****************************************************");
                	            System.out.println();
                	            }
                    		}
                    		
                    		if(x5==2){
                    			if(y5==2){
                    				System.out.println(num5);
                    			}
                    			if(y5==10){
                    			int respuesta=Bindec(num5,2);
                    			System.out.println();
                	            System.out.println();
                	            System.out.println("****************************************************");
                	            System.out.println("      El nuevo número transformado es: "+ respuesta); // Se completa el codigo anterior para mostrar resultado aprox.        
                	            System.out.println("****************************************************");
                	            System.out.println();
                	            System.out.println();
                	            System.out.println();
                	            System.out.println();
                	            System.out.println();
                	            System.out.println("Seleccione una opción");
                	            System.out.println();
                    			}
                    			if(y5<10){
                    				int res=Bindec(num5,2);
                    				int respuesta=DecTodas(res,y5);
                    				System.out.println();
                    	            System.out.println();
                    	            System.out.println("************************************************");
                    	            System.out.println("      El nuevo número transformado es: "+ respuesta); // Se completa el codigo anterior para mostrar resultado aprox.        
                    	            System.out.println("************************************************");
                    	            System.out.println();
                    	            System.out.println();
                    	            System.out.println();
                    	            System.out.println();
                    	            System.out.println();
                    	            System.out.println("Seleccione una opción");
                    	            System.out.println();
                    			}
                    			if(y5>10){
                    				int res=Bindec(num5,2);
                    				System.out.println(res);
                    				String respuesta=decalfa(res,y5);
                    				System.out.println();
                    	            System.out.println();
                    	            System.out.println("**************************************************");
                    	            System.out.println("      El nuevo número transformado es: "+ respuesta); // Se completa el codigo anterior para mostrar resultado aprox.        
                    	            System.out.println("**************************************************");
                    	            System.out.println();
                    	            System.out.println();
                    	            System.out.println();
                    	            System.out.println();
                    	            System.out.println();
                    	            System.out.println("Seleccione una opción");
                    	            System.out.println();
                    			}
                    		}if(x5>10){
                    			if(y5==2){
                    				int resp=AlfaDec(valor5,10);
                    				String respuesta=Decbin(resp,2);
                    				System.out.println();
                    	            System.out.println();
                    	            System.out.println("**************************************************");
                    	            System.out.println("      El nuevo número transformado es: "+ respuesta); // Se completa el codigo anterior para mostrar resultado aprox.        
                    	            System.out.println("**************************************************");
                    	            System.out.println();
                    	            System.out.println();
                    	            System.out.println();
                    	            System.out.println();
                    	            System.out.println();
                    	            System.out.println("Seleccione una opción");
                    	            System.out.println();
                    				break;
                    			}
                    			if(y5==10){
                    				int respuesta=AlfaDec(valor5,y5);
                    				System.out.println();
                    	            System.out.println();
                    	            System.out.println("**************************************************");
                    	            System.out.println("      El nuevo número transformado es: "+ respuesta); // Se completa el codigo anterior para mostrar resultado aprox.        
                    	            System.out.println("**************************************************");
                    	            System.out.println();
                    	            System.out.println();
                    	            System.out.println();
                    	            System.out.println();
                    	            System.out.println();
                    	            System.out.println("Seleccione una opción");
                    	            System.out.println();
                    				break;
                    			}if(y5<10){
                    				int res=AlfaDec(valor5,10);
                    				//System.out.println(res);
                    				int respuesta=DecTodas(res,y5);
                    				System.out.println();
                    	            System.out.println();
                    	            System.out.println("**************************************************");
                    	            System.out.println("      El nuevo número transformado es: "+ respuesta); // Se completa el codigo anterior para mostrar resultado aprox.        
                    	            System.out.println("**************************************************");
                    	            System.out.println();
                    	            System.out.println();
                    	            System.out.println();
                    	            System.out.println();
                    	            System.out.println();
                    	            System.out.println("Seleccione una opción");
                    	            System.out.println();
                    				break;
                    			}if (y5>10 && y5<=16){
                    				int res=AlfaDec(valor5,10);
                    				String respuesta=decalfa(res,y5);
                    				System.out.println();
                    	            System.out.println();
                    	            System.out.println("**************************************************");
                    	            System.out.println("      El nuevo número transformado es: "+ respuesta); // Se completa el codigo anterior para mostrar resultado aprox.        
                    	            System.out.println("**************************************************");
                    	            System.out.println();
                    	            System.out.println();
                    	            System.out.println();
                    	            System.out.println();
                    	            System.out.println();
                    	            System.out.println("Seleccione una opción");
                    	            System.out.println();
                    				break;
                    }
                    			else{
                    				System.out.println();
                    	            System.out.println();
                    	            System.out.println("*******************************************************");
                    	            System.out.println("           La base no es válida"); // Se completa el codigo anterior para mostrar resultado aprox.        
                    	            System.out.println("*******************************************************");
                    	            System.out.println();
                    			
                            break;}}
                            
                        
                        case 4:
                        	System.out.println("\n Ingrese una opción \n");
                            regresar = true;
                            break;
                        default:
                            System.out.println("\nSeleccione una opción entre 1 y 5 \n");
                    }
                } 
            
            catch (InputMismatchException e) {
                    System.out.println("Debes insertar un número");
                    sn.next();
                    
                }
            	
            	
            	
            	
            } //if operaciones binarias
            
            if(opcion==3) {
            	
            	System.out.println("Seleccione una opción");
            	System.out.println();
            	
            	System.out.println("1. Continuar");
                System.out.println("2. Regresar \n");
               
                
         
                try {
                	
                    System.out.println("Ingrese una opción \n");
                    opcion3 = sn.nextInt();
                    switch (opcion3) {
                        case 1:
                        	Scanner sc=new Scanner (System.in);
                    		int con = 2;
                    		int a = 0;
                    		String auxi;
                    		int aux2 = 0;
                    		int preg=0;
                    		int preg2=0;
                    		String ent1;
                    		int sec = 0;
                    		System.out.println("Deseas ordenar letras o numeros?");
                    		System.out.println("Ingresa un 0 para letras");
                    		System.out.println("ingresa un 1 para numeros");
                    		while(con>1){
                    		 auxi=sc.nextLine();
                    		 //sc.nextLine();
                    		 try{preg=Integer.parseInt(auxi);}
                    		 catch(NumberFormatException ex){
                    			 System.out.println("Por favor ingrese un dato valido");
                    			 con=3;
                    			 continue;
                    		 }
                    		 
                    		if(preg==0 ||preg ==1){
                    			preg2=preg;
                    			con=0;
                    		}else{
                    			con=2;
                    			System.out.println("Por favor ingresa un dato valido");}
                    		}
                    		con=3;
                    		System.out.println("Ingrese la cantidad de elementos(Numeros) a ordenar ");
                    		while(con>1){
                    		auxi=sc.nextLine();
                    		try{sec=Integer.parseInt(auxi);
                    		con=0;}
                    		catch(NumberFormatException ex){
                    			System.out.println("Por favor ingrese un dato valido");
                    			 con=3;
                    			 continue;
                    		}
                    		//sc.nextLine();
                    		}
                    		System.out.println("¿Como deseas ordenar los datos?");
                    		System.out.println("Ingresa 0 para ordenar de forma ascendente");
                    		System.out.println("Ingresa 1 para ordenar de forma descendente");
                    		int op2 = 0;
                    		int respues=3;
                    		while (op2>=0){
                    			int exp = 0;
                    		   String mame=sc.nextLine();
                    		
                    		   try{ exp=Integer.parseInt(mame); }
                    		   catch (NumberFormatException ex){
                    			   System.out.println("Por favor no ingreses letras");
                    			   op2++;
                    			   continue;
                    		
                    		   }
                    		   if (exp==0 || exp==1){
                    			   op2=-1;
                    			   respues=exp;
                    		   }else{System.out.println("Por favor ingresa un 0 o un 1 solamente");}
                    		}
                    		if(respues==0){    //menor a mayor
                    		   if (preg2==0){              //ordena letras
                    			System.out.println("Ingrese letras a ordenar");
                    			System.out.println("Cada letra debe ir por separado");
                    			int orden[]=new int[sec];
                    			String letras[]=new String [sec];
                    		    while(con<sec){
                    		       ent1=sc.nextLine();
                    		      // if(ent1=="-1"){
                    			  
                    			     // con=-1;
                    		     //  }else{
                    		          try{
                    		        	  a=Integer.parseInt(ent1);
                    		        	  System.out.println("Ingresa letras");
                    		        	  }
                    		          catch (NumberFormatException ex){
                    			      String aux=ent1.toUpperCase();
                    			 
                    			      a=Valorletra(aux);

                    			      orden[con]=a;
                    			        con++;
                    		          }
                    		        
                    		      // }
                    		   }
                    		    for (int i = 0; i < orden.length; i++) {
                    	            for (int j = 1; j < (orden.length); j++) {
                    	                if (orden[j] < orden[j - 1]) {  // el kernel si cambias el simbolo de mayor a menor cambia resultado a ascendete o descente.
                    	                    aux2 = orden[j - 1];
                    	                    
                    	                    orden[j - 1] = orden[j];
                    	                    
                    	                    orden[j] = aux2; 
                    	                    
                    	            }
                    	        }
                    	    }
                    		    for (int i=0;i<orden.length;i++){
                    		    	aux2=orden[i];
                    		    	auxi=NumLetra(aux2);
                    		    	
                    		    	letras [i]=auxi;
                    		    }
                    		    System.out.println("Ordenados de forma ascendente es");
                    		    System.out.println(Arrays.toString(letras));
                    		}else{   //ordena numeros
                    			int orden[]=new int[sec];
                    			System.out.println("ingrese los numeros a ordenar");
                    			System.out.println("Condira que las palabras seran consideradas 0");
                    			  while(con<sec){
                    			       ent1=sc.nextLine();
                    			       //if(ent1=="-1"){
                    				    
                    				     // con=-1;
                    			  //     }
                    			 // else{
                    			          try{a=Integer.parseInt(ent1);}
                    			          catch (NumberFormatException ex){
                    			        	  System.out.println("Favor de ingresar datos numericos");
                    				      //String aux=ent1.toUpperCase();
                    				     // a=Valorletra(ent1);	  
                    			              }
                    			        orden[con]=a;
                    			        con++;
                    			     //  }
                    			   }
                    			  for (int i = 0; i < orden.length; i++) {
                    		            for (int j = 1; j < (orden.length); j++) {
                    		                if (orden[j] < orden[j - 1]) {  // el kernel si cambias el simbolo de mayor a menor cambia resultado a ascendete o descente.
                    		                    aux2 = orden[j - 1];
                    		                    
                    		                    orden[j - 1] = orden[j];
                    		                    
                    		                    orden[j] = aux2; 
                    		                    
                    		            }
                    		        }
                    		    }System.out.println("Ordenados de forma ascendente es");
                    			  System.out.println(Arrays.toString(orden));
                    		}
                    		}
                    		else{              //mayor a menor
                    			
                    			 if (preg2==0){ 
                    			System.out.println("Ingrese letras a ordenar");       //letras
                    			System.out.println("Cada letra debe ir por separado");
                    			int orden[]=new int[sec];
                    			String letras[]=new String [sec];
                    		    while(con<sec){
                    		       ent1=sc.nextLine();
                    		      // if(ent1=="-1"){
                    			  
                    			     // con=-1;
                    		     //  }else{
                    		          try{
                    		        	  a=Integer.parseInt(ent1);
                    		        	  System.out.println("Ingresa letras");
                    		        	  }
                    		          catch (NumberFormatException ex){
                    			      String aux=ent1.toUpperCase();
                    			      //System.out.println(aux);
                    			      a=Valorletra(aux);

                    			      orden[con]=a;
                    			        con++;
                    		          }
                    		        
                    		      // }
                    		   }
                    		    for (int i = 0; i < orden.length; i++) {
                    	            for (int j = 1; j < (orden.length); j++) {
                    	                if (orden[j] > orden[j - 1]) {  // el kernel si cambias el simbolo de mayor a menor cambia resultado a ascendete o descente.
                    	                    aux2 = orden[j - 1];
                    	                    
                    	                    orden[j - 1] = orden[j];
                    	                    
                    	                    orden[j] = aux2; 
                    	                    
                    	            }
                    	        }
                    	    }
                    		    for (int i=0;i<orden.length;i++){
                    		    	aux2=orden[i];
                    		    	auxi=NumLetra(aux2);
                    		    	
                    		    	letras [i]=auxi;
                    		    }System.out.println("Ordenados de forma descendente es");
                    		    System.out.println(Arrays.toString(letras));
                    		}
                    		else{                    //numeros
                    			int orden[]=new int[sec];
                    			System.out.println("ingrese los numeros a ordenar");
                    			System.out.println("Condira que las palabras seran consideradas 0");
                    			  while(con<sec){
                    			       ent1=sc.nextLine();
                    			       //if(ent1=="-1"){
                    				     
                    				     // con=-1;
                    			  //     }
                    			 // else{
                    			          try{a=Integer.parseInt(ent1);}
                    			          catch (NumberFormatException ex){
                    			        	  System.out.println("Favor de ingresar datos numericos");
                    				      //String aux=ent1.toUpperCase();
                    				     // a=Valorletra(ent1);	  
                    			              }
                    			        orden[con]=a;
                    			        con++;
                    			     //  }
                    			   }
                    			  for (int i = 0; i < orden.length; i++) {
                    		            for (int j = 1; j < (orden.length); j++) {
                    		                if (orden[j] > orden[j - 1]) {  // el kernel si cambias el simbolo de mayor a menor cambia resultado a ascendete o descente.
                    		                    aux2 = orden[j - 1];
                    		                    
                    		                    orden[j - 1] = orden[j];
                    		                    
                    		                    orden[j] = aux2; 
                    		                    
                    		            }
                    		        }
                    		    }System.out.println("Ordenados de forma descendente es");
                    System.out.println(Arrays.toString(orden));
                            break;
                            }
                    		}
                            
                       
                        
                        case 2:
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
            	System.out.println(lightgreen+"* * * * * * * * * * * * * * * * * * * * * *");
            	System.out.println(lightgreen+"*      ******************************     *");
                System.out.println(lightgreen+"*      *        ***Z-corp***        *     *");
                System.out.println(lightgreen+"*      *    Calculadora Zeneniana   *     *");
                System.out.println("*      ******************************     *");
                System.out.println("*                                         *");
                System.out.println("*            Creada y diseñada            *");
                System.out.println("*            By Hijos de Zenen            *");
                System.out.println("*                                         *");
                System.out.println("*              Inspirada por              *");
                System.out.println("*                  Zenen                  *");
                System.out.println("*           *******************           *");
                System.out.println("*                                         *");
                System.out.println("*             Víctor Barraza              *");
                System.out.println("*                                         *");
                System.out.println("*             Zenen Canales               *");
                System.out.println("*                                         *");
                System.out.println("*             Luis Galleguillos           *");
                System.out.println("*                                         *");
                System.out.println("*             Miguel Ocque                *");
                System.out.println("*                                         *");
                System.out.println("*             Alejandro Ontiveros         *");
                System.out.println("*                                         *");
                System.out.println("*                                         *");
                System.out.println("*                                         *");
                System.out.println("*            Si lo dijo Zenen             *");
                System.out.println("*                                         *");
                System.out.println("*                                         *");
                System.out.println("*                                         *");
                System.out.println("*              ***Es ley***               *");
                System.out.println("*                                         *");
                System.out.println("* * * * * * * * * * * * * * * * * * * * * *");
                regresar = true;
                System.out.println(yellow+"\n ******    Programa terminado    ******"+reset);
                break;
                
                
                
       
            	
            	
            	
            } // menu acerca de
            
            if(opcion==6) {
            	
            }
            
        
        } //while menu principal
        
        
        
        
        
	}// main string
	
	public static double Sumar(double x, double y){  // Se declara la Funcion Sumar de tipo Double con dos parametros de entrada x e y
        double total;               // Se declara variable Double total para guardar el total de la suma de dos valores
        total= x + y;               // Se le asigna a variable total la suma de los dos parametros de entrada
return total;
	}
	public static double Restar(double x, double y){
        double diferencia;               // Se declara variable Double dif. para guardar la diferencia entre x - y
        diferencia= x - y;               // Se le asigna a variable dif. de los dos parametros de entrada
return diferencia;
	}
/*public static double division(double dividendo, double divisor){
	
	double residuo=0;
	double residuo1=0;
	double residuo2=0;
	String simb="";
	int res;
	int res1;
	int res2;
	double result = 0;
	double auxr;
	int result2 = 0;
	if(divisor==0){
		System.out.println("no puede ser cero el divisor");
	}
	if(dividendo<0&&divisor<0){
		dividendo=0-dividendo;
		divisor=0-divisor;
		simb="";
	}
	if(dividendo<0&&divisor>0){
		dividendo=0-dividendo;
		simb="-";
	}
	if(dividendo>0&&divisor<0){
		divisor=0-divisor;
		simb="-";
	}
	
	double resto=dividendo;
	while(divisor<=resto){
		resto=resto-divisor;
		residuo++;
	}
	
	if(resto==0){
		System.out.println("el resultado de su division es ");
		System.out.println(simb+residuo);
	}
	if(resto!=0){
		resto=resto+resto+resto+resto+resto+resto+resto+resto+resto+resto;
		while(divisor<=resto){
			resto=resto-divisor;
			residuo1++;
		}
		if(resto==0){
			System.out.println("el resultado de su division es ");
			res=(int)residuo;
			res1=(int)residuo1;
			res2=(int)residuo2;
			String suprem=simb+res+"."+res1+res2;
			result=new Double(suprem).doubleValue();
			result2=(int)result;
			auxr=result-result2;
			if(auxr>0.99&&auxr<1){
				result2=result2+1;
				System.out.println(result2);
			}else{
				System.out.println(result);
				
				}
				}
			}	

		if(resto!=0){
			resto=resto+resto+resto+resto+resto+resto+resto+resto+resto+resto;
			while(divisor<=resto){
				resto=resto-divisor;
				residuo2++;
				
			}
			
	//System.out.println("el resultado de su division es ");
	res=(int)residuo;
	res1=(int)residuo1;
	res2=(int)residuo2;
	String suprem=simb+res+"."+res1+res2;
	result=new Double(suprem).doubleValue();
	
	result2=(int)result;
	
	auxr=result-result2;
	
	if(auxr>0.99&&auxr<1){
		result2=result2+1;
		
	}else{	
		}
		}return result2;
		}
//falta potencia
}*/

	
	
	public static double Multiplicar1(double x2, double y2){   
        double aux = x2,auy=y2;
 	for(int i=0;i<9;i++){//x*10
     	x2=x2+aux;
     }
 	for(int j=0;j<9;j++){//y*10
 		y2=y2+auy;
 	}
		
	double producto=0.0;
        if((x2>0)&&(y2>0)){               // se evalua si valore de x e y son positivos
            for(int i2=0;i2<x2;i2++){
                producto=producto+y2;
            }
        }
        if((x2<0)&&(y2<0)){               // se evalua si valore de x e y son negativos
            x2=x2*(-1);
            y2=y2*(-1);
            for(int i=0;i<x2;i++){
                producto=producto+y2;
            }
        }
        if((x2<0)&&(y2>0)){               // se evalua si valore de x es negativa e y es positiva
            x2=x2*(-1);
            for(int i2=0;i2<x2;i2++){
                producto=producto+y2;
            }
            producto=producto*(-1);
        }
        if((x2>0)&&(y2<0)){               // se evalua si valore de x es positiva e y es negativa
            y2=y2*(-1);
            for(int i2=0;i2<x2;i2++){
                producto=producto+y2;
            }
            producto=producto-(producto+producto);//cambio de signo
        }producto=producto/100;
        return producto;
}
	
	public static String Suma(String n1, String n2){
		
		//recibe y convierte numeros binarios
	int a1=Integer.parseInt(n1,2);
	int a2=Integer.parseInt(n2,2);
		//Realiza calculo
	int c=a1+a2;
		//Convierte resultado de la operacion en String
	String Result=Integer.toString(c,2);
	return Result; 
	}
	
	static String Decbin (int num5,int y5){//decimal binario
		int x5;
		int resto5;
		String acu5 = "",auxs5="";
		int con5=0;
		int cont5=0;
		int aux5[]=new int [30];
		while (num5!=0){
			x5=(int) (num5/y5);
			resto5=(int) (num5%y5);
			num5=x5;
			//System.out.println(resto+"resto");
			aux5[con5]=resto5;
			con5++;
			cont5++;
			//System.out.println(con+"contador");
		
	}for(int i5 =0;i5<cont5;i5++){
		auxs5=Integer.toString(aux5[con5-1]);
		//System.out.print(auxs+"");
		acu5=acu5+auxs5;
		//System.out.println(acu+"acumulador");
		con5--;
	}
		return acu5;
	}
	
	static int Bindec(int x5,int y5){//binario decimal
		int sumatoria5 = 0;
		int aux5;
		double cifras5;
		int cifras25;
		int cont=Float.toString(x5).length();
		
		for(int i5=0;i5<cont-1;i5++){
			cifras5= (x5*0.1);
			cifras25=(int) (x5*0.1);
			x5=cifras25;
			cifras25=(int) ((cifras5-cifras25)/0.1);
			//System.out.println(cifras2+"cifras");
			aux5=(int) (cifras25*Math.pow(y5, i5));
			//System.out.println(y+"~~");
			sumatoria5=sumatoria5+aux5;
			//System.out.println(sumatoria+"--"+i);
		}
		return sumatoria5;
	}
	
static int DecTodas (int num5,int y5){
	int x5;
	int resto5;
	int acu5 = 0;
	int con5=0;
	int cont5=Float.toString(num5).length();
	int aux5[]=new int [cont5];
	while (num5!=0){
		x5=(int) (num5/y5);
		resto5=(int) (num5%y5);
		num5=x5;
		//System.out.println(resto+"--");
		aux5[con5]=resto5;
		con5++;
		cont5++;
		//System.out.println(con);
	
}while(con5>=0){
	x5=aux5[con5];
	acu5=acu5+x5;
	acu5=acu5*10;
	//System.out.print(x+"");
	con5--;
}acu5=acu5/10;
	return acu5;
}
static int TodoDec(int x5,int y5){//funciona con binario
	int sumatoria5 = 0;
	int aux5;
	double cifras5;
	int cifras25;
	int cont5=Float.toString(x5).length();
	
	for(int i5=0;i5<cont5-1;i5++){
		cifras5= (x5*0.1);
		cifras25=(int) (x5*0.1);
		x5=cifras25;
		cifras25=(int) ((cifras5-cifras25)/0.1);
		//System.out.println(cifras2+"cifras");
		aux5=(int) (cifras25*Math.pow(y5, i5));
		//System.out.println(y+"~~");
		sumatoria5=sumatoria5+aux5;
		//System.out.println(sumatoria+"--"+i);
	}
	return sumatoria5;
}
static int AlfaDec(String numero5,int base5){
	int aux25 = 0;
	double sumatoria5=0;
	char aux35;
	String aux45 ="",aux55="";
		int cont5=numero5.length();
		for(int j5=cont5-1;j5>=0;j5--){
			aux55=aux55+numero5.charAt(j5);
		}
		for(int i5=0;i5<cont5;i5++){
			aux35=aux55.charAt(i5);
			aux45=Character.toString(aux35);		
			switch (aux45){
			case "A":
				aux25=10;
				break;
			case "B": 
				aux25=11;
				break;
			case "C":
				aux25=12;
				break;
			case "D":
				aux25=13;
				break;
			case "E":
				aux25=14;
				break;
			case "F":
				aux25=15;
				break;
			default: aux25=Integer.parseInt(aux45);
				
			}double pot5=Math.pow(16, i5);    //base
			double sumat = aux25*pot5;
			sumatoria5=sumatoria5+sumat;
			}
		return (int) sumatoria5;
	
}
static String decalfa(int ini5,int abase5){
	int x5;
	int resto5;
	int con5=0;
	String resp5 = "",acu5="";
	int cont5=Float.toString(ini5).length();
	int aux5[]=new int [cont5];
	cont5=0;
	while (ini5!=0){
		x5=(int) (ini5/abase5);
		resto5=(int) (ini5%abase5);
		ini5=x5;
		aux5[cont5]=resto5;
		cont5++;
		cont5++;
		//System.out.println(cont);
}
	while(cont5>=0){
		//System.out.println(con+"||");
		x5=aux5[cont5];
		String resp;
		switch (x5){
		case 10:
			resp="A";
			break;
		case 11:
			resp="B";
			break;
		case 12:
			resp="C";
			break;
		case 13:
			resp="D";
			break;
		case 14:
			resp="E";
			break;
		case 15:
			resp="F";
			break;
		default : 
			resp=Integer.toString(x5);
			acu5=acu5+resp;
		}
		//System.out.print(resp);
		cont5--;
	}
	return acu5;
}
	public static int Valorletra(String aux){
		int val = 0;
		switch (aux){
		case "A":val=1;
		break;
		case "B":val=2;
		break;
		case"C":val=3;
		break;
		case"D":val=4;
		break;
		case"E":val=5;
		break;
		case"F":val=6;
		break;
		case"G":val=7;
		break;
		case"H":val=8;
		break;
		case"I":val=9;
		break;
		case"J":val=10;
		break;
		case"K":val=11;
		break;
		case "L":val=12;
		break;
		case"M": val=13;
		break;
		case "N":val=14;
		break;
		case "Ñ":val=15;
		break;
		case "O":val=16;
		break;
		case"P":val=17;
		break;
		case"Q": val=18;
		break;
		case"R":val=19;
		break;
		case"S":val=20;
		break;
		case"T":val=21;
		break;
		case"U":val=22;
		break;
		case"V":val=23;
		break;
		case"W":val=24;
		break;
		case"X":val=25;
		break;
		case"Y":val=26;
		break;
		case"Z":val=27;
		break;
		default:System.out.println("no existe"); 
		break;
		}
		return val;
	}
	public static String NumLetra(int val){
		String aux = null;
		switch (val){
		case 1:aux="A";
		break;
		case 2:aux="B";
		break;
		case 3:aux="C";
		break;
		case 4:aux="D";
		break;
		case 5:aux="E";
		break;
		case 6:aux="F";
		break;
		case 7:aux="G";
		break;
		case 8:aux="H";
		break;
		case 9:aux="I";
		break;
		case 10:aux="J";
		break;
		case 11:aux="K"; 
		break;
		case 12:aux="L";
		break;
		case 13:aux="M";
		break;
		case 14:aux="N";
		break;
		case 15:aux="Ñ";
		break;
		case 16:aux="O";
		break;
		case 17:aux="P";
		break;
		case 18:aux="Q";
		break;
		case 19:aux="R";
		break;
		case 20:aux="S";
		break;
		case 21:aux="T";
		break;
		case 22:aux="U";
		break;
		case 23:aux="V";
		break;
		case 24:aux="W";
		break;
		case 25:aux="X";
		break;
		case 26:aux="Y";
		break;
		case 27:aux="Z";
		break;
		default:System.out.println("no existe");
		break;
		}
		return aux;
	
}
}// class
