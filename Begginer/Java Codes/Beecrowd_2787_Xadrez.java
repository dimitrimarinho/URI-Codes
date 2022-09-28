// Name of the problem: Xadrez
// Link: https://www.beecrowd.com.br/judge/pt/problems/view/2787

import java.util.Scanner;

// To submit in Beecrowd, rename 'public class Beecrowd_2787_Xadrez' to 'public class Main'
public class Beecrowd_2787_Xadrez {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int L = input.nextInt();
        input.nextLine(); // esvazia o buffer do teclado
        int C = input.nextInt();
        if (((L % 2 == 0) && (C % 2 == 0)) || ((L % 2 == 1) && (C % 2 == 1))) {
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }

        input.close();
    }
}