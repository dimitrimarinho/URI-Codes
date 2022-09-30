// Name of the problem: Saída 4
// Link: https://www.beecrowd.com.br/judge/pt/problems/view/2750

// To submit in Beecrowd, rename 'public class Beecrowd_2750_Saida_4' to 'public class Main'
public class Beecrowd_2750_Saida_4 {
    public static void main(String[] args) {

        for (int linha = 1; linha <= 20; linha++) {

            for (int coluna = 1; coluna <= 39; coluna++) {

                if (linha == 1 || linha == 3 || linha == 20)
                    System.out.printf("-");

                else if (coluna == 1 || coluna == 13 || coluna == 23 || coluna == 39)
                    System.out.printf("|");

                else if (linha == 2) {

                    if (coluna == 4)
                        System.out.print("decimal");
                    else if (coluna == 16)
                        System.out.print("octal");
                    else if (coluna == 26)
                        System.out.print("Hexadecimal");
                    else if (coluna < 4 || coluna > 36 || (coluna > 10 && coluna < 18) || (coluna > 21 && coluna < 26))
                        System.out.print(" ");

                }

                else {
                    if (coluna == 8)
                        System.out.print(Integer.toString(linha - 4));
                    else if (coluna == 18)
                        System.out.print(Integer.toOctalString(linha - 4));
                    else if (coluna == 31)
                        System.out.print(Integer.toHexString(linha - 4).toUpperCase());
                    else if (!(linha > 11) || (linha >= 11 && linha <= 13 && coluna != 14)
                            || (linha >= 14 && coluna > 2 && coluna != 14))
                        System.out.print(" ");
                }

            }
            System.out.print("\n");
        }

    }
}

/* Descrição da Questão
 
 QUESTÃO
    O seu professor de programação gostaria que você fizesse um programa com as seguintes características:

    Criar 16 variáveis inteiras;
    Atribuir a elas valores de 0 a 15 a cada um das variáveis anteriores;
    Ter 39 traços (-) na primeira linha;
    Ter uma | embaixo do primeiro traço, décimo terceiro, vigésimo terceiro e do trigésimo nono traço da primeira linha, embaixo do 4° traço deve começar a escrever “decimal”, embaixo do 16° traço deve começar a escrever “octal”, embaixo do 26° traço deve começar a escrever “Hexadecimal” e o restante preencher com espaço em branco;
    Repita o procedimento 1;
    Ter uma | embaixo do primeiro traço, décimo terceiro, vigésimo terceiro e do trigésimo nono traço da primeira linha, embaixo do 8° traço deve imprimir o valor da primeira variável em valor decimal, embaixo do 18° traço deve imprimir o valor da primeira variável em valor octal, embaixo do 31° traço deve imprimir o valor da primeira variável em valor hexadecimal e o restante preencher com espaço em branco;
    Repita o procedimento 6 para as outras 15 variáveis;
    Repita o procedimento 1.
    No final deve ficar igual a imagem a seguir:
 
--------------------------------------- (39 traços)
| decimal   |  octal  |  Hexadecimal  |
---------------------------------------
|      0    |    0    |       0       |
|      1    |    1    |       1       |
|      2    |    2    |       2       |
|      3    |    3    |       3       |
|      4    |    4    |       4       |
|      5    |    5    |       5       |
|      6    |    6    |       6       |
|      7    |    7    |       7       |
|      8    |   10    |       8       |
|      9    |   11    |       9       |
|     10    |   12    |       A       |
|     11    |   13    |       B       |
|     12    |   14    |       C       |
|     13    |   15    |       D       |
|     14    |   16    |       E       |
|     15    |   17    |       F       |
--------------------------------------- (39 traços)
Entrada
Não há.

Saída
A saída será impressa conforme a figura acima.
*/