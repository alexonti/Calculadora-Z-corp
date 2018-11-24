
public class pot {

	public static void main(String[] args) {
		int x=3;
		int y=4;
		int resp=potencia(x,y);
		System.out.println(resp);
	}
	static int potencia(int x,int y){
		int total=0;
		int aux=x;
		for(int i =0;i<y-1;i++){
			
			for(int j=0;j<aux;j++){
				total=total+x;
				System.out.println("-"+total);
				
			}
			x=total;
			total=0;
			System.out.println("*"+x);
			
		}
		return x;
	}

}
