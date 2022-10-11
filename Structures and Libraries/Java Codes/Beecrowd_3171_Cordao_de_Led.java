// Name of the problem: Cordão de Led
// Link: https://www.beecrowd.com.br/judge/pt/problems/view/3171

import java.util.Scanner;

// To submit in Beecrowd, rename 'public class Beecrowd_3171_Cordao_de_Led' to 'public class Main'
public class Beecrowd_3171_Cordao_de_Led {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N, L, X, Y, posi_vet = 0, soma = 0;
        N = input.nextInt();
        L = input.nextInt();
        int ligacoes[] = new int[N];
        for (int i = 0; i < L; i++) {
            X = input.nextInt();
            Y = input.nextInt();
            ligacoes[X-1]--;   // Colocando contagem de ligação, as pontas precisam fechar, logo transformando em contagem de pontos,
            ligacoes[Y-1]++;     // (uma ponta sendo positiva e a outra negativa) a soma final (somente a final) deve ser igual a 0. (Para fechar o círculo e não sobrar ligação sobressalente)
        }

        while(posi_vet < N - 1){
            soma += ligacoes[posi_vet++];
            if (soma == 0){
                break;
            }
        }

        System.out.println(((posi_vet == N - 1) ? "COMPLETO" : "INCOMPLETO"));

    }
}

/*
 * Descrição da Questão
 *
 * QUESTÃO
 * Mariazinha quer montar sua árvore de Natal com os cordões de led comprados no
 * ano passado. O problema é que sua irmã caçula acabou cortando estes cordões
 * em vários pedaços.
 * 
 * Mariazinha quer saber se após unir estes pedaços (enumerados com uma etiqueta
 * por ela de 1 até N) o cordão está totalmente unido ou não, pois se faltar
 * unir algum dos segmentos, as luzes do cordão de led não irão funcionar.
 * 
 * Escreva um programa que, dada uma série de ligações entre segmentos de
 * cordões de led, indique se o cordão estará Completo ou Incompleto.
 *
 * ENTRADA *
 * A primeira linha da entrada contém dois inteiros N e L, indicando o número de
 * segmentos de cordão de Led e o número de ligações efetuadas (1 ≤ N ≤ 100, 1 ≤
 * L ≤ 100). Os números de cada um dos N segmentos, inicialmente, são os
 * inteiros de 1 até N.
 * 
 * Cada uma das L linhas seguintes irá conter 2 números X e Y, indicando que
 * Mariazinha está ligando estes 2 segmentos (X e Y). As ligações serão sempre
 * realizadas entre pedaços de cordões de led diferentes.
 *
 * SAÍDA
 * Seu programa deve imprimir a mensagem 'COMPLETO' indicando que os segmentos
 * de cordão de led foram todos unidos ou 'INCOMPLETO' no caso de algum
 * segmento daquele cordão não ter sido ligado.
 * 
 * EXEMPLO DE ENTRADA 1
 * 4 3
 * 1 2
 * 1 3
 * 2 4
 * 
 * EXEMPLO DE SAÍDA 1
 * COMPLETO
 * 
 * EXEMPLO DE ENTRADA 2
 * 6 4
 * 1 2
 * 3 4
 * 5 6
 * 2 3
 * 
 * EXEMPLO DE SAÍDA 2
 * INCOMPLETO
 * 
 */