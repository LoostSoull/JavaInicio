import java.text.DecimalFormat;
import java.util.Scanner;


public class Calculadora_Valor_Servico {

	public static void main (String args[]){
		//Variaveis
		double hora,remuneracao,custo,cargaHoraria;
		Scanner tc = new Scanner (System.in);
		DecimalFormat Formatador = new DecimalFormat("#0.00");
		
		
		System.out.println("Digite a sua pretenção salarial: ");
		remuneracao = tc.nextDouble();
		System.out.println("Digite o valor dos custos: ");
		custo = tc.nextDouble();
		System.out.println("digite o numero de horas a trabalhar: ");
		cargaHoraria = tc.nextDouble();
		hora = (remuneracao + (remuneracao * 0.3) + custo + (remuneracao * 0.2) )/ cargaHoraria;
		System.out.println(" O valor de caa hora trabalhada é " + Formatador.format(hora));
		tc.close();
	}
}
