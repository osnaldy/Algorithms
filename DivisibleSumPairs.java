import java.util.Scanner;

public class DivisibleSumPairs {

    static int divisibleSumPairs(int n, int k, int[] ar){

        int count = 0;

        for (int i = 0; i < n; i++){

            for (int j = 1; j < n; j++){

                if (i < j){

                    if ((ar[i]+ar[j]) % k == 0){

                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];

        for (int i = 0; i < ar.length; i++){

            ar[i] = in.nextInt();
        }

        int result = divisibleSumPairs(n, k, ar);
        System.out.println(result);

    }
}
