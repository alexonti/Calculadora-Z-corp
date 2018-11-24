package multisuprem;

import java.util.Scanner;

public class multisuprem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double dividendo=0;
		double divisor=0;
		double residuo=0;
		double residuo1=0;
		double residuo2=0;
		String simb="";
		int i =0;
		int j =0;
		int res;
		int res1;
		int res2;
		double result;
		String Suprem;
		double auxr;
		int result2;
		Scanner sc = new Scanner(System.in);
		while(j<1){                                 // primer while para volver a solicitar numero
            System.out.print("ingrese su termino1: ");         
            
            try{                                    // primer try para validar primer numero
                dividendo=sc.nextDouble();             // se puede traspasar directamente a double lo ingresado por teclado
                j++;                                // incremento para salir del while
            }catch(Exception e){
                sc.next();
                System.out.println( "error");
        }
        }
		while(i<1){                                 // primer while para volver a solicitar numero
            System.out.print("ingrese su termino2: ");         
            
            try{                                    // primer try para validar primer numero
                divisor=sc.nextDouble();             // se puede traspasar directamente a double lo ingresado por teclado
                i++;                                // incremento para salir del while
            }catch(Exception e){
                sc.next();
                System.out.println( "error");
        }
        }
		divisor=1/divisor;
		
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
				//System.out.println(simb+res+","+res1+res2);
	
			
			if(resto!=0){
				resto=resto+resto+resto+resto+resto+resto+resto+resto+resto+resto;
				while(divisor<=resto){
					resto=resto-divisor;
					residuo2++;
					
				}
				
		System.out.println("el resultado de su division es ");
		res=(int)residuo;
		res1=(int)residuo1;
		res2=(int)residuo2;
		String suprem=simb+res+"."+res1+res2;
		result=new Double(suprem).doubleValue();
		//BigDecimal resAprox= new BigDecimal(result).setScale(2, RoundingMode.HALF_UP);
		//System.out.println(result);
		//System.out.println(simb+res+"."+res1+res2);
		result2=(int)result;
		//System.out.println(result2);
		auxr=result-result2;
		//System.out.println(auxr);
		if(auxr>0.99&&auxr<1){
			result2=result2+1;
			System.out.println(result2);
		}else{
			System.out.println(result);
			
			}
			}
		}	
	}


