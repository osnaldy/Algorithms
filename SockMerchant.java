import java.util.Scanner;

public class SockMerchant {

    static int sockMerchat(int n, int[] ar) {

        int count = 0;

        for (int i = 0; i < ar.length-1; i++){

            for (int j = 0; j < ar.length-1-i; j++){

                if (ar[j] > ar[j+1]){

                    int temp = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < n - 1; i++) {

            if (ar[i] == ar[i+1]){
                count++;
                i++;
            }
        }

        return count;
    }

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] ar = new int[n];

        for (int i = 0; i < ar.length; i++){

            ar[i] = in.nextInt();
        }

        int result = sockMerchat(n, ar);
        System.out.println(result);
    }
}
