import java.util.Arrays;
import java.util.Scanner;

public class Cambioletrasnumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int con = 0;
		int a = 0;
		String auxi;
		int aux2 = 0;
		String ent1;
		System.out.println("Deseas ordenar letras o numeros?  (0-1)");
		System.out.println("Ingresa un 0 para letras");
		System.out.println("ingresa un 1 para numeros");
		int preg=sc.nextInt();
		sc.nextLine();
		System.out.println("Ingrese la cantidad de elementos a ordenar");
		int sec=sc.nextInt();
		sc.nextLine();
		if (preg==0){
			System.out.println("Ingrese letras a ordenar");
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
		        	  System.out.println("Ingresa letras");
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
		    System.out.println(Arrays.toString(letras));
		}else{
			int orden[]=new int[sec];
			System.out.println("ingrese los numeros a ordenar");
			  while(con<sec){
			       ent1=sc.nextLine();
			       //if(ent1=="-1"){
				     // System.out.println("Usted a dejado de ingresar datos");
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
		    }
			  System.out.println(Arrays.toString(orden));
		}
	
		
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
}
