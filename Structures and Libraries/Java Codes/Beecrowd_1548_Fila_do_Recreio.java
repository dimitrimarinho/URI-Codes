// Name of the problem: Fila do Recreio
// Link: https://www.beecrowd.com.br/judge/pt/problems/view/1548

import java.util.*;

// To submit in Beecrowd, rename 'public class Beecrowd_1548_Fila_do_Recreio' to 'public class Main'
public class Beecrowd_1548_Fila_do_Recreio {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        for (int i = 0; i < N; i++){
            int M = input.nextInt();

            List<Integer> notasMatematica_ordenada = new ArrayList<Integer>();
            List<Integer> notasMatematica = new ArrayList<Integer>();
            for (int idx = 0; idx < M; idx++){
                int P = input.nextInt();
                notasMatematica.add(P);
                notasMatematica_ordenada.add(P);
            }
            Collections.sort(notasMatematica_ordenada, Collections.reverseOrder());

            int nao_precisaram_trocar = 0;
            for (int idx = 0; idx < M; idx++){
                if(Integer.toString(notasMatematica.get(idx)).equals(Integer.toString(notasMatematica_ordenada.get(idx)))) {
                    nao_precisaram_trocar += 1;
                }
            }
            System.out.println(nao_precisaram_trocar);

        }

        input.close();
    }

}

/*
 * Descrição da Questão
 *
 * QUESTÃO
 * Na escola onde você estuda, a hora do recreio é a mais aguardada pela grande
 * maioria dos alunos. Não só porque as vezes as aulas são cansativas, mas sim
 * porque a merenda servida é muito boa, preparada por um chefe italiano muito
 * caprichoso.
 * 
 * Quando bate o sinal para a hora do recreio, todos os alunos saem correndo da
 * sua sala para chegar o mais cedo possível na cantina, tanta é a vontade de
 * comer. Um de seus professores notou, porém, que havia ali uma oportunidade.
 * 
 * Utilizando um sistema de recompensa, seu professor de matemática disse que a
 * ordem da fila para se servir será dada não pela ordem de chegada, mas sim
 * pela soma das notas obtidas em sala de aula. Assim, aqueles com maior nota
 * poderão se servir antes daqueles que tem menor nota.
 * 
 * Sua tarefa é simples: dada a ordem de chegada dos alunos na cantina, e as
 * suas respectivas notas na matéria de matemática, reordene a fila de acordo
 * com as notas de matemática, e diga quantos alunos não precisaram trocar de
 * lugar nessa reordenação.
 *
 * ENTRADA *
 * A primeira linha contém um inteiro N, indicando o número de casos de teste a
 * seguir.
 * 
 * Cada caso de teste inicia com um inteiro M (1 ≤ M ≤ 1000), indicando o número
 * de alunos. Em seguida haverá M inteiros distintos Pi (1 ≤ Pi ≤ 1000), onde o
 * i-ésimo inteiro indica a nota do i-ésimo aluno.
 * 
 * Os inteiros acima são dados em ordem de chegada, ou seja, o primeiro inteiro
 * diz respeito ao primeiro aluno a chegar na fila, o segundo inteiro diz
 * respeito ao segundo aluno, e assim sucessivamente.
 *
 * SAÍDA
 * Para cada caso de teste imprima uma linha, contendo um inteiro, indicando o
 * número de alunos que não precisaram trocar de lugar mesmo após a fila ser
 * reordenada.
 */
