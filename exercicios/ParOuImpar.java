package br.com.fiap.tds;
import java.util.Scanner;
public class ParOuImpar {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero");
		int numero1 = sc.nextInt();
		System.out.println("Digite o segundo numero");
		int numero2 = sc.nextInt();
		
		int soma = numero1 + numero2;
		System.out.println("A Soma dos numeros e: " + soma);
		
		int resto = soma % 2;
		
		if (resto == 0){
			System.out.println("a soma dos numeros e par");
		}else{
			System.out.println("a soma dos numeros e impar");
		}
	}
}
