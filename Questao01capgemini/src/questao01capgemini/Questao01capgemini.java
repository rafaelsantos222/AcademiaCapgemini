package questao01capgemini;
/**Classe para main, responsavel pela execução do programa
* @author Rafael P. Santos
* @version 1.00
*/

import java.util.Scanner;

 /* Algoritimo responvel por gerar uma 'Escada' de asteristicos, com a quantidade de linhas e
  *asteristicos que o usario informar */

public class Questao01capgemini {
    
    
    int n = 0;
   

    public static  StringBuilder retorna(int num) {
        boolean rep = true;
                
        Scanner entrada = new Scanner(System.in);
        while (rep == true) { // laço de repetição criado para que o codigo se repita caso o usuario não digitar um numero valido.
            System.out.println("Digite o valor de N:");

            String numero = entrada.nextLine();

            int n = 0;

            try {
                n = Integer.parseInt(numero);  //como o scanner acima captura uma String achei prudente colocar a conversao dentro do try e 
            } catch (NumberFormatException e) { // utilizar um catch depois para evitar erros e deixar o programa sempre rodando 
                System.out.println("Entrada com valor inválido");
            }

            if (n > 0) {
                for (int i = 0; i <= n; i++) {
                    for (int a = i; a < n; a++) {
                        System.out.print(" ");// responsavel pela impressao do input do espaçamento.
                    }
                    for (int esp = 0; esp < i; esp++) {

                        System.out.print("*");//responsalvel pelo input do asteristico.
                    }
                    System.out.println("");//pula a linha para que os asteristicos não fiquem aninhados.
                    rep = false;
                }

            } else {
                System.out.println("O valor tem que ser um numero inteiro maior do que 0");
            }
        }
        return null;
        
    }

    public static void main(String[] args) {
        
      
        retorna(2);
                
                        

    }
    
}
