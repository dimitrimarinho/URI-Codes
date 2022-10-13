// Name of the problem: Árvore de Natal
// Link: https://www.beecrowd.com.br/judge/pt/problems/view/1768

import java.io.IOException;
import java.util.Scanner;

// To submit in Beecrowd, rename 'Beecrowd_1768_Arvore_de_Natal' to 'public class Main'
public class Beecrowd_1768_Arvore_de_Natal {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            int N = input.nextInt(), cont = N;
            int blankspace = (((N + 1) / 2) - 1), middle_ast = blankspace, asterisks = 1, final_asterisk = 1;
            while (cont > 1) {
                if (asterisks <= N) {
                    for (int i = 0; i < blankspace; i++)
                        System.out.print(" ");
                    blankspace -= 1;
                    for (int idx = 0; idx < asterisks; idx++)
                        System.out.print("*");
                    asterisks += 2;
                    System.out.print("\n");
                    cont -= 1;
                } else {
                    if (final_asterisk <= 3) {
                        for (int i = 0; i < middle_ast; i++)
                            System.out.print(" ");
                        middle_ast -= 1;
                        for (int idx = 0; idx < final_asterisk; idx++)
                            System.out.print("*");
                        final_asterisk += 2;
                        System.out.print("\n");
                    } else {
                        System.out.print("\n");
                        break;
                    }
                }
            }
        }
    }
}

/*
 * Descrição da Questão
 *
 * QUESTÃO
 * As crianças adoram desenhar árvores de natal e você desafiou algumas delas a
 * desenharem árvores de diversos tamanhos com apenas com o caractere asterisco
 * "*".
 * 
 * A regra é simples. De baixo para cima, o tronco da árvore consiste de 3
 * asteriscos e depois 1. Em seguida vem o restante da árvore, com cada fileira
 * de folhas iniciando no tamanho que você determinou e diminuindo de dois em
 * dois, até chegar na copa da árvore que terá apenas um asterisco. Note que
 * para isso dar certo, somente será permitido tamanhos ímpares para estas
 * árvores.
 * 
 * * ENTRADA
 * A entrada contém vários casos de teste e termina com EOF. Cada caso de teste
 * consiste em um inteiro N (2 < N < 100).
 *
 * SAÍDA
 * Para cada caso de teste de entrada, seu programa deverá desenhar uma árvore
 * conforme especificação acima e exemplo abaixo, com uma linha em branco após
 * cada árvore.
 * 
 * EXEMPLO DE ENTRADA
 * 9
 * 5
 * 
 * EXEMPLO DE SAÍDA
    *
   ***
  *****
 *******
*********
    *
   ***

  *
 ***
*****
  *
 ***
 
 */