import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MinMaxSum {

    static void minmaxsum(int[] n){

        long minSum = 0;
        long maxSum = 0;

        Arrays.sort(n);

        for (int i = 0; i < n.length - 1; i++){

            minSum += n[i];
        }

        for (int i = 1; i < n.length; i++){

            maxSum += n[i];
        }

        System.out.println(minSum + " " + maxSum);
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++){

            arr[i] = in.nextInt();
        }

        minmaxsum(arr);
    }
}
