// Name of the problem: Tomadas
// Link: https://www.beecrowd.com.br/judge/pt/problems/view/1930

import java.util.Scanner;

// To submit in Beecrowd, rename 'public class Beecrowd_1930_Tomadas' to 'public class Main'
public class Beecrowd_1930_Tomadas {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] tomadas = input.nextLine().split(" ");
        int T1 = Integer.parseInt(tomadas[0]), T2 = Integer.parseInt(tomadas[1]), T3 = Integer.parseInt(tomadas[2]), T4 = Integer.parseInt(tomadas[3]);

        int num_max_conectados = (T1+T2+T3+T4)-3;
        System.out.println(num_max_conectados);

        input.close();
    }
}