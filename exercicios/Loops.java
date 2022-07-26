import java.util.Scanner;

public class Loops {


    //REMOVA O COMENTARIO DE UM DOS LOOPS E VEJA COMO ELE FUNCIONA NOS COMENTARIOS.
    public static void main(String[] args) {

        //FOR
        /*
        
        for(int cont = 0 ;  cont < 5 ; cont++){
            System.out.println("Repete um numero de vezes ja esperado");

        Utilizado apenas quando temos certeza do numero de repetições que vão ser
          executadas
         */

         //WHile
         /*
            Scanner tc = new Scanner(System.in);
            int cont = 0;
            int repete = 0;
            System.out.println("digite um numero: ");
            cont = tc.nextInt();

           while(repete < cont){
           System.out.println("esse é o while");
          repete++;
          }
         
         Repete um numero de vezes não esperado inicialmente,
           como por exemplo, repetir pelo numero de vezes que o usuario digitou em um scanner
           *while compara e depois executa o bloco e a incrementação
          */



          //DO
          /*
          
          Scanner tc = new Scanner(System.in);
            int cont = 0;
            int repete = 0;
            System.out.println("digite um numero: ");
            cont = tc.nextInt();


           do{
            System.out.println("repete antes, compara depois");
            repete++;
          }while(repete < cont);
          
          
          executa a condição antes e depois compara se deve incrementar ou não, usado em sitações
           * especificas.
           */
       
        }
         
         
            
          
    
    
}
