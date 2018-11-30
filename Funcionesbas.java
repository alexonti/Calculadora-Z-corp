
public class Funcionesbas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
public static double Multiplicar(double x, double y){   
    double aux = x,auy=y;
 	for(int i=0;i<9;i++){//x*10
     	x=x+aux;
     }
 	for(int j=0;j<9;j++){//y*10
 		y=y+auy;
 	}
 	double producto=0.0;
     if((x>0)&&(y>0)){               // se evalua si valore de x e y son positivos
         for(int i=0;i<x;i++){
             producto=producto+y;
         }
     }
     if((x<0)&&(y<0)){               // se evalua si valore de x e y son negativos
         x=x-(x+x);                  //cambio de signo
         y=y-(y+y);                   //cambio de signo
         for(int i=0;i<x;i++){
             producto=producto+y;
         }
     }
     if((x<0)&&(y>0)){               // se evalua si valore de x es negativa e y es positiva
         x=x-(x+x);                  //cambio de signo
         for(int i=0;i<x;i++){
             producto=producto+y;            
         }          
         	producto=producto-(producto+producto);   //cambio de signo                    
     }
     if((x>0)&&(y<0)){               // se evalua si valore de x es positiva e y es negativa
         y=y-(y+y);                   //cambio de signo
         for(int i=0;i<x;i++){
             producto=producto+y;    
         }
         	producto=producto-(producto+producto);   //cambio de signo
     } producto=producto/100;
     return producto;
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
}
