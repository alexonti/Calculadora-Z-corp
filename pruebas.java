package paquete;

public class pruebas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a=1011;
		int b=BinDec(a);
		System.out.println(b);


		
	}
static int BinDec(int x){
	float aux;	
	int total = 0,total2;
	int cf=Integer.toString(x).length();
	for(int i =0;i<cf;i++){
		aux=(int) (x%10);
		x=x/10;
		if(aux==1){
			total2=(int) Math.pow(2, i);
		}else{
			total2=0;
		}
		total=total+total2;
	}
	return total;
	
}
}
