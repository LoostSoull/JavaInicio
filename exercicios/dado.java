import java.util.Scanner;

public class dado {

	public static void main(String args[]) {

		char opcao = 's';
		Scanner tc = new Scanner  (System.in);
		
		System.out.println("Vamos jogar Dados");
		while(opcao == 's'){
			System.out.println("Lan�ando o dado..");
			int dado = (int) (Math.random()* 6 + 1);
			System.out.println("seu n�mero �: "+dado);
			System.out.println("Deseja jogar de novo? (s/n)");
			opcao = tc.next().charAt(0);
		}
		
	}
}
