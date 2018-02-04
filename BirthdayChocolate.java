import java.util.Scanner;

/*
Lily has a chocolate bar consisting of a row of n squares where each square has an integer written on it.
She wants to share it with Ron for his birthday, which falls on month m and day d.
Lily wants to give Ron a piece of chocolate only if it contains m consecutive squares whose integers sum to d.
 */

public class BirthdayChocolate {

    static int solve(int n, int[] s, int d, int m){

        int count = 0;
        int numberTotal = 0;

        for (int i = 0; i < n; i++){

            try {

                for (int j = 0; j < m; j++){

                    numberTotal += s[i+j];
                }
            }

            catch (Exception e){
                break;
            }

            if (numberTotal == d){

                count++;
            }

            numberTotal = 0;
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];

        for (int i = 0; i < s.length; i++){

            s[i] = in.nextInt();
        }

        int d = in.nextInt();
        int m = in.nextInt();
        int result = solve(n, s, d, m);
        System.out.println(result);
    }
}
