import java.util.Scanner;


public class gasolina { 	

	public static void main (String  args[]){
		double Alcool , Gasolina;
		Scanner tc = new Scanner(System.in);
		
		System.out.println("digite o valor da Gasolina");
		Gasolina = tc.nextDouble();
		System.out.println("Digite o valor do Alcool");
		Alcool = tc.nextDouble();
		
		if(Gasolina * 0.70 > Alcool){
			System.out.println("use alcool");
		}else{
		 System.out.println("use gasolina");
		}
		
	}
}
