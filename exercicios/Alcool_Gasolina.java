import java.util.Scanner;


public class Alcool_Gasolina {

	
	public static void main(String[] args) {
		//variaveis
		double alcool,gasolina;
		Scanner tc = new Scanner(System.in);
	    
		System.out.println("Vamos descobir qual combustivel esta mais viavel");
		System.out.println("Digite o valor da gasolina: ");
		gasolina = tc.nextDouble();
		System.out.println("Digite o valor do Alcool: ");
		alcool = tc.nextDouble();
		if(gasolina * 70 / 100 > alcool ){
			System.out.println(" vale a pena usar alcool");
		}else{
			System.out.println("vamos de gasolina");
		}
		tc.close();
	}

}
