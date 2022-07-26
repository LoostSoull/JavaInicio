package br.com.fiap.tds;
import java.util.Scanner;
public class LeituraDeDados {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int idade = sc.nextInt();
		System.out.println("a idade digitada foi: " + idade);
		System.out.println("***FIM***");
		sc.close();
	}
}
