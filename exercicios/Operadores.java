



package br.com.fiap.tds;

public class Operadores {

	public static void main (String[] args){
		
		int x = 9;
		int y = 2;
		
		int soma = x + y;
		int subtracao = x - y;
		int multiplicacao = x * y;
		int divisao = x / y;
		int resto = x % y;
		
		System.out.println("resultado da adicao: " + soma);
		System.out.println("resultado da subtracao: " + subtracao);
		System.out.println("resultado da multiplicacao: " + multiplicacao);
		System.out.println("resultado da divisao sem resto: " + divisao);
		System.out.println("resultado da divisao com resto: " + resto);
		
		x++;
		System.out.println("encremento: " + x);
		y--;
		System.out.println("decremento: " + y);
		
		x =+10;
		System.out.println("atribuicao aditiva de x: " + x);
		y -= 10;
		System.out.println("atribuicao subtrativa de y: " + y);
		
	}
}
