import java.util.Scanner;

public class Classe_Scanner {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        int n1= 0,n2= 0,n3= 0,n4= 0,media = 0,resul =0;
        String nome = " ";

        System.out.println("Digite seu nome:");
        nome = tc.nextLine();
        System.out.println("Digite o primeiro Numeral:");
        n1 = tc.nextInt();
        System.out.println("Digite o segundo Numeral:");
        n2 = tc.nextInt();
        System.out.println("Digite o terceiro Numeral:");
        n3 = tc.nextInt();

        media = (n1+n2+n3);
       
        System.out.println(media);

        if(media > 60 ){
            System.out.printf("O Aluno %s foi aprovado com a media de %d " ,nome ,media);
        }else if(media <= 40){
            System.out.printf("O Aluno %s ficou de recuperação com a media %d ", nome, media);
        }else{
            System.out.printf("O Aluno %S foi reprovado com a media ", nome , media);
        }
    }
}


//Scanner
/*
 Objeto utilizado para recolher dados digitados no teclado
 apos utiliza-la e instanciar com o "new" , informando ao mesmo que
 vamos pegar tudo que for digitado do teclado com o parametro System.in,
 utilizamos a variavel e indicamos que nosso scanner vai recolher o dado
 e retornar para a variavel com a saida nextInt(),nextLine ,  de a cordo com o valor da variavel */