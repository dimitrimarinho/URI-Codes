// Name of the problem: Tempo do Duende
// Link: https://www.beecrowd.com.br/judge/pt/problems/view/2717

import java.util.Scanner;

// To submit in Beecrowd, rename 'public class Beecrowd_2717_Tempo_do_Duende' to 'public class Main'
public class Beecrowd_2717_Tempo_do_Duende {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        input.nextLine(); // esvazia o buffer do teclado
        String[] input_line = input.nextLine().split(" ");
        int A = Integer.parseInt(input_line[0]), B = Integer.parseInt(input_line[1]);

        System.out.println((A+B) <= N ? "Farei hoje!" : "Deixa para amanha!");            

        input.close();
    }
}