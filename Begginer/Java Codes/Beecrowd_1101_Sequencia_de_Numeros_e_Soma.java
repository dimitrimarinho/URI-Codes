// Name of the problem: Sequência de Números e Soma
// Link: https://www.beecrowd.com.br/judge/pt/problems/view/1101

import java.util.Scanner;

// To submit in Beecrowd, rename 'public class Beecrowd_1101_Sequencia_de_Numeros_e_Soma' to 'public class Main'
public class Beecrowd_1101_Sequencia_de_Numeros_e_Soma {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int M = input.nextInt();
        int N = input.nextInt();
        int aux;

        while (M > 0 && N > 0) {

            if(N > M){
                aux = N;
                N = M;
                M = aux;
            }

            int sum = 0;
            for (int i = N; i <= M; i++) {
                System.out.printf("%d ", i);
                sum += i;
            }
            System.out.printf("Sum=%d%n", sum);
            M = input.nextInt();

            N = input.nextInt();
        }

        input.close();
    }
}

/*
 * Descrição da Questão
 *
 * QUESTÃO
 * Leia um conjunto não determinado de pares de valores M e N (parar quando
 * algum dos valores for menor ou igual a zero). Para cada par lido, mostre a
 * sequência do menor até o maior e a soma dos inteiros consecutivos entre eles
 * (incluindo o N e M).
 *
 * ENTRADA *
 * O arquivo de entrada contém um número não determinado de valores M e N.
 * A última linha de entrada vai conter um número nulo ou negativo.
 *
 * SAÍDA
 * Para cada dupla de valores, imprima a sequência do menor até o maior e a soma
 * deles, conforme exemplo abaixo.
 * 
 * 
 * EXEMPLO DE ENTRADA
 * 5 2
 * 6 3
 * 5 0
 * 
 * EXEMPLO DE SAÍDA
 * 2 3 4 5 Sum=14
 * 3 4 5 6 Sum=18
 *
 */