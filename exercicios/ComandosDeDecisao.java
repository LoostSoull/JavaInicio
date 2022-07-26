public class ComandosDeDecisao {
    
    public static void main(String[] args) {

       //else e if exemplo

       int nota = 10;
       int media = 7;
       int falta = 4;
       int maxFalta = 5;

       if(nota > media && falta < maxFalta ){
           System.out.println("aprovado");
       }else if(nota <= 6 && maxFalta <= 6){
           System.out.println("recuperação");
       }else{
           System.out.println("reprovado");
       } 
        
    }


   



    //Operação ternaria

    /*
     Strint resultado;

     resultado (nota > media ? "aprovado" : "reprovado");
     realizado a comparação de forma mais simples, tudo a direita da "?" é true
     tudo a direita dos ":" é false,

     pode ser utilizado como: 
     resultado (nota > media ? "0" : "1");
      System.out.println("Resultaso:" + resultado==1 ? "aprovado" : "reprovado");

      simples =)

     */



    //Tabela verdade do AND &&

    /*
     V V = V
     V F = F
     F V = F
     F F = F
     */

      //Tabela verdade do OR &&

    /*
     V V = V
     V F = V
     F V = V
     F F = F
     */
    
}
