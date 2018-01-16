import java.util.Scanner;

public class CalculateAverageOfArray {

    public static void main(String[] args) {

        double[] numberArray = {20, 20, 20, 20, 20};
        double totalAverage = 0;

        for (int i = 0; i < numberArray.length; i++){

            totalAverage += numberArray[i];
        }

        double avg = totalAverage / numberArray.length;
        System.out.format("The total Average is : %.3f", avg);

        //Enter the numbers of values you would like to get from the user
        System.out.println("Enter the number of values you want to enter");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        double[] arr = new double[n];
        double total = 0;

        for (int j = 0; j < arr.length; j++) {

            System.out.println("Enter element No."+ (j+1)+": ");
            arr[j] = scanner.nextDouble();
        }

        for (int j = 0; j < arr.length; j++){

            total += arr[j];
        }

        double average = total / arr.length;

        System.out.format("The total avg is %.2f", average);

    }
}
