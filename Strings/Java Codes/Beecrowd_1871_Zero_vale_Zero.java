// Name of the problem: Zero vale Zero
// Link: https://www.beecrowd.com.br/judge/pt/problems/view/1871

import java.util.Scanner;
public class Beecrowd_1871_Zero_vale_Zero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int M = input.nextInt(), N = input.nextInt(), soma;
        while(M != 0 && N != 0){
            soma = M + N;
            String somaStr = Integer.toString(soma);
            for (int i=0; i<somaStr.length(); i++) {
                char c = somaStr.charAt(i);
                if (c != '0')
                    System.out.print(c);
            }
            System.out.print('\n');
            M = input.nextInt();
            N = input.nextInt();
        }
    }
}

/*
 * Descrição da Questão
 *
 * QUESTÃO
 * Um dia o Prof. Humberto José Roberto fez o seguinte questionamento: Se o zero
 * a esquerda de um número não tem valor algum, por que teria em outras posições
 * de um número? Analisando da seguinte forma, ele pede sua ajuda para, ao somar
 * dois valores inteiros, que o resultado seja exibido segundo o raciocínio
 * dele, ou seja, sem os Zeros. Por exemplo, ao somar 15 + 5, o resultado seria
 * 20, mas com esta nova ideia, o novo resultado seria 2, e, ao somar 99 + 6, o
 * resultado seria 105, mas com esta nova ideia, o novo resultado seria 15.
 * 
 * Escreva um programa que, dado dois números inteiros, sem o algarismo zero,
 * some os mesmos e, caso o resultado tenha algum algarismo zero, que os retire
 * antes de exibir.
 *
 * * ENTRADA
 * Haverá diversos casos de teste. Cada caso de teste inicia com dois inteiros M
 * e N (1 ≤ M ≤ N ≤ 999.999.999).
 * 
 * O último caso de teste é indicado quando N = M = 0, sendo que este caso não
 * deve ser processado.
 *
 * SAÍDA
 * Para cada caso de teste, imprima o resultado da soma dos dois valores, sem os
 * Zeros.
 *
 * EXEMPLO DE ENTRADA
 * 7 8
 * 15 5
 * 99 6
 * 0 0
 *
 * EXEMPLO DE SAÍDA
 * 15
 * 2
 * 15
 * 
 */