package questao03capgemini;

/**
 * Classe para main, responsavel pela execução do programa
 *
 * @author Rafael P. Santos
 * @version 1.00
 */
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/* algoritimo responsavel por procurar anagramas em uma unica palavra */

public class Questao03capgemini {

    public  int verificaAnagrama(String palavra) {
        int cont = 0;
        int anagramas = 0;
       
        String[] aux1 = new String[80]; //aranjo tecnico, a palabra tem que ter menos de 80 caracteres, caso contrario ira dar overflow    

        for (int i = 0; i < palavra.length(); i++) {//nesse primeiro laço ele busca as conbinaçoes de palavras
            for (int j = i; j < palavra.length(); j++) {
                char[] c = palavra.substring(i, j + 1).toCharArray();
                Arrays.sort(c);
                aux1[cont] = String.valueOf(c);
                cont++;
            }
        }

        for (int i = 0; i < cont; i++) { // ja neste segundo laço for, sua função principal e somar anagramas na variavel anagramas
            for (int j = i; j < cont; j++) {
                if (aux1[i].equals(aux1[j + 1])) {
                    anagramas++;
                }
            }
        }
        return anagramas;
    } 

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a palavra que voce deseja verificar: ");
        String palavra = entrada.next();
        
        
       Questao03capgemini q3 = new Questao03capgemini();
       
       System.out.println("A quantidade maxima de anagramas possiveis é: "+ q3.verificaAnagrama(palavra));
        
    }
}
