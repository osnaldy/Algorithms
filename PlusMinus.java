import java.util.Scanner;

public class PlusMinus {

    static void plusMinus(int[] arr){

        float positive = 0;
        float negative = 0;
        float zeroes = 0;

        for (int i = 0; i < arr.length; i++){

            if (arr[i] < 0){
                negative++;
            }

            if (arr[i] == 0){

                zeroes++;
            }

            if (arr[i] > 0){

                positive++;
            }
        }

        positive = positive / arr.length;
        negative = negative / arr.length;
        zeroes = zeroes / arr.length;

        System.out.printf("%.6f\n", positive);
        System.out.printf("%.6f\n", negative);
        System.out.printf("%.6f\n", zeroes);
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++){

            arr[i] = in.nextInt();
        }

        plusMinus(arr);
        in.close();
    }
}
