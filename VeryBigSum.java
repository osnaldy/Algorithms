import java.util.Scanner;

public class VeryBigSum {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        System.out.println("Enter the amount of numbers you want to sum");
        int n = in.nextInt();

        long array[] = new long[n];
        long total = 0;

        for (int i = 0; i < array.length; i++){

            System.out.println("Enter element No."+ (i+1)+": ");
            array[i] = in.nextLong();
        }

        for (int i = 0; i < array.length; i++){

            total += array[i];
        }

        System.out.println("The Sum of the number is " + total);

    }
}
