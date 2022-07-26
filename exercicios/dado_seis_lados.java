import java.util.Scanner;


public class dado_seis_lados {

	public static void main (String args[]){
		//variaveis
		int num,joga;
		Scanner tc = new Scanner(System.in);
		
		//inicio
		System.out.println("__Vamos jogar dados__");
		System.out.println("Digite 1 para jogar e 0 para não jogar");
		joga = tc.nextInt();
		num = (int)(Math.random()* 5 + 1);
		
		switch(joga){
		
		case 1:
			System.out.println("voce escolheu jogar");
			System.out.println("seu dado girou, seu numero foi: " + (num));
			break;
		case 2:
			System.out.println("voce nao quis jogar");
			break;
			default : System.out.println("opção invalida");
		
		
		}
		
		
	}
}
