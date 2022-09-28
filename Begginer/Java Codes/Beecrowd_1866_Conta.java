// Name of the problem: Conta
// Link: https://www.beecrowd.com.br/judge/pt/problems/view/1866

import java.util.Scanner;

// To submit in Beecrowd, rename 'public class Beecrowd_1866_Conta' to 'public class Main'
public class Beecrowd_1866_Conta {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int C = input.nextInt();

        for(int i = 0; i < C; i++){
            int test_case = input.nextInt();
            System.out.println(test_case % 2 == 1 ? "1" : "0");            
        }

        input.close();
    }
}