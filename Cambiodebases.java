import java.util.Scanner;

public class Cambiodebases {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("ingrese el numero a transformar");
		String valor="";
		valor=sc.nextLine();
		System.out.println("ingrese el numero de la base que quiere transformar");
		int x=0;
		x=sc.nextInt();
		int num = 0;
		System.out.println("ingrese el numero de la base a la que desea transformar(hasta base 16)");
		int y=0;
		y=sc.nextInt();
		sc.close();
		try{num=Integer.parseInt(valor);}
		catch (NumberFormatException ex){
			if(y==2){
				int resp=AlfaDec(valor,10);
				String respuesta=Decbin(resp,2);
				System.out.println(respuesta);
				System.exit(0);
			}
			if(y==10){
				int respuesta=AlfaDec(valor,y);
				System.out.println(respuesta+"");
				System.exit(0);
			}if(y<10){
				int res=AlfaDec(valor,10);
				int respuesta=DecTodas(res,y);
				System.out.println(respuesta+"");
				System.exit(0);
			}if (y>10 && y<=16){
				int res=AlfaDec(valor,10);
				String respuesta=decalfa(res,y);
				System.out.println(respuesta+"");
				System.exit(0);
			}else{System.out.println("base no valida"+"");}
		}
		if(x==10){
			if(y==2){
				String respuesta=Decbin(num,y);
				System.out.println(respuesta);
				System.exit(0);
			}
			if(y==10){
				System.out.println(num+"");
				System.exit(0);
			}if (y<10 && y>2){
				int respuesta=DecTodas(num,y);
				System.out.println(respuesta+"--");
				System.exit(0);
			}if (y>10 && y<=16){
				String respuesta=decalfa(num,y);
				System.out.println(respuesta+"");
				System.exit(0);
			}else{System.out.println("base no valida"+"");}
			
		}if (x<10 && x>2){
			if (y==2){
				int res=TodoDec(num,x);
				String respuesta=Decbin(res,2);
				System.out.println(respuesta);
				System.exit(0);
			}
			if(y==10){
				int respuesta=TodoDec(num,x);
				System.out.println(respuesta+"");
				System.exit(0);
			}if (y<10){
				int res=TodoDec(num,x);
				//System.out.println(res);
				int respuesta=DecTodas(res,y);
				System.out.println(respuesta+"");
				System.exit(0);
			}if (y>10 && y<=16){
				int res=TodoDec(num,x);
				String respuesta=decalfa(res,y);
				System.out.println(respuesta+"");
				System.exit(0);
			}else{System.out.println("base no valida"+"");}
		}if(x==2){
			if(y==2){
				System.out.println(num);
			}
			if(y==10){
			int respuesta=Bindec(num,2);
			System.out.println(respuesta);
			}
			if(y<10){
				int res=Bindec(num,2);
				int respuesta=DecTodas(res,y);
				System.out.println(respuesta);
			}
			if(y>10){
				int res=Bindec(num,2);
				System.out.println(res);
				String respuesta=decalfa(res,y);
				System.out.println(respuesta);
			}
		}if(x>10){
			if(y==2){
				int resp=AlfaDec(valor,10);
				String respuesta=Decbin(resp,2);
				System.out.println(respuesta);
				System.exit(0);
			}
			if(y==10){
				int respuesta=AlfaDec(valor,y);
				System.out.println(respuesta+"");
				System.exit(0);
			}if(y<10){
				int res=AlfaDec(valor,10);
				//System.out.println(res);
				int respuesta=DecTodas(res,y);
				System.out.println(respuesta+"");
				System.exit(0);
			}if (y>10 && y<=16){
				int res=AlfaDec(valor,10);
				String respuesta=decalfa(res,y);
				System.out.println(respuesta+"");
				System.exit(0);
			}else{System.out.println("base no valida"+"");}
			
		}
			
			
		}
	static String Decbin (int num,int y){//decimal binario
		int x;
		int resto;
		String acu = "",auxs="";
		int con=0;
		int cont=0;
		int aux[]=new int [30];
		while (num!=0){
			x=(int) (num/y);
			resto=(int) (num%y);
			num=x;
			//System.out.println(resto+"resto");
			aux[con]=resto;
			con++;
			cont++;
			//System.out.println(con+"contador");
		
	}for(int i =0;i<cont;i++){
		auxs=Integer.toString(aux[con-1]);
		//System.out.print(auxs+"");
		acu=acu+auxs;
		//System.out.println(acu+"acumulador");
		con--;
	}

		return acu;
	}
	
	static int Bindec(int x,int y){//binario decimal
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
			//System.out.println(cifras2+"cifras");
			aux=(int) (cifras2*Math.pow(y, i));
			//System.out.println(y+"~~");
			sumatoria=sumatoria+aux;
			//System.out.println(sumatoria+"--"+i);
		}
		return sumatoria;
	}
	
static int DecTodas (int num,int y){
	int x;
	int resto;
	int acu = 0;
	int con=0;
	int cont=Float.toString(num).length();
	int aux[]=new int [cont];
	while (num!=0){
		x=(int) (num/y);
		resto=(int) (num%y);
		num=x;
		//System.out.println(resto+"--");
		aux[con]=resto;
		con++;
		cont++;
		//System.out.println(con);
	
}while(con>=0){
	x=aux[con];
	acu=acu+x;
	acu=acu*10;
	//System.out.print(x+"");
	con--;
}acu=acu/10;

	return acu;
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
		//System.out.println(cifras2+"cifras");
		aux=(int) (cifras2*Math.pow(y, i));
		//System.out.println(y+"~~");
		sumatoria=sumatoria+aux;
		//System.out.println(sumatoria+"--"+i);
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
	String resp = "",acu="";
	int cont=Float.toString(ini).length();
	int aux[]=new int [cont];
	cont=0;
	while (ini!=0){
		x=(int) (ini/abase);
		resto=(int) (ini%abase);
		ini=x;
		aux[con]=resto;
		con++;
		cont++;
		//System.out.println(cont);
}
	while(con>=0){
		//System.out.println(con+"||");
		x=aux[con];
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
			acu=acu+resp;
		}
		//System.out.print(resp);
		con--;
	}
	return acu;
}
}