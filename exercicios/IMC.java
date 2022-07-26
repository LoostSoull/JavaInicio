import java.text.DecimalFormat;
import java.util.Scanner;


public class IMC {

	public static void main (String args[]){
		//variaveis
		double peso,altura,resul;
		//objetos
		Scanner tc = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		
		System.out.println("Vamos calcular seu IMC");
		System.out.println("Digite o seu peso: ");
		peso = tc.nextDouble();
		System.out.println("Digite sua altura: ");
		altura = tc.nextDouble();
		//resultado
		resul = peso / (altura * altura);
		System.out.println(formatador.format(resul));
		
	    //condições
		if(resul < 18.5){
			System.out.println("abaixo do peso");
		}else if(resul < 25){
		System.out.println("peso normal");
		
	}else if(resul < 35){
		System.out.println(" Obesidade grau I");
		}else if (resul < 40) {
			System.out.println("Obesidade Grau II (Severa)");
		}else if (resul >= 40 ){
			System.out.println("obesidade grau III (mórbida)");
		}
	}
}
