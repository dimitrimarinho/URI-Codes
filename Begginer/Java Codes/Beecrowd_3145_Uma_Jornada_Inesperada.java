// Name of the problem: Uma Jornada Inesperada
// Link: https://www.beecrowd.com.br/judge/pt/problems/view/3145

import java.util.Locale;    // para utilizar o método Locale.setDefault
import java.util.Scanner;

// To submit in Beecrowd, rename 'public class Beecrowd_3145_Uma_Jornada_Inesperada' to 'public class Main'
public class Beecrowd_3145_Uma_Jornada_Inesperada {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US); // Para imprimir numero decimal com "." (ponto) ao invés de "," (vírgula)
        Scanner input = new Scanner(System.in);
        String[] input_line = input.nextLine().split(" ");
        double N = Integer.parseInt(input_line[0]);
        double X = Integer.parseInt(input_line[1]);

        double quantidade_dias = X/(N+2);
        System.out.format("%.2f%n", quantidade_dias); // %n para quebra de linha simulando o System.out.println();

        input.close();
    }
}