
import java.util.Scanner;
public class CalculoImc {
	
	public static void main(String[] args){
		
		double altura;
		double peso;
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("Digite a sua altura");
		altura =leia.nextDouble();
		
		System.out.println("Digite o seu peso");
		peso =leia.nextDouble();
		
	   double resultado;
	   resultado = peso / (altura*altura);
	   System.out.println("o resultado  " + resultado);
	   
	   if(peso == 18.5 || peso < 25) {
	       	System.out.println("voce esta no peso ideial");
	   }else{
		   System.out.println("voce esta fora do peso");
	   }
	   }
	
	}
