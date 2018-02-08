import java.util.Scanner;
/*
Given an array of n integers where each integer describes the type of a bird in the flock,
find and print the type number of the most common bird.
If two or more types of birds are equally common, choose the type with the smallest ID number.*/
public class MigratoryBirds {

    static int migratoryBird(int n, int[] arr){

        int[] newArray = new int[n];

        for (int i = 0; i < arr.length; i++){

            newArray[arr[i] - 1]++;
        }

        int maxValue = newArray[0];

        for (int i = 0; i < newArray.length; i++){

            if (newArray[i] > maxValue){

                maxValue = newArray[i];
                n = i+1;
            }
        }

        return n;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++){

            arr[i] = in.nextInt();
        }

        int result = migratoryBird(n, arr);
        System.out.println("Value of result " + result);
    }
}
