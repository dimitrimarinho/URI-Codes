// Name of the problem: Inseto!
// Link: https://www.beecrowd.com.br/judge/pt/problems/view/2862

import java.util.Scanner;

// To submit in Beecrowd, rename 'public class Beecrowd_2862_Inseto' to 'public class Main'
public class Beecrowd_2862_Inseto {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int C = input.nextInt();
        input.nextLine(); // esvazia o buffer do teclado

        for (int n_energia = 0; n_energia < C; n_energia++){
            int N = input.nextInt();
            input.nextLine(); // esvazia o buffer do teclado
            if(N > 8000)
                System.out.println("Mais de 8000!");
            else
                System.out.println("Inseto!");
        }

        input.close();
    }
}

/*
 * Descrição da Questão
 * 
 * QUESTÃO
 * Devita é o príncipe dos Calsadins. Juntamente com Pana, eles vão atrás de
 * Tataroko, o nome de nascimento de Kogu,
 * para tentar dominar o mundo. Ele possui um rastreador que mede o nível de
 * energia de qualquer ser vivo.
 * Todos os seres com o nível menor ou igual a 8000, ele considera como se fosse
 * um inseto.
 * Quando passa deste valor, que foi o caso de Kogu, ele se espanta e grita
 * “Mais de 8000”.
 * Baseado nisso, utilize a mesma tecnologia e analise o nível de energia dos
 * seres vivos.
 * 
 * ENTRADA
 * 
 * A entrada é composta por vários casos de teste.
 * A primeira linha contém um número inteiro C relativo ao número de casos de
 * teste.
 * Em seguida, haverá C linhas, com um número inteiro N (100 <= N <= 100000)
 * relativo ao nível de energia de um ser vivo.
 * 
 * SAÍDA
 * 
 * Para cada valor lido, imprima o texto correspondente.
 */
