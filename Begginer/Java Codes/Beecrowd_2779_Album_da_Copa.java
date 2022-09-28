// Name of the problem: Álbum da Copa
// Link: https://www.beecrowd.com.br/judge/pt/problems/view/2779

import java.util.Scanner;

// To submit in Beecrowd, rename 'public class Beecrowd_2779_Album_da_Copa' to 'public class Main'
public class Beecrowd_2779_Album_da_Copa {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        input.nextLine(); // esvazia o buffer do teclado
        int M = input.nextInt();
        int[] album = new int[N];

        for (int i = 0; i < M; i++) {
            int X = input.nextInt();
            album[X - 1] += 1;
        }

        int faltam = 0;
        for (int i = 0; i < N; i++) {
            if (album[i] == 0) {
                faltam += 1;
            }
        }
        System.out.println(faltam);

        input.close();
    }
}