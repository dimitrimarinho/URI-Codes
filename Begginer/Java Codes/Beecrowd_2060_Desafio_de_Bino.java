// Name of the problem: Desafio de Bino
// Link: https://www.beecrowd.com.br/judge/pt/problems/view/2060

import java.util.Scanner;

// To submit in Beecrowd, rename 'public class Beecrowd_2060_Desafio_de_Bino' to 'public class Main'
public class Beecrowd_2060_Desafio_de_Bino {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        input.nextLine(); // esvazia o buffer do teclado
        String[] inteiros_Li = input.nextLine().split(" ");

        int multiplos_2 = 0, multiplos_3 = 0, multiplos_4 = 0, multiplos_5 = 0;
        for (int i = 0; i < N; i++) {
            if (Integer.parseInt(inteiros_Li[i]) % 2 == 0) {
                multiplos_2 += 1;
            }
            if (Integer.parseInt(inteiros_Li[i]) % 3 == 0) {
                multiplos_3 += 1;
            }
            if (Integer.parseInt(inteiros_Li[i]) % 4 == 0) {
                multiplos_4 += 1;
            }
            if (Integer.parseInt(inteiros_Li[i]) % 5 == 0) {
                multiplos_5 += 1;
            }
        }

        System.out.println(multiplos_2 + " Multiplo(s) de 2");
        System.out.println(multiplos_3 + " Multiplo(s) de 3");
        System.out.println(multiplos_4 + " Multiplo(s) de 4");
        System.out.println(multiplos_5 + " Multiplo(s) de 5");

        input.close();
    }
}