// Name of the problem: Huaauhahhuahau
// Link: https://www.beecrowd.com.br/judge/pt/problems/view/2242

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Beecrowd_2242_Huaauhahhuahau {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sequencia_risada = input.nextLine();

        Character[] vogais = {'a', 'e', 'i', 'o', 'u'};
        List<Character> arl_vogais = new ArrayList<>();
        arl_vogais.addAll(Arrays.asList(vogais));

        List<Character> vogais_esq_dir = new ArrayList<>();

        for (int i = 0; i < sequencia_risada.length(); i++) {
            if (arl_vogais.contains(sequencia_risada.charAt(i)))
                vogais_esq_dir.add(sequencia_risada.charAt(i));
        }

        boolean risada_engracada = true;
        int posicao = 0;
        for(int i = sequencia_risada.length()-1;i>=0;i--){
            if (arl_vogais.contains(sequencia_risada.charAt(i))) {
                if (sequencia_risada.charAt(i) != vogais_esq_dir.get(posicao)) {
                    risada_engracada = false;
                    break;
                }
                posicao+=1;
            }
        }

        System.out.println(risada_engracada == true ? "S" : "N");

    }

}

/*
 * Descrição da Questão
 *
 * QUESTÃO
 * Em chats, é muito comum entre jovens e adolescentes utilizar sequências de
 * letras, que parecem muitas vezes aleatórias, para representar risadas. Alguns
 * exemplos comuns são:
 * 
 * huaauhahhuahau
 * hehehehe
 * ahahahaha
 * jaisjjkasjksjjskjakijs
 * huehuehue
 * 
 * Cláudia é uma jovem programadora que ficou intrigada pela sonoridade das
 * “risadas digitais”. Algumas delas ela nem mesmo consegue pronunciar! Mas ela
 * percebeu que algumas delas parecem transmitir melhor o sentimento da risada
 * que outras. A primeira coisa que ela percebeu é que as consoantes não
 * interferem no quanto as risadas digitais influenciam na transmissão do
 * sentimento. A segunda coisa que ela percebeu é que as risadas digitais mais
 * engraçadas são aquelas em que as sequências de vogais são iguais quando
 * lidas na ordem natural (da esquerda para a direita) ou na ordem inversa (da
 * direita para a esquerda), ignorando as consoantes. Por exemplo, “hahaha” e
 * “huaauhahhuahau” estão entre as risadas mais engraçadas, enquanto
 * “riajkjdhhihhjak” e “huehuehue” não estão entre as mais engraçadas.
 * 
 * Cláudia está muito atarefada com a análise estatística das risadas digitais e
 * pediu sua ajuda para escrever um programa que determine, para uma risada
 * digital, se ela é das mais engraçadas ou não.
 *
 * ENTRADA
 * A entrada é composta por uma linha, contendo uma sequência de no máximo 50
 * caracteres, formada apenas por letras minúsculas sem acentuação. As vogais
 * são as letras ‘a’,‘e’,‘i’,‘o’,‘u’. A sequência contém pelo menos uma vogal.
 *
 * SAÍDA
 * Seu programa deve produzir uma linha contendo um caractere, “S” caso a risada
 * seja das mais engraçadas, ou “N” caso contrário.
 *
 * EXEMPLO DE ENTRADA 1
 * hahaha
 * EXEMPLO DE SAÍDA 1
 * S
 *
 * EXEMPLO DE ENTRADA 2
 * riajkjdhhihhjak
 * EXEMPLO DE SAÍDA 2
 * N
 * 
 * EXEMPLO DE ENTRADA 3
 * a
 * EXEMPLO DE SAÍDA 3
 * S
 *
 * EXEMPLO DE ENTRADA 4
 * huaauhahhuahau
 * EXEMPLO DE SAÍDA 4
 * S
 *
 */