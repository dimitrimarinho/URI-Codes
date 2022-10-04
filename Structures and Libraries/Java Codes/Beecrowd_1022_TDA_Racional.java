// Name of the problem: TDA Racional
// Link: https://www.beecrowd.com.br/judge/pt/problems/view/1022

import java.util.Scanner;

// To submit in Beecrowd, rename 'public class Beecrowd_1022_TDA_Racional' to 'public class Main'
public class Beecrowd_1022_TDA_Racional {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        input.nextLine(); // esvazia o buffer do teclado

        for(int i = 0; i < N; i++){

            int N1 = input.nextInt();
	        char barra1 = input.next().charAt(0);
	        int D1 = input.nextInt();
			
	        char operacao = input.next().charAt(0);
			
	        int N2 = input.nextInt();
	        char barra2 = input.next().charAt(0);
	        int D2 = input.nextInt();
            
            input.nextLine(); // esvazia o buffer do teclado
			
            int result_N1 = 0;
            int result_D1 = 0;
            if(operacao == '+' || operacao == '-'){
                if(operacao == '+')
                    result_N1 = (N1*D2 + N2*D1);
                else
                    result_N1 = (N1*D2 - N2*D1);

                result_D1 = (D1*D2);
            }

            else if(operacao == '*'){
                result_N1 = (N1*N2);
                result_D1 = (D1*D2);
            }

            else if(operacao == '/'){
                result_N1 = (N1*D2);
                result_D1 = (N2*D1);
            }
    
            int result_N2 = result_N1;
            int result_D2 = result_D1;
            for(int divisor = 2; divisor < 1000; divisor++){       
                if(divisor > Math.abs(result_N1) || divisor > Math.abs(result_D1))
                    break;
                else
                    if(result_N1 % divisor == 0 && result_D1 % divisor == 0){
                        result_N2 = result_N1/divisor;
                        result_D2 = result_D1/divisor;
                    }
            }

            String resultado = Integer.toString(result_N1) + "/" + Integer.toString(result_D1);
            String resultado2 = Integer.toString(result_N2) + "/" + Integer.toString(result_D2);
            String print_result = resultado + " = " + resultado2;
            System.out.println(print_result);          
            
        }

        input.close();
    }
}

/*
 * Descrição da Questão
 * 
 * QUESTÃO
 * A tarefa aqui neste problema é ler uma expressão matemática na forma de dois
 * números Racionais (numerador / denominador) e apresentar o resultado da
 * operação. Cada operando ou operador é separado por um espaço em branco. A
 * sequência de cada linha que contém a expressão a ser lida é: número,
 * caractere, número, caractere, número, caractere, número. A resposta deverá
 * ser apresentada e posteriormente simplificada. Deverá então ser apresentado o
 * sinal de igualdade e em seguida a resposta simplificada. No caso de não ser
 * possível uma simplificação, deve ser apresentada a mesma resposta após o
 * sinal de igualdade.
 * 
 * Considerando N1 e D1 como numerador e denominador da primeira fração, segue a
 * orientação de como deverá ser realizada cada uma das operações:
 * Soma: (N1*D2 + N2*D1) / (D1*D2)
 * Subtração: (N1*D2 - N2*D1) / (D1*D2)
 * Multiplicação: (N1*N2) / (D1*D2)
 * Divisão: (N1/D1) / (N2/D2), ou seja (N1*D2)/(N2*D1)
 * 
 * ENTRADA *
 * A entrada contem vários casos de teste. A primeira linha de cada caso de
 * teste contem um inteiro N (1 ≤ N ≤ 1*104), indicando a quantidade de casos de
 * teste que devem ser lidos logo a seguir. Cada caso de teste contém um valor
 * racional X (1 ≤ X ≤ 1000), uma operação (-, +, * ou /) e outro valor racional
 * Y (1 ≤ Y ≤ 1000).
 * 
 * SAÍDA
 * A saída consiste em um valor racional, seguido de um sinal de igualdade e
 * outro valor racional, que é a simplificação do primeiro valor. No caso do
 * primeiro valor não poder ser simplificado, o mesmo deve ser repetido após o
 * sinal de igualdade.
 */
