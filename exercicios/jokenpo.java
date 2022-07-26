import java.util.Scanner;

public class jokenpo {

	public static void main(String args[]) {
		// variaveis
		int jogador, computador;
		Scanner tc = new Scanner(System.in);

		// apresentação
		System.out.println("______ JÓ KEN PÔ_________");
		System.out.println("1 PEDRA");
		System.out.println("2 PAPEL");
		System.out.println("3 TESOURA");
		System.out.println("Escolha uma opção");
		jogador = tc.nextInt();

		// logica do jogador
		switch (jogador) {

		case 1:
			System.out.println("Jogador escolheu PEDRA");
			break;
		case 2:
			System.out.println("Jogador escolheu PAPEL");
			break;
		case 3:
			System.out.println("Jogador escolheu TESOURA");
			break;
		default:
			System.out.println("opção incorreta, você escalou");
			break;
		}
		tc.close();
		// Logica computador

		computador = (int) (Math.random() * 3 + 1);

		switch (computador) {

		case 1:
			System.out.println("Computador escolheu PEDRA");
			break;
		case 2:
			System.out.println("Computador escolheu PAPEL");
			break;
		case 3:
			System.out.println("Computador escolheu TESOURA");
			break;
		}
		System.out.println("");
		// Logica para determinar o vencedor

		if (jogador == computador) {
			System.out.println("EMPATE");
		} else {
			if ((jogador == 1 && computador == 3)
					|| (jogador == 2 && computador == 1)
					|| (jogador == 3 && computador == 2)) {
				System.out.println("O Jogador venceu");
			} else {
				System.out.println("Computador venceu");
			}
		}
	}
}

/*
 * math.radom gera numero aleatorios , *3 serve para sortear 3 posições
 * semelhantes a um array, seriam: 0,1,2 , acrescentei + 1 , assim fica ,mais
 * didatico, ex: se sair 0 , fica 0 + 1 = 1 , 2 + 1 = 3 e 1+1= 2
 */

/*
 * na condição aninhada, declarei no mesmo if todas as opções de vitoria
 */
