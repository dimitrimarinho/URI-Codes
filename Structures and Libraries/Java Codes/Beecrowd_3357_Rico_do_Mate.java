// Name of the problem: Rico do Mate
// Link: https://www.beecrowd.com.br/judge/pt/problems/view/3357

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

// To submit in Beecrowd, rename 'public class Beecrowd_3357_Rico_do_Mate' to 'public class Main'
public class Beecrowd_3357_Rico_do_Mate {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US); // Para receber e imprimir numero decimal com "." (ponto) ao invés de ","
        // (vírgula)
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        double L = input.nextDouble() * 10;

        double Q = input.nextDouble() * 10;

        List<String> roda = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String nome = input.next();
            roda.add(nome);
        }

        int aux = 0;

        while (L > Q) {
            L -= Q;

            aux++;

            if(aux == N)
                aux = 0;
        }

        System.out.printf(roda.get(aux));
        System.out.printf(" %.1f\n", L/10);

        input.close();
    }
}

/*
 * Descrição da Questão
 *
 * QUESTÃO
 * A erva-mate (Ilex paraguariensis) é uma planta nativa da América do Sul que é
 * utilizada para a preparação de uma das bebidas mais característica e
 * apreciada em boa parte da região sul do Brasil, o chimarrão. Normalmente
 * consumido de forma compartilhada, os participantes formam uma roda e vão
 * passando a cuia de mão-em-mão: após ingerir o chá de seu interior, um
 * participante da roda de mate enche a cuia e passa para o próximo.
 *
 * Por sua forte presença cultural, existem diversas crenças e lendas associadas
 * à roda de mate, uma delas diz respeito à cuia que leva a última água da
 * garrafa térmica. Segundo a crença, a pessoa mateadora que recebe esta última
 * cuia vai ficar rica, talvez seja uma consolação, pois essa mateadora
 * normalmente recebe menos chá.
 *
 * Sabendo desta crença, uma mateadora ávida em programação decidiu fazer um
 * programa para ajudar a descobrir quem será a rica do mate e o quanto de
 * chimarrão ela vai tomar. Para tanto, ela leva em consideração o volume L de
 * água da térmica, a quantidade Q de água que cabe em uma cuia e as pessoas que
 * formam a roda.
 *
 * ENTRADA *
 * A entrada inicia com o número N (0 < N ≤ 10) de pessoas na roda. Seguida por
 * um ponto flutuante L correspondente a quantidade de litros de água que cabem
 * na garrafa térmica (0.0 < L ≤ 20.0) e a quantidade Q (0.0 < Q < 1.0) de
 * litros de água que cabem na cuia. Na linha seguinte a entrada contém o nome
 * dos participantes, na ordem em que o mate será servido, separados por espaço.
 * Cada nome será fornecido com até 12 caracteres do alfabeto português (26
 * letras). Os valores de L e Q são fornecidos com exatamente uma casa após o
 * ponto decimal.
 *
 * SAÍDA
 * A saída deve imprimir o nome do participante que será o rico do mate e
 * quantidade de água em litros, com exatamente uma casa após o ponto decimal,
 * que ele irá tomar na última cuia.
 */