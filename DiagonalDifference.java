import java.util.Scanner;

public class DiagonalDifference {

    static int diagonalDifference(int[][] a) {

        int absoluteDifference;
        int primaryDiagonal = 0;
        int secondaryDiagonal = 0;

        for (int i = 0; i < a.length; i++){

            primaryDiagonal += a[i][i];
        }

        for (int i = a.length - 1; i >= 0; i--) {

            secondaryDiagonal += a[a.length - 1 - i][i];
        }

        absoluteDifference = primaryDiagonal - secondaryDiagonal;
        absoluteDifference = Math.abs(absoluteDifference);

        return absoluteDifference;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++){

            for (int j = 0; j < n; j++){

                array[i][j] = in.nextInt();
            }
        }

        int result = diagonalDifference(array);
        System.out.println(result);
        in.close();


    }
}
