import java.util.Scanner;

public class DrawingBooks {

    static int solve(int n, int p){

        int right = p / 2;
        int left = n / 2 - p / 2;

        return Math.min(right, left);
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int p = in.nextInt();
        int result = solve(n, p);
        System.out.println(result);
    }
}
