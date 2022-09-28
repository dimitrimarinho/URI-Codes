// Name of the problem: Piso da Escola
// Link: https://www.beecrowd.com.br/judge/pt/problems/view/2786

import java.util.Scanner;

// To submit in Beecrowd, rename 'public class Beecrowd_2786_Piso_da_Escola' to 'public class Main'
public class Beecrowd_2786_Piso_da_Escola {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int L = input.nextInt();
        input.nextLine(); // esvazia o buffer do teclado
        int C = input.nextInt();
        int tipo1, tipo2;
 
        tipo1 = (C*L) + (C-1) * (L-1);
        tipo2 = ((L-1) + (C-1))*2;  
        
        System.out.println(tipo1);
        System.out.println(tipo2);

        input.close();
    }
}