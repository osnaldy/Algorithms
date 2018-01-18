import java.util.Scanner;

public class AppleAndOrange {

    static int[] appleAndOrange(int s, int t, int a, int b, int[] apple, int[] orange){

        int[] valueHolder = new int[2];

        for (int i = 0; i < apple.length; i++){

            if (a + apple[i] >= s && a + apple[i] <= t){

                valueHolder[0]++;
            }
        }

        for (int i = 0; i < orange.length; i++){

            if (b + orange[i] >= s && b + orange[i] <= t){

                valueHolder[1]++;
            }
        }

        return valueHolder;
    }

    public static void main(String[] args) {

        Scanner in =  new Scanner(System.in);

        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();

        int[] apple = new int[m];

        for (int i = 0; i < m; i++){

            apple[i] = in.nextInt();
        }

        int[] orange = new int[n];

        for (int i = 0; i < n; i++){

            orange[i] = in.nextInt();
        }

        int[] result = appleAndOrange(s, t, a, b, apple, orange);

        for (int i = 0; i < result.length; i++){

            System.out.println(result[i]);
        }
    }
}
