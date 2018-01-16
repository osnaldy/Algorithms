import java.util.Scanner;

public class Staircase {

    static void staircase(int n){

        for (int i = 0; i < n; i++){

            for (int j = i; j >= 0; j--) {

                System.out.print("#");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        staircase(n);

        in.close();
    }
}
