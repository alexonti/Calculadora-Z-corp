package menuterminal;
import java.util.*;
import java.math.*;
public class MenuTerminalIf {

	public static void main(String[] args) {
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
     int opcion2;// menu operaciones matem�ticas
     int opcion3;// menu multiplicacion
     int opcion4;
     int opcion5;
  
     
    // System.out.println("Calculadora Z-Corp \n\n");
    // System.out.println("Bienvenido \n\n");
    // System.out.println("Selecciona una opci�n \n");
     

     while (!salir) {

         System.out.println(yelli+"1. Operaciones matem�ticas");
         System.out.println("2. Operaciones binarias");
         System.out.println("3. Orden de datos");
         System.out.println("4. Promedios");
         System.out.println("5. Acerca");// muestra informaci�n acerca de quien realizo el trabajo y email de contacto.
         System.out.println("6. Salir \n"+reset);
         
         

         try {
         	
             System.out.println(encircled+yellow+"Ingrese una opci�n:\n"+reset);
             opcion = sn.nextInt();
             System.out.println();
//menu general de la calculadora
             
             switch (opcion) {
                 case 1:
                     System.out.println(purplel+"Has seleccionado Operaciones matem�ticas \n"+reset);
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
                     
                     
     	        	regresar = true; //opci�n que nos devuelve al menu anterior
     	            
     	          
                     break;
                 case 6:
                 	
                 	     
                 	System.out.println(yellow+"\n ******    Programa terminado    ******"+reset);
                 	            	
                     salir = true;
                     System.exit(opcion); //Termina el programa
                     break;
                 default:
                     System.out.println(red+"\nSeleccione una opci�n entre 1 y 6 \n"+reset);
                    
             } //switch menu principal
             	} //try menu principal
            
          catch (InputMismatchException e) {
             System.out.println(cyan+"* * * Debes insertar un n�mero* * * \n"+reset);
             sn.next();
             
         } // catch menu principal
    
        
     
         
         if(opcion==1) {
         	
         	System.out.println(encircled+yellow+"Seleccione una opci�n");
         	System.out.println();
         	
         	System.out.println(yelli+"1. Suma");
         	System.out.println("2. Resta");
         	System.out.println("3. Multiplicaci�n");
         	System.out.println("4. Divisi�n");
         	System.out.println("5. Regresar \n"+reset);
         	try {
         		
         	    System.out.println(encircled+yellow+"Ingrese una opci�n \n"+reset);
         	    opcion2 = sn.nextInt();
         	    System.out.println();
         	    switch (opcion2) {
         	        case 1:
         	            System.out.println(purplel+"Has seleccionado Suma \n"+reset);
         	            double x = 0;           // Se declara variable Double x, donde se guardara conversion de string a Double primer termino de la suma
         	            double y = 0;           // Se declara variable Double y, donde se guardara conversion de string a Double segundo termino de la suma
         	            Scanner teclado=new Scanner(System.in); // Se crea variable teclado que permite capturar lo que se ingresa por teclado
         	            int i=0;
         	            int j=0;
         	            double total;
         	            
         	            
         	            
         	            while(i<1){                                 // primer while para volver a solicitar numero
         	                System.out.print(yelli+"ingrese a: "+reset);         
         	                
         	                try{                                    // primer try para validar primer numero
         	                    x=teclado.nextDouble();             // se puede traspasar directamente a double lo ingresado por teclado
         	                    i++;                                // incremento para salir del while
         	                }catch(Exception e){
         	                    teclado.next();
         	                    System.out.println(red+"error"+reset);
         	            }
         	            }
         	            
         	            while(j<1){                                 // segundo while para volver a solicitar numero
         	                System.out.print(yelli+"ingrese b: "+reset);        
         	                
         	                try{                                    // segundo try para validar primer numero
         	                    y=teclado.nextDouble();                
         	                    j++; 
         	                }catch(Exception e){
         	                    teclado.next();
         	                    System.out.println(red+ "error"+reset);
         	            }
         	            }
         	            total=Sumar(x, y);                          // se guarda resultado de funcion para codigo de abajo
         	            BigDecimal bigDecimal = new BigDecimal(total).setScale(2, RoundingMode.HALF_UP); //Codigo para aprox. resultado double
         	            System.out.println();
         	            System.out.println();
         	            System.out.println(purplel+"******************************"+reset);
         	            System.out.println(lightgreen+"      La suma es: "+bigDecimal.doubleValue()+reset); // Se completa el codigo anterior para mostrar resultado aprox.        
         	            System.out.println(purplel+"******************************"+reset);
         	            System.out.println();
         	            System.out.println();
         	            System.out.println();
         	            System.out.println();
         	            System.out.println();
         	            System.out.println(yellow+"Seleccione una opci�n"+reset);
         	            System.out.println();
         	           
         	            
         	       
         	            break;
         	            
         	        case 2:
         	            System.out.println(purplel+"Has seleccionado Resta \n"+reset);
         	            double x1 = 0;           // Se declara variable Double x, donde se guardara
         	            double y1 = 0;           // Se declara variable Double y, donde se guardara
         	            Scanner teclado2=new Scanner(System.in); // Se crea variable teclado que permite capturar lo que se ingresa por teclado
         	            int i1=0;
         	            int j1=0;
         	            double resultado;
         	            
         	            while(i1<1){                                 // primer while para volver a solicitar numero
         	                System.out.print(yelli+"ingrese a: "+reset);         
         	                
         	                try{                                    // primer try para validar primer numero
         	                    x1=teclado2.nextDouble();             // se puede traspasar directamente a double lo ingresado por teclado
         	                    i1++;                                // incremento para salir del while
         	                }catch(Exception e){
         	                    teclado2.next();
         	                    System.out.println(red+"error"+reset);
         	            }
         	            }
         	            
         	            while(j1<1){                                 // segundo while para volver a solicitar numero
         	                System.out.print(yelli+"ingrese b: "+reset);        
         	                
         	                try{                                    // segundo try para validar primer numero
         	                    y1=teclado2.nextDouble();                
         	                    j1++; 
         	                }catch(Exception e){
         	                    teclado2.next();
         	                    System.out.println(red+ "error"+reset);
         	            }
         	            }
         	            resultado=Restar(x1, y1);                          // se guarda resultado de funcion para codigo de abajo
         	            BigDecimal bigDecimal1 = new BigDecimal(resultado).setScale(2, RoundingMode.HALF_UP); //Codigo para aprox. resultado double
         	            	System.out.println();
         	    System.out.println(purplel+"***********************************************************"+reset);
         	    System.out.println(lightgreen+"La diferencia es: "+bigDecimal1.doubleValue()+reset); // Se completa el codigo anterior para mostrar resultado aprox.        
 	            System.out.println(purplel+"***********************************************************"+reset);
 	            System.out.println();
 	            System.out.println();
 	            System.out.println();
 	            System.out.println();
 	            System.out.println();
 	            System.out.println();
 	            System.out.println(yellow+"Seleccione una opci�n"+reset);
 	            System.out.println();
         	            break;
         	            
         	        case 3:
         	            System.out.println(purplel+"Has seleccionado Multiplicaci�n \n"+reset);
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
         	                System.out.print(yelli+"ingrese a: ");         
         	                
         	                try{                                    // primer try para validar primer numero
         	                    x2=teclado3.nextDouble();             // se puede traspasar directamente a double lo ingresado por teclado
         	                    i2++;                                // incremento para salir del while
         	                }catch(Exception e){
         	                    teclado3.next();
         	                    System.out.println(red+ "error");
         	            }
         	            }
         	            
         	            while(j2<1){                                 // segundo while para volver a solicitar numero
         	                System.out.print(yelli+"ingrese b: ");        
         	                
         	                try{                                    // segundo try para validar primer numero
         	                    y2=teclado3.nextDouble();                
         	                    j2++; 
         	                }catch(Exception e){
         	                    teclado3.next();
         	                    System.out.println(red+ "error");
         	            }
         	            }
         	            
				    
         	            xMult=x2;
         	            yMult=y2;
         	            
         	            res1=Multiplicar1(xMult, yMult);
         	           res2=res1/100;
         	            
         	            BigDecimal resAprox = new BigDecimal(res1).setScale(2, RoundingMode.HALF_UP); //Codigo para aprox. resultado double
         	            System.out.println();
                 	    System.out.println(purplel+"***********************************************************"+reset);
         	            System.out.println(lightgreen+"El producto es: "+resAprox.doubleValue()); // Se completa el codigo anterior para mostrar resultado aprox.        
                 	    System.out.println(purplel+"***********************************************************"+reset);
         	            System.out.println();
         	            System.out.println();
         	            System.out.println();
         	            System.out.println();
         	            System.out.println();
         	            System.out.println();
         	            System.out.println(yellow+"Seleccione una opci�n"+reset);
         	            System.out.println();
    
         	            break;
         	        case 4:
         	            System.out.println(purplel+"Has seleccionado Divisi�n \n"+reset);
         	            Scanner teclado4=new Scanner(System.in); // Se crea variable teclado que permite capturar lo que se ingresa por teclado
         	            double x3 = 0;           // Se declara variable Double x, donde se guardara conversion de string a Double primer termino de la suma
         	            double y3 = 0;           // Se declara variable Double y, donde se guardara conversion de string a Double segundo termino de la suma
         	            int i3=0;
         	            int j3=0;
         	            double xMult2 = 0;
         	            double yMult2 = 0;
         	            double res3;
         	            double res4;
         	            
         	            
         	            while(i3<1){                                 // primer while para volver a solicitar numero
         	                System.out.print(yelli+"ingrese a: ");         
         	                
         	                try{                                    // primer try para validar primer numero
         	                    x3=teclado4.nextDouble();             // se puede traspasar directamente a double lo ingresado por teclado
         	                    i3++;                                // incremento para salir del while
         	                }catch(Exception e){
         	                    teclado4.next();
         	                    System.out.println( red+"error");
         	            }
         	            }
         	            
         	            while(j3<1){                                 // segundo while para volver a solicitar numero
         	                System.out.print(yelli+"ingrese b: ");        
         	                
         	                try{                                    // segundo try para validar primer numero
         	                    y3=teclado4.nextDouble();                
         	                    j3++; 
         	                }catch(Exception e){
         	                    teclado4.next();
         	                    System.out.println( red+"error"+reset);
         	            }
         	            }
         	            
				    
         	            xMult2=(double)x3*10;
         	            yMult2=(double)y3*10;
         	            
         	            res1=division(xMult2, yMult2);
         	          //  res2=res1/100;
         	            
         	            BigDecimal resAprox1 = new BigDecimal(res1).setScale(2, RoundingMode.HALF_UP); //Codigo para aprox. resultado double
         	            System.out.println();
                 	    System.out.println(purplel+"***********************************************************"+reset);
         	            System.out.println(lightgreen+"El resultado es: "+resAprox1.doubleValue()+reset); // Se completa el codigo anterior para mostrar resultado aprox.        
                 	    System.out.println(purplel+"***********************************************************"+reset);
         	            System.out.println();
         	            System.out.println();
         	            System.out.println();
         	            System.out.println();
         	            System.out.println();
         	            System.out.println();
         	            System.out.println(yellow+"Seleccione una opci�n"+reset);
         	            System.out.println();
         	            break;
         	        case 5://la funcion de division esta abajo 
         	        	System.out.println(yellow+"\n Ingrese una opci�n \n"+reset);
         	        	regresar = true; //opci�n que nos devuelve al menu anterior
         	            
         	            break;
         	        default:
         	            System.out.println(red+"\nSeleccione una opci�n entre 1 y 5 \n"+reset);
         	    
         	    } //switch operaciones matematicas
         	}//try menu principal
         	catch (InputMismatchException e) {
         	    System.out.println(red+"Debes insertar un n�mero"+reset);
         	    sn.next();
         	    
         	}
         } //if operaciones matematicas
     
         if (opcion==2) {
         	
         	System.out.println(yellow+"Seleccione una opci�n"+reset);
         	System.out.println();
         	System.out.println(yelli+"1. Suma binaria");
             System.out.println("2. Suma hexadecimal");
             System.out.println("3. Cambio de base");
             System.out.println("4. Regresar"+reset);
      
             try {
             	
                 System.out.println(yellow+"Ingrese una opci�n \n"+reset);
                 opcion3 = sn.nextInt();
                 switch (opcion3) {
                     case 1:
                         System.out.println(purplel+"Has seleccionado Suma binaria \n"+reset);
                         
                         Scanner Entrada=new Scanner(System.in);
                         String n1="",n2="";
                         	//Se pide 1er numero binario
                         System.out.print(yelli+"Ingrese 1� numero ");
                         n1=Entrada.next();
                         	//Se pide 2do numero binario
                         System.out.print("Ingrese 2� numero "+reset);
                         n2=Entrada.next();
                         System.out.println();
                  	    System.out.println(purplel+"***********************************************************"+reset);
                         System.out.print(lightgreen+"Su resultado de la suma binaria es "+Suma(n1,n2)+reset);
                  	    System.out.println(purplel+"***********************************************************"+reset);
         	            System.out.println();
         	            System.out.println();
         	            System.out.println();
         	            System.out.println();
         	            System.out.println();
         	            System.out.println();
         	            System.out.println(yellow+"Seleccione una opci�n"+reset);
         	            System.out.println();
            
                         break;
                         
                     case 2:
                         System.out.println(purplel+"Has seleccionado Suma hexadecimal \n"+reset);
                         
                         break;
                     case 3:
                         System.out.println(purplel+"Has seleccionado Cambio de base \n"+reset);
                         
                         Scanner sc=new Scanner (System.in);
                 		System.out.println(yelli+"Ingrese el numero a transformar");
                 		String valor5="";
                 		valor5=sc.nextLine();
                 		System.out.println("Ingrese el numero de la base a transformar");
                 		int x5=0;
                 		x5=sc.nextInt();
                 		int num5 = 0;
                 		System.out.println("Ingrese el numero de la base a la que desea transformar(hasta base 16)"+reset);
                 		int y5=0;
                 		y5=sc.nextInt();
                 		
                 		try{num5=Integer.parseInt(valor5);}
                 		catch (NumberFormatException ex){
                 			if(y5==2){
                 				int resp=AlfaDec(valor5,10);
                 				String respuesta=Decbin(resp,2);
                 				System.out.println();
                 	            System.out.println();
                         	    System.out.println(purplel+"***********************************************************"+reset);
                 	            System.out.println(lightgreen+"      El nuevo n�mero transformado es: "+ respuesta+reset); // Se completa el codigo anterior para mostrar resultado aprox.        
                         	    System.out.println(purplel+"***********************************************************"+reset);
                 	            System.out.println();
                 	            System.out.println();
                 	            System.out.println();
                 	            System.out.println();
                 	            System.out.println();
                 	            System.out.println(yellow+"Seleccione una opci�n"+reset);
                 	            System.out.println();
                 				break;
                 			}
                 			if(y5==10){
                 				int respuesta=AlfaDec(valor5,y5);
                 				System.out.println();
                 	            System.out.println();
                         	    System.out.println(purplel+"***********************************************************"+reset);
                 	            System.out.println(lightgreen+"      El nuevo n�mero transformado es: "+ respuesta+reset); // Se completa el codigo anterior para mostrar resultado aprox.        
                         	    System.out.println(purplel+"***********************************************************"+reset);
                 	            System.out.println();
                 	            System.out.println();
                 	            System.out.println();
                 	            System.out.println();
                 	            System.out.println();
                 	            System.out.println(yellow+"Seleccione una opci�n"+reset);
                 	            System.out.println();
                 				break;
                 			}if(y5<10){
                 				int res=AlfaDec(valor5,10);
                 				int respuesta=DecTodas(res,y5);
                 				System.out.println();
                 	            System.out.println();
                         	    System.out.println(purplel+"***********************************************************"+reset);
                 	            System.out.println(lightgreen+"      El nuevo n�mero transformado es: "+ respuesta+reset); // Se completa el codigo anterior para mostrar resultado aprox.        
                         	    System.out.println(purplel+"***********************************************************"+reset);
                 	            System.out.println();
                 	            System.out.println();
                 	            System.out.println();
                 	            System.out.println();
                 	            System.out.println();
                 	            System.out.println(yellow+"Seleccione una opci�n"+reset);
                 	            System.out.println();
                 				break;
                 			}if (y5>10 && y5<=16){
                 				int res=AlfaDec(valor5,10);
                 				String respuesta=decalfa(res,y5);
                 				System.out.println();
                 	            System.out.println();
                         	    System.out.println(purplel+"***********************************************************"+reset);
                 	            System.out.println(lightgreen+"      El nuevo n�mero transformado es: "+ respuesta+reset); // Se completa el codigo anterior para mostrar resultado aprox.        
                         	    System.out.println(purplel+"***********************************************************"+reset);
                 	            System.out.println();
                 	            System.out.println();
                 	            System.out.println();
                 	            System.out.println();
                 	            System.out.println();
                 	            System.out.println(yellow+"Seleccione una opci�n"+reset);
                 	            System.out.println();
                 				break;
                 			}else{System.out.println();
             	            System.out.println();
                     	    System.out.println(purplel+"***********************************************************"+reset);
             	            System.out.println(lightgreen+"            La base no es v�lida"); // Se completa el codigo anterior para mostrar resultado aprox.        
                     	    System.out.println(purplel+"***********************************************************"+reset);
             	            System.out.println();}
                 		}
                 		if(x5==10){
                 			if(y5==2){
                 				String respuesta=Decbin(num5,y5);
                 				System.out.println();
                 	            System.out.println();
                         	    System.out.println(purplel+"***********************************************************"+reset);
                 	            System.out.println(lightgreen+"      El nuevo n�mero transformado es: "+ respuesta+reset); // Se completa el codigo anterior para mostrar resultado aprox.        
                         	    System.out.println(purplel+"***********************************************************"+reset);
                 	            System.out.println();
                 	            System.out.println();
                 	            System.out.println();
                 	            System.out.println();
                 	            System.out.println();
                 	            System.out.println(yellow+"Seleccione una opci�n"+reset);
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
                         	    System.out.println(purplel+"***********************************************************"+reset);
                 	            System.out.println(lightgreen+"      El nuevo n�mero transformado es: "+ respuesta+reset); // Se completa el codigo anterior para mostrar resultado aprox.        
                         	    System.out.println(purplel+"***********************************************************"+reset);
                 	            System.out.println();
                 	            System.out.println();
                 	            System.out.println();
                 	            System.out.println();
                 	            System.out.println();
                 	            System.out.println(yellow+"Seleccione una opci�n"+reset);
                 	            System.out.println();
                 				break;
                 			}if (y5>10 && y5<=16){
                 				String respuesta=decalfa(num5,y5);
                 				System.out.println();
                 	            System.out.println();
                         	    System.out.println(purplel+"***********************************************************"+reset);
                 	            System.out.println(lightgreen+"      El nuevo n�mero transformado es: "+ respuesta+reset); // Se completa el codigo anterior para mostrar resultado aprox.        
                         	    System.out.println(purplel+"***********************************************************"+reset);
                 	            System.out.println();
                 	            System.out.println();
                 	            System.out.println();
                 	            System.out.println();
                 	            System.out.println();
                 	            System.out.println(yellow+"Seleccione una opci�n"+reset);
                 	            System.out.println();
                 				break;
                 			}
                 			else{
                 				System.out.println();
                 	            System.out.println();
                         	    System.out.println(purplel+"***********************************************************"+reset);
                 	            System.out.println(lightgreen+"          La base no es v�lida"+reset); // Se completa el codigo anterior para mostrar resultado aprox.        
                         	    System.out.println(purplel+"***********************************************************"+reset);
                 	            System.out.println();}
                 			
                 		}if (x5<10 && x5>2){
                 			if (y5==2){
                 				int res=TodoDec(num5,x5);
                 				String respuesta=Decbin(res,2);
                 				System.out.println();
                 	            System.out.println();
                         	    System.out.println(purplel+"***********************************************************"+reset);
                 	            System.out.println(lightgreen+"      El nuevo n�mero transformado es: "+ respuesta); // Se completa el codigo anterior para mostrar resultado aprox.        
                         	    System.out.println(purplel+"***********************************************************"+reset);
                 	            System.out.println();
                 	            System.out.println();
                 	            System.out.println();
                 	            System.out.println();
                 	            System.out.println();
                 	            System.out.println(yellow+"Seleccione una opci�n"+reset);
                 	            System.out.println();
                 				break;
                 			}
                 			if(y5==10){
                 				int respuesta=TodoDec(num5,x5);
                 				System.out.println();
                 	            System.out.println();
                         	    System.out.println(purplel+"***********************************************************"+reset);
                 	            System.out.println(lightgreen+"      El nuevo n�mero transformado es: "+ respuesta+reset); // Se completa el codigo anterior para mostrar resultado aprox.        
                         	    System.out.println(purplel+"***********************************************************"+reset);
                 	            System.out.println();
                 	            System.out.println();
                 	            System.out.println();
                 	            System.out.println();
                 	            System.out.println();
                 	            System.out.println(yellow+"Seleccione una opci�n"+reset);
                 	            System.out.println();
                 				break;
                 			}if (y5<10){
                 				int res=TodoDec(num5,x5);
                 				//System.out.println(res);
                 				int respuesta=DecTodas(res,y5);
                 				System.out.println();
                 	            System.out.println();
                         	    System.out.println(purplel+"***********************************************************"+reset);
                 	            System.out.println(lightgreen+"      El nuevo n�mero transformado es: "+ respuesta+reset); // Se completa el codigo anterior para mostrar resultado aprox.        
                         	    System.out.println(purplel+"***********************************************************"+reset);
                 	            System.out.println();
                 	            System.out.println();
                 	            System.out.println();
                 	            System.out.println();
                 	            System.out.println();
                 	            System.out.println(yellow+"Seleccione una opci�n"+reset);
                 	            System.out.println();
                 				break;
                 			}if (y5>10 && y5<=16){
                 				int res=TodoDec(num5,x5);
                 				String respuesta=decalfa(res,y5);
                 				System.out.println();
                 	            System.out.println();
                         	    System.out.println(purplel+"***********************************************************"+reset);
                 	            System.out.println(lightgreen+"      El nuevo n�mero transformado es: "+ respuesta); // Se completa el codigo anterior para mostrar resultado aprox.        
                         	    System.out.println(purplel+"***********************************************************"+reset);
                 	            System.out.println();
                 	            System.out.println();
                 	            System.out.println();
                 	            System.out.println();
                 	            System.out.println();
                 	            System.out.println(yellow+"Seleccione una opci�n"+reset);
                 	            System.out.println();
                 				break;
                 			}
                 			else{System.out.println();
             	            System.out.println();
                     	    System.out.println(purplel+"***********************************************************"+reset);
             	            System.out.println(lightgreen+"             La base no es v�lida"+reset); // Se completa el codigo anterior para mostrar resultado aprox.        
                     	    System.out.println(purplel+"***********************************************************"+reset);
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
                     	    System.out.println(purplel+"***********************************************************"+reset);
             	            System.out.println(lightgreen+"      El nuevo n�mero transformado es: "+ respuesta+reset); // Se completa el codigo anterior para mostrar resultado aprox.        
                     	    System.out.println(purplel+"***********************************************************"+reset);
             	            System.out.println();
             	            System.out.println();
             	            System.out.println();
             	            System.out.println();
             	            System.out.println();
             	            System.out.println(yellow+"Seleccione una opci�n"+reset);
             	            System.out.println();
                 			}
                 			if(y5<10){
                 				int res=Bindec(num5,2);
                 				int respuesta=DecTodas(res,y5);
                 				System.out.println();
                 	            System.out.println();
                         	    System.out.println(purplel+"***********************************************************"+reset);
                 	            System.out.println(lightgreen+"      El nuevo n�mero transformado es: "+ respuesta+reset); // Se completa el codigo anterior para mostrar resultado aprox.        
                         	    System.out.println(purplel+"***********************************************************"+reset);
                 	            System.out.println();
                 	            System.out.println();
                 	            System.out.println();
                 	            System.out.println();
                 	            System.out.println();
                 	            System.out.println(yellow+"Seleccione una opci�n"+reset);
                 	            System.out.println();
                 			}
                 			if(y5>10){
                 				int res=Bindec(num5,2);
                 				System.out.println(res);
                 				String respuesta=decalfa(res,y5);
                 				System.out.println();
                 	            System.out.println();
                         	    System.out.println(purplel+"***********************************************************"+reset);
                 	            System.out.println(lightgreen+"      El nuevo n�mero transformado es: "+ respuesta+reset); // Se completa el codigo anterior para mostrar resultado aprox.        
                         	    System.out.println(purplel+"***********************************************************"+reset);
                 	            System.out.println();
                 	            System.out.println();
                 	            System.out.println();
                 	            System.out.println();
                 	            System.out.println();
                 	            System.out.println(yellow+"Seleccione una opci�n"+reset);
                 	            System.out.println();
                 			}
                 		}if(x5>10){
                 			if(y5==2){
                 				int resp=AlfaDec(valor5,10);
                 				String respuesta=Decbin(resp,2);
                 				System.out.println();
                 	            System.out.println();
                         	    System.out.println(purplel+"***********************************************************"+reset);
                 	            System.out.println(lightgreen+"      El nuevo n�mero transformado es: "+ respuesta+reset); // Se completa el codigo anterior para mostrar resultado aprox.        
                         	    System.out.println(purplel+"***********************************************************"+reset);
                 	            System.out.println();
                 	            System.out.println();
                 	            System.out.println();
                 	            System.out.println();
                 	            System.out.println();
                 	            System.out.println(yellow+"Seleccione una opci�n"+reset);
                 	            System.out.println();
                 				break;
                 			}
                 			if(y5==10){
                 				int respuesta=AlfaDec(valor5,y5);
                 				System.out.println();
                 	            System.out.println();
                         	    System.out.println(purplel+"***********************************************************"+reset);
                 	            System.out.println(lightgreen+"      El nuevo n�mero transformado es: "+ respuesta+reset); // Se completa el codigo anterior para mostrar resultado aprox.        
                         	    System.out.println(purplel+"***********************************************************"+reset);
                 	            System.out.println();
                 	            System.out.println();
                 	            System.out.println();
                 	            System.out.println();
                 	            System.out.println();
                 	            System.out.println(yellow+"Seleccione una opci�n"+reset);
                 	            System.out.println();
                 				break;
                 			}if(y5<10){
                 				int res=AlfaDec(valor5,10);
                 				//System.out.println(res);
                 				int respuesta=DecTodas(res,y5);
                 				System.out.println();
                 	            System.out.println();
                         	    System.out.println(purplel+"***********************************************************"+reset);
                 	            System.out.println(lightgreen+"      El nuevo n�mero transformado es: "+ respuesta+reset); // Se completa el codigo anterior para mostrar resultado aprox.        
                         	    System.out.println(purplel+"***********************************************************"+reset);
                 	            System.out.println();
                 	            System.out.println();
                 	            System.out.println();
                 	            System.out.println();
                 	            System.out.println();
                 	            System.out.println(yellow+"Seleccione una opci�n"+reset);
                 	            System.out.println();
                 				break;
                 			}if (y5>10 && y5<=16){
                 				int res=AlfaDec(valor5,10);
                 				String respuesta=decalfa(res,y5);
                 				System.out.println();
                 	            System.out.println();
                         	    System.out.println(purplel+"***********************************************************"+reset);
                 	            System.out.println(lightgreen+"      El nuevo n�mero transformado es: "+ respuesta+reset); // Se completa el codigo anterior para mostrar resultado aprox.        
                         	    System.out.println(purplel+"***********************************************************"+reset);
                 	            System.out.println();
                 	            System.out.println();
                 	            System.out.println();
                 	            System.out.println();
                 	            System.out.println();
                 	            System.out.println(yellow+"Seleccione una opci�n"+reset);
                 	            System.out.println();
                 				break;
                 }
                 			else{
                 				System.out.println();
                 	            System.out.println();
                         	    System.out.println(purplel+"***********************************************************"+reset);
                 	            System.out.println(lightgreen+"           La base no es v�lida"+reset); // Se completa el codigo anterior para mostrar resultado aprox.        
                         	    System.out.println(purplel+"***********************************************************"+reset);
                 	            System.out.println();
                 			
                         break;}}
                         
                     
                     case 4:
                     	System.out.println(yellow+"\n Ingrese una opci�n \n"+reset);
                         regresar = true;
                         break;
                     default:
                         System.out.println(yellow+"\nSeleccione una opci�n entre 1 y 5 \n"+reset);
                 }
             } 
         
         catch (InputMismatchException e) {
                 System.out.println(red+"Debes insertar un n�mero"+reset);
                 sn.next();
                 
             }
         	
         	
         	
         	
         } //if operaciones binarias
         
         if(opcion==3) {
         	
         	System.out.println(yellow+"Seleccione una opci�n"+reset);
         	System.out.println();
         	
         	System.out.println(yelli+"1. Continuar"+reset);
             System.out.println(yelli+"2. Regresar \n"+reset);
            
             
      
             try {
             	
                 System.out.println(yellow+"Ingrese una opci�n \n"+reset);
                 opcion3 = sn.nextInt();
                 switch (opcion3) {
                     case 1:
                         System.out.println();
                    
                     		Scanner sc=new Scanner (System.in);
                     		int con = 0;
                     		int a = 0;
                     		String auxi;
                     		int aux2 = 0;
                     		String ent1;
                     		System.out.println(yellow+"�Qu� tipo de datos deseas ordenar? \n"+reset);
                     		System.out.println(yelli+"0 - Letras");
                     		System.out.println("1 - N�meros \n"+reset);
                     		int preg=sc.nextInt();
                     		sc.nextLine();
                     		System.out.println(yelli+"Ingrese la cantidad de elementos a ordenar \n"+reset);
                     		int sec=sc.nextInt();
                     		sc.nextLine();
                     		System.out.println();
                     		if (preg==0){
                     			System.out.println(yelli+"Ingrese letras a ordenar \n"+reset);
                     			int orden[]=new int[sec];
                     			String letras[]=new String [sec];
                     		    while(con<sec){
                     		       ent1=sc.nextLine();
                     		      // if(ent1=="-1"){
                     			   //   System.out.println("Usted a dejado de ingresar datos");
                     			     // con=-1;
                     		     //  }else{
                     		          try{
                     		        	  a=Integer.parseInt(ent1);
                     		        	  System.out.println(yelli+"Ingresa letras \n"+reset);
                     		        	  }
                     		          catch (NumberFormatException ex){
                     			      String aux=ent1.toUpperCase();
                     			      //System.out.println(aux);
                     			      a=Valorletra(aux);
                     //System.out.println(con+"--0");
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
                     		    	//System.out.println(auxi);
                     		    	letras [i]=auxi;
                     		    }
                     		    System.out.println();
                         	    System.out.println(purplel+"***********************************************************"+reset);
                   			  	System.out.println(lightgreen+"El orden de los datos ingresados es: ");
                     		    System.out.println(Arrays.toString(letras)+reset);
                         	    System.out.println(purplel+"***********************************************************"+reset);
                     		    System.out.println("Ingrese una opci�n: \n");
                     		   
                     		}else{
                     			int orden[]=new int[sec];
                     			System.out.println(yelli+"Ingrese los n�meros a ordenar \n"+reset);
                     			  while(con<sec){
                     			       ent1=sc.nextLine();
                     			       //if(ent1=="-1"){
                     				     // System.out.println("Usted a dejado de ingresar datos");
                     				     // con=-1;
                     			  //     }
                     			 // else{
                     			          try{a=Integer.parseInt(ent1);}
                     			          catch (NumberFormatException ex){
                     			        	  System.out.println(red+"Favor de ingresar solo datos num�ricos \n"+reset);
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
                     		    }
                           	    System.out.println(purplel+"***********************************************************"+reset);
                     			  System.out.println(lightgreen+"El orden de los datos ingresados es: ");
                     			  System.out.println();
                     			  System.out.println(Arrays.toString(orden)+reset);
                     			  System.out.println();
                           	    System.out.println(purplel+"***********************************************************"+reset);
                         break;
                         }
                         
                    
                     
                     case 2:
                         regresar = true;
                         break;
                     default:
                         System.out.println(yellow+"\nSeleccione una opci�n entre 1 y 3 \n"+reset);
                 }
             } catch (InputMismatchException e) {
                 System.out.println(red+"Debes insertar un n�mero"+reset);
                 sn.next();
                 
             }
         } // if menu orden de datos
         
         if(opcion==4) {
         	
         	System.out.println(yellow+"Seleccione una opci�n"+reset);
         	System.out.println();
         	
         	System.out.println(yelli+"1. Continuar");
             System.out.println("2. Regresar \n" +reset);
            
             
      
             try {
             	
                 System.out.println(yellow+"Ingrese una opci�n \n"+reset);
                 opcion4 = sn.nextInt();
                 switch (opcion4) {
                     case 1:
                         System.out.println(purplel+"Has seleccionado Promedio  \n"+reset);
                         Scanner teclado = new Scanner(System.in);
                         String nn = null;                   // variable string para guardar cantidad de cursos
                         String nn1 = null;                  // variable string para guardar cantidad de alumnos
                         String nn2 = null;                  // variable string para guardar cantidad de notas
                         int n = 0;
                         int n1 = 0;
                         int n2 = 0;
                         
                         //System.out.print("*************************************************************\n"
                              //   + "******************INGRESE LO SOLICITADO**********************\n"
                               //  + "*************************************************************\n");

                         System.out.print(yelli+"Cantidad de cursos:\n ");
                         nn = validarCursoalumnota(nn);                  // se valida cantidad de cursos, con funcion de validacion, se aceptan numeros mayores a 0
                         n = Integer.parseInt(nn);
                         System.out.print("Cantidad de alumnos:\n ");
                         nn1 = validarCursoalumnota(nn1);                // se valida cantidad de alumnos, con funcion de validacion, se aceptan numeros mayores a 0
                         n1 = Integer.parseInt(nn1);
                         System.out.print("Cantidad de notas:\n "+reset);      
                         nn2 = validarCursoalumnota(nn2);                // se valida cantidad de notas, con funcion de validacion, se aceptan numeros mayores a 0
                         n2 = Integer.parseInt(nn2);

                         String valorPonde = null;                       // variable que guardara lo valores de ponderacion ingresados por teclado,
                         Double[] ponderacion = new Double[n2];          // arreglo double que guardara los valores validados con funcion validarPonderado
                         Double verificaPonderado;                       // variable double que acumulara la suma de los valores de ponderacion para comprobrar que llega a 100.0
                         Double NotaPonderado;                           // variable double auxiliar que se le asignara el valor ingresado por teclado y validado
                         boolean cien = true;                            // booleano para repetir ingreso de valores de ponderacion mientras se capturen datos erroneos en el ciclo for

                         int cursoz = n;                                 // variable que indicara la cantidad de Cursos dentro del programa
                         int alumnoy = n1;                               // variable que indicara la cantidad de Alumnos dentro del programa
                         int notax = n2;                                 // variable que indicara la cantidad de Notas dentro del programa
                         int auxi = 0;                                   // variable auxiliar para usarla en el ingreso de datos de Ponderacion

                         
                         //ITERACION PARA INGRESAR VALORES DE PONDERACION QUE CUMPLAN CON REQUISITOS
                         // NUMEROS
                         // MAYORES A 0
                         // TOTAL PONDERADO IGUAL A 100
                         // INCLUSO SE PUEDE CORREGIR ULTIMO VALOR INGRESADO DE PONDERACION, SI EL TOTAL NO LLEGA A 100
                         while (auxi == 0) {
                             System.out.println(yelli+"Ingrese ponderado por nota: \n"+reset);

                             while (cien) {
                                 verificaPonderado = 0.0;
                                 for (int i = 0; i < notax; i++) {

                                     valorPonde = validarPonderado(valorPonde);
                                     NotaPonderado = Double.parseDouble(valorPonde);
                                     ponderacion[i] = NotaPonderado;
                                     verificaPonderado = (verificaPonderado + ponderacion[i]);
                                     if (verificaPonderado > 100.0) {
                                         System.out.println(yelli+"Intente denuevo (Maximo ponderación 100%)"+reset);
                                         i = notax;
                                     }
                                     // PARA AYUDAR EN EL INGRESO DE DATOS ESTE CODIGO CORRIGE ULTIMO PONDERADO SI EL TOTAL NO LLEGA A 100%
                                     if (n2 > 1) {
                                         if (i == (notax - 1)) {
                                             if (verificaPonderado < 100) {
                                                 System.out.println(red+"Corrija última ponderación"+reset);
                                                 verificaPonderado = (verificaPonderado - ponderacion[i]);
                                                 i = notax - 2;                  // i SE VUELVE A REINICIAR AL VALOR QUE ESTABA AL LLEGAR A LA PENULTIMA ITERACION DE INGRESO DE DATOS
                                             }
                                         }
                                     }

                                 }
                                 System.out.println("suma ponde " + verificaPonderado);
                                 if (verificaPonderado == 100.0) {
                                     cien = false;
                                     auxi = 1;
                                 } else {
                                     System.out.println(red+"Verifique la ponderacion"+reset);

                                 }
                             }

                         }
                         for (int i = 0; i < ponderacion.length; i++) {
                             System.out.println(ponderacion[i]);

                         }

                         for (int i = 0; i < ponderacion.length; i++) {
                             ponderacion[i] = ponderacion[i] / 100;

                         }

                         Double Acumula = 0.;
                         Double Promedio = 0.;

                         Double[] NotasAl = new Double[alumnoy * notax];
                         Double[] Notas = new Double[cursoz * alumnoy * notax];
                         String[] Alumno = new String[cursoz * alumnoy * notax];
                         String[] Curso = new String[cursoz * alumnoy * notax];
                         String[] AlumnoM = new String[cursoz * alumnoy * notax];
                         String[] CursoM = new String[cursoz * alumnoy * notax];

                         Double[] Notax = new Double[cursoz * alumnoy * notax];
                         String[] NotasAlumno = new String[alumnoy * notax];
                         String[] CursoAlumno = new String[alumnoy * notax];

                         String[] NotasSeleccion = new String[20];
                         Double[] NotasMatriz = new Double[cursoz * alumnoy * notax];

                         Double DDatos;
                         String[] Datos2 = new String[20];

                         String[][][] matriz = new String[cursoz][alumnoy][notax];

                         String Arreglo[] = new String[cursoz * alumnoy * notax];
                         // variables busqueda por nombre
                         int rangoPosArr;
                         int tamBus;
                         int rango;
                         String nombre = null;
                         String posicion;
                         String posicion2;
                         String[] nombreEnc = new String[n2 * n1];
                         String[] nombreEnc2 = new String[n2];
                         Double[] notasEnc = new Double[n2 * n1];
                         Double[] notasEnc2 = new Double[n2];
                         String[] partes = new String[4];
                         String[] partes2 = new String[4];

                         String Datos = null;
                         String DatosC = null;
                         String DatosA = null;
                         String DatosN = null;

                         int Fx = 0;
                         int tC = 0;
                         int c = 0;
                         int a = 0;

                         //teclado.nextLine();
                         
                         //ACA ESTA EL CEREBRO DEL PROGRAMA QUE RECIBE TODOS LOS DATOS DE LA BASE DE DATOS
                         for (int i = 0; i < cursoz; i++) {
                             System.out.print(yelli+"Ingrese curso: "+reset);
                             DatosC = teclado.nextLine();
                             CursoM[i] = DatosC;

                             for (int j = 0; j < alumnoy; j++) {
                                 System.out.print(yelli+"Ingrese nombre: \n"+reset);
                                 DatosA = teclado.nextLine();
                                 AlumnoM[j] = DatosA;

                                 for (int k = 0; k < notax; k++) {

                                     Curso[Fx] = DatosC;     // Arreglo auxiliar para comparar curso dentro de la busqueda
                                     Alumno[Fx] = DatosA;    // Arreglo auxiliar para comparar alumno dentro de la busqueda

                                     DatosN = validarDatos(DatosN);   // es mejor guardar el valor de la validacion, porque al colocarlo dentro de un cast, vuelve a preguntar el dato.
                                     Notas[Fx] = Double.parseDouble(DatosN);  // aca queda reflejado lo anterior, solo se le entrega el dato validado y queda parsear
                                     tC++;

                                     NotasMatriz[Fx] = Double.parseDouble(DatosN);  // TENER MUCHO CUIDADO EN ESTE PUNTO. SE CREAN VALORES SOBREIMPRESOS Y VARIABLE QUE CON DOS VALORES [0] Y [1]

                                     matriz[i][j][k] = "ID" + " " + CursoM[i] + " " + AlumnoM[j] + " " + NotasMatriz[Fx];  // aca se guardan todos los datos recopilados. Especial atencion ultimo dato que maneja su propio indice para no reescribir datos, que conduce a Errores de pedir datos a posiciones de Arrays null.
                                     Arreglo[Fx] = "ID" + " " + CursoM[i] + " " + AlumnoM[j] + " " + NotasMatriz[Fx];
                                     Fx++;
                                 }
                             }

                         }
                         for (int i = 0; i < Curso.length; i++) {
                             System.out.println(purplel+"curso " +reset+lightgreen+ Curso[i]+reset);

                         }

                         for (int i = 0; i < Alumno.length; i++) {
                             System.out.println(purplel+"alumno "  +reset+lightgreen+ Alumno[i]+reset);

                         }

                         for (int i = 0; i < Notas.length; i++) {
                             System.out.println(purplel+"notas "  +reset+lightgreen+ Notas[i]+reset);

                         }

                        // System.out.println("Lista Cursos Ingresado[][][]");
                         for (int k = 0; k < cursoz; k++) {
                             for (int i = 0; i < alumnoy; i++) {
                                 for (int j = 0; j < notax; j++) {
                                    // System.out.println(matriz[k][i][j]);
                                 }
                             }
                         }
                         //1System.out.println("Lista Curso Clon []");
                         for (int i = 0; i < Arreglo.length; i++) {
                             //System.out.println(Arreglo[i]);

                         }
                         for (int i = 0; i < NotasMatriz.length; i++) {
                             //System.out.println("NotasMatriz [" + i + "]: " + NotasMatriz[i]);

                         }
                         boolean encontrado = true;
                         boolean buscar = true;
                         int conta = 0;
                         String CursoE = null;

                         int m = 0;

                         int totalDatos = cursoz * alumnoy * notax;
                         int datosCurso = totalDatos / cursoz;
                         int tamañoNm = Arreglo.length;

                         Double acumuNota = 0.0;
                         String[] CAlum1 = new String[3];
                         String[] CAlum2 = new String[3];

                         String part1;
                         String part2;

                         
                         //ITERACION BUCLE PARA HACER LAS BUSQUEDA POR CURSO O POR ALUMNO
                         do {
                             int DatoInt;
                             Datos = validarMenu(Datos);

                             if (Datos.equals("1")) {
                                 encontrado = true;
                                 conta = 0;
                                 int pos = 0;
                                 m = 0;
                                 while (encontrado) {

                                     pos = 0;
                                     System.out.println(yellow+"Busqueda por curso"+reset);
                                     Datos = teclado.nextLine();

                                     for (int i = 0; i < Curso.length; i++) {
                                         posicion = Curso[i];
                                         partes = posicion.split(" ");
                                         for (int j = 0; j < 1; j++) {

                                             if (partes[0].compareTo(Datos) == 0) {
                                                 nombreEnc[pos] = Arreglo[i];
                                                 notasEnc[pos] = NotasMatriz[i];

                                                 Notas[pos] = NotasMatriz[i];
                                                 pos++;
                                             }

                                         }

                                     }
                                     //ACA
                                     if (pos > 0) {
                                         encontrado = false;
                                         Acumula = 0.0;
                                         Promedio = 0.0;
                                         for (int i = 0; i < nombreEnc.length; i++) {
                                             System.out.println(nombreEnc[i]);

                                         }
                                         for (int i = 0; i < notasEnc.length; i++) {
                                             Acumula = Acumula + Notas[i];
                                         }
                                         Double media;
                                         int tamNE = notasEnc.length;
                                         media = Acumula / tamNE;

                                         System.out.println("Promedio: " + Aproximar(media, 1));

                                     } else {
                                         if (pos == 0) {
                                             System.out.println("No encontrado");

                                         }

                                     }
                                 }

                             }

                             if (Datos.equals("2")) {
                                 encontrado = true;
                                 conta = 0;
                                 int pos = 0;

                                 while (encontrado) {

                                     m = 0;
                                     System.out.println(yellow+"Busqueda por nombre:"+reset);
                                     nombre = teclado.nextLine();

                                     for (int i = 0; i < Alumno.length; i++) {
                                         posicion2 = Alumno[i];
                                         partes2 = posicion2.split(" ");
                                         for (int j = 0; j < 1; j++) {

                                             if (partes2[0].compareTo(nombre) == 0) {
                                                 nombreEnc2[m] = Arreglo[i];
                                                 notasEnc2[m] = NotasMatriz[i];

                                                 Notas[m] = NotasMatriz[i];
                                                 m++;
                                             }

                                         }
                                     }
                                     if (m == 0) {
                                         System.out.println(red+"No encontrado"+reset);

                                     }

                                     //ACA
                                     if (m > 0) {

                                         encontrado = false;
                                         Acumula = 0.0;
                                         Promedio = 0.0;
                                         for (int i = 0; i < nombreEnc2.length; i++) {
                                             System.out.println(lightgreen+nombreEnc2[i]+"..... Ponderacion:..... "+(ponderacion[i]*100)+"%"+reset);

                                         }

                                         Acumula = 0.0;
                                         for (int i = 0; i < notasEnc2.length; i++) {
                                             Acumula = Acumula + (notasEnc2[i] * ponderacion[i]);
                                         }

                                         System.out.println(lightgreen+"Promedio: " + Aproximar(Acumula, 1)+reset);
                                     }
                                 }

                             }
                             int aux = 0;
                             String r = null;

                             while (aux == 0) {
                                 r = validarUltima(r);
                                 if (r.equals("1")) {
                                     encontrado = true;
                                     aux = 1;
                                 } else {
                                     if (r.equals("2")) {
                                         encontrado = false;
                                         aux = 1;
                                     }

                                 }

                             }

                         } while (encontrado);
                 
                         
                         break;
             
                     case 2:
                    	 regresar = true;
                         break;
                     
                     
                     default:
                         System.out.println(yellow+"\nSeleccione una opci�n entre 1 y 2 \n"+reset);
                 }
             } catch (InputMismatchException e) {
                 System.out.println(red+"Debes insertar un n�mero"+reset);
                 sn.next();
                 
             }
         	
         	
         	
         	
         } // if menu ponderado
         
         if(opcion==5) {
         	System.out.println(purplel+"* * * * * * * * * * * * * * * * * * * * * *");
         	System.out.println(purplel+"*      ******************************     *");
             System.out.println(purplel+"*      *        "+lightgreen+"***Z-corp***"+purplel+"        *     *" +reset);
             System.out.println(purplel+"*      *    "+cyan+"Calculadora Zeneniana"+purplel+"   *     *"+reset);
             System.out.println(purplel+"*      ******************************     *");
             System.out.println(purplel+"*                                         *");
             System.out.println(purplel+"*            "+lightgreen+"Creada y dise�ada"+purplel+"            *");
             System.out.println(purplel+"*            "+cyan+"By Hijos de Zenen"+purplel+"            *");
             System.out.println(purplel+"*                                         *");
             System.out.println(purplel+"*              "+lightgreen+"Inspirada por"+purplel+"              *");
             System.out.println(purplel+"*                  "+cyan+"Zenen"+purplel+"                  *");
             System.out.println(purplel+"*           *******************           *");
             System.out.println(purplel+"*                                         *");
             System.out.println(purplel+"*             "+lightgreen+"Víctor Barraza"+purplel+"                   *");
             System.out.println(purplel+"*                                         *");
             System.out.println(purplel+"*             "+lightgreen+"Zenen Canales"+purplel+"               *");
             System.out.println(purplel+"*                                         *");
             System.out.println(purplel+"*             "+lightgreen+"Luis Galleguillos"+purplel+"           *");
             System.out.println(purplel+"*                                         *");
             System.out.println(purplel+"*             "+lightgreen+"Miguel Ocque"+purplel+"                *");
             System.out.println(purplel+"*                                         *");
             System.out.println(purplel+"*             "+lightgreen+"Alejandro Ontiveros"+purplel+"         *");
             System.out.println(purplel+"*                                         *");
             System.out.println(purplel+"*                                         *");
             System.out.println(purplel+"*                                         *");
             System.out.println(purplel+"*                                         *");
             System.out.println(purplel+"*            "+yellow+"Si lo dijo "+cyan+"Zenen"+purplel+"             *");
             System.out.println(purplel+"*                                         *");
             System.out.println(purplel+"*                                         *");
             System.out.println(purplel+"*              "+lightgreen+"***Es ley***"+purplel+"               *");
             System.out.println(purplel+"*                                         *");
             System.out.println(purplel+"* * * * * * * * * * * * * * * * * * * * * *");
             regresar = true;
             System.out.println(yellow+"\n ******    Programa terminado    ******"+reset);
             break;
             
             
             
    
         	
         	
         	
         } // menu acerca de
         
         if(opcion==6) {
         	
         }
         
     
     } //while menu principal
     
     
     
     
    
}


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
public static double division(double dividendo, double divisor){

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
case "�":val=15;
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
case 15:aux="�";
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

public static String validarCursoalumnota(String x) {
    Scanner teclado = new Scanner(System.in);
    int tC = 0;
    Double DDatos;

    while (tC == 0) {

        //System.out.print("Cantidad: ");
        try {
            while ((x = teclado.nextLine()).equals("0") || (DDatos = Double.parseDouble(x)) < 1) {
                System.out.println("Ingrese Cantidad Valida...");
                System.out.print("Cantidad: ");
            }

            tC++;

        } catch (NumberFormatException ex) {
            System.out.println("Error...");
        }
    }
    return x;

}

public static String validarPonderado(String x) {
    Scanner teclado = new Scanner(System.in);
    int tC = 0;
    Double DDatos;

    while (tC == 0) {

        //System.out.print("Nota: ");
        try {
            while ((x = teclado.nextLine()).equals("0") || (DDatos = Double.parseDouble(x)) < 0 || (DDatos = Double.parseDouble(x)) > 100) {
                System.out.println("Ingrese Ponderacion Valida...");
                System.out.print("Nota: ");
            }

            tC++;

        } catch (NumberFormatException ex) {
            System.out.println("Error...");
        }
    }
    return x;

}

public static String validarDatos(String x) {
    Scanner teclado = new Scanner(System.in);
    int tC = 0;
    Double DDatos;

    while (tC == 0) {

        System.out.print("Ingrese nota: ");
        try {
            while ((x = teclado.nextLine()).equals("0") || (DDatos = Double.parseDouble(x)) < 0 || (DDatos = Double.parseDouble(x)) > 7) {
                System.out.println("Ingrese nota Valida...");
                System.out.print("Ingrese nota: ");
            }

            tC++;

        } catch (NumberFormatException ex) {
            System.out.println("Error...");
        }
    }
    return x;
}

public static String validarMenu(String x) {
    Scanner teclado = new Scanner(System.in);
    int tC = 0;
    int DatoInt;

    while (tC == 0) {

        System.out.println();
    	System.out.println("*** BUSQUEDA *** \n");
        System.out.println("(1)... Busqueda por Curso");
        System.out.println("(2)... Busqueda por Alumno \n");
        try {
            while ((x = teclado.nextLine()).equals("") || (DatoInt = Integer.parseInt(x)) <= 0 || (DatoInt = Integer.parseInt(x)) > 2) {
                System.out.println("Ingrese (1) ó (2)");

            }

            tC++;

        } catch (NumberFormatException ex) {
            System.out.println("Error...");
        }
    }
    return x;
}

public static String validarUltima(String x) {
    Scanner teclado = new Scanner(System.in);
    int tC = 0;
    int DatoInt;

    while (tC == 0) {

        System.out.println("(1)...Otra Busqueda por Curso"
                + "\n(2)...Salir");
        try {

            while ((x = teclado.nextLine()) == null || (DatoInt = Integer.parseInt(x)) <= 0 || (DatoInt = Integer.parseInt(x)) > 2) {
                System.out.println("Ingrese (1) ó (2)");

            }

            tC++;

        } catch (NumberFormatException ex) {
            System.out.println("Error...");
        }
    }
    return x;
}

public static Double Aproximar(Double x, int cantDecimal) {
return BigDecimal.valueOf(x).setScale(cantDecimal, BigDecimal.ROUND_HALF_UP).doubleValue();
}
}// class

