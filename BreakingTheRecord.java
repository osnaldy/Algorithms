import java.util.Scanner;

public class BreakingTheRecord {

    static int[] breakingRecord(int[] score){

        int[] highAndLow = new int[2];
        int highScore = score[0];
        int lowScore = score[0];

        for (int i = 0; i<score.length; i++){

            System.out.println("Value inside the loop " + score[i]);

            if (score[i] < lowScore) {

                lowScore = score[i];
                highAndLow[1]++;
            }

            else if (score[i] > highScore){

                highScore = score[i];
                highAndLow[0]++;
            }

        }
        return highAndLow;
    }


    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] score = new int[n];

        for (int i = 0; i < score.length; i++){

            score[i] = in.nextInt();
        }

        int[] result = breakingRecord(score);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");

        in.close();

    }
}
