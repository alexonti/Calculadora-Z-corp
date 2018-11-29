
public class Cambiodebases {

	public static void main(String[] args) {
		//favor de omitir scanner x ahora
		
		System.out.println("ingrese el numero a transformar");
		String valor=("1011");
		System.out.println("ingrese el numero de la base que quiere transformar");
		int x=2;
		int num = 0;
		System.out.println("ingrese el numero de la base a la que desea transformar(hasta base 16)");
		int y=10;
		try{num=Integer.parseInt(valor);}
		catch (NumberFormatException ex){
			if(y==10){
				int respuesta=AlfaDec(valor,y);
				System.out.println(respuesta);
			}if(y<10){
				int res=AlfaDec(valor,10);
				int respuesta=DecTodas(res,y);
				System.out.println(respuesta);
			}if (y>10 && y<=16){
				int res=AlfaDec(valor,10);
				String respuesta=decalfa(res,y);
				System.out.println(respuesta);
			}else{System.out.println("base no valida"+"alfa a base");}
		}if(x==10){
			if(y==10){
				System.out.println(num);
			}if (y<10){
				int respuesta=DecTodas(num,y);
				System.out.println(respuesta);
			}if (y>10 && y<=16){
				String respuesta=decalfa(num,y);
				System.out.println(respuesta);
			}else{System.out.println("base no valida"+"dec a base");}
			
		}if (x<10){
			if(y==10){
				int respuesta=TodoDec(num,y);
				System.out.println(respuesta);
			}if (y<10){
				int res=TodoDec(num,x);
				int respuesta=DecTodas(res,y);
				System.out.println(respuesta);
			}if (y>10 && y<=16){
				int res=TodoDec(num,x);
				String respuesta=decalfa(res,y);
				System.out.println(respuesta);
			}else{System.out.println("base no valida"+"num a base");}
		}
			
		}
	
	
static int DecTodas (int num,int y){//funciona con binario igual
	int x;
	int resto;
	int con=0;
	int cont=Float.toString(num).length();
	int aux[]=new int [cont];
	while (cont!=con){
		x=(int) (num/y);
		resto=(int) (num%y);
		num=x;
		aux[con]=resto;
		con++;
	
}for(int i =0;i<cont;i++){
	x=aux[con-1];
	System.out.print(x);
	con--;
}
	return cont;
}
static int TodoDec(int x,int y){//funciona con binario
	int sumatoria = 0;
	int aux;
	double cifras;
	int cifras2;
	int cont=Float.toString(x).length();
	for(int i=0;i<cont-1;i++){
		cifras= (x*0.1);
		cifras2=(int) (x*0.1);
		x=cifras2;
		cifras2=(int) ((cifras-cifras2)/0.1);
		aux=(int) (cifras2*Math.pow(y, i));
		sumatoria=sumatoria+aux;
		//System.out.println(sumatoria);
	}
	return sumatoria;
}
static int AlfaDec(String numero,int base){
	int aux2 = 0;
	double sumatoria=0;
	char aux3;
	String aux4 ="",aux5="";
		int cont=numero.length();
		for(int j=cont-1;j>=0;j--){
			aux5=aux5+numero.charAt(j);
		}
		for(int i=0;i<cont;i++){
			aux3=aux5.charAt(i);
			aux4=Character.toString(aux3);		
			switch (aux4){
			case "A":
				aux2=10;
				break;
			case "B": 
				aux2=11;
				break;
			case "C":
				aux2=12;
				break;
			case "D":
				aux2=13;
				break;
			case "E":
				aux2=14;
				break;
			case "F":
				aux2=15;
				break;
			default: aux2=Integer.parseInt(aux4);
				
			}double pot=Math.pow(16, i);    //base
			double sumat = aux2*pot;
			sumatoria=sumatoria+sumat;
			}
		return (int) sumatoria;
	
}
static String decalfa(int ini,int abase){
	int x;
	int resto;
	int con=0;
	String resp = null;
	int cont=Float.toString(ini).length();
	int aux[]=new int [cont];
	while (cont!=con){
		x=(int) (ini/abase);
		resto=(int) (ini%abase);
		ini=x;
		aux[con]=resto;
		con++;
}
	for(int i =0;i<cont;i++){
		x=aux[con-1];
		switch (x){
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
			resp=Integer.toString(x);
		}
		System.out.print(resp);
		con--;
	}
	return resp;
}
}
