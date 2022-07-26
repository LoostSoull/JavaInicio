import java.util.Scanner;


public class tabuada {

	public static void main (String args []){
		//variaveis
		int numero,tab;
		Scanner tc = new Scanner (System.in);
		//inicio
		System.out.println("__TABUADA__");
		System.out.println("Digite o numero: ");
		numero = tc.nextInt();
		System.out.println("A Tabuada do numero " + numero + " é: ");
		
		//processamento
		
		for(tab = 0 ;tab <11 ;tab ++){
			System.out.println(numero + " x "+ tab + " = " + tab * numero);
			
		}
	}
}
