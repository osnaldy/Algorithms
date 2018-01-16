import java.util.Scanner;

public class BirthdayCakeCandles {

    static int birthdayCakecCandles(int n, int[] ar){

        int totalNumberOfCandles = 0;
        int tallerCandle =  0;

        for (int i = 0; i < n; i++){

            if (ar[i] > tallerCandle){

                tallerCandle = ar[i];
            }
        }

        for (int j = 0; j < n; j++){

            if (ar[j] == tallerCandle){
                totalNumberOfCandles++;
            }
        }

        return totalNumberOfCandles;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] ar = new int[n];

        for (int i = 0; i < ar.length; i++){

            ar[i] = in.nextInt();
        }

        int result = birthdayCakecCandles(n, ar);
        System.out.println(result);
    }
}
