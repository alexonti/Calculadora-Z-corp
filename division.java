package division1;
import java.util.*;
public class division1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double dividendo=0;
		double divisor=0;
		double residuo=0;
		double residuo1=0;
		double residuo2=0;
		String simb="";
		Scanner sc = new Scanner(System.in);
		System.out.println("ingrese su dividendo");
		dividendo=sc.nextDouble();
		System.out.println("ingrese su divisor");
		divisor=sc.nextDouble();
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
				int res=(int)residuo;
				int res1=(int)residuo1;
				int res2=(int)residuo2;
				System.out.println(simb+res+","+res1+res2);
			}
			if(resto!=0){
				resto=resto+resto+resto+resto+resto+resto+resto+resto+resto+resto;
				while(divisor<=resto){
					resto=resto-divisor;
					residuo2++;
					
				}
		System.out.println("el resultado de su division es ");
		int res=(int)residuo;
		int res1=(int)residuo1;
		int res2=(int)residuo2;
		System.out.println(simb+res+","+res1+res2);
		}
	}
	}
}

