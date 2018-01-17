import java.util.Scanner;

public class GradingStudents{

    static int[] solve(int[] grades){

        for (int i = 0; i < grades.length; i++){

            int n = (grades[i] / 5 + 1) * 5;

            if (n - grades[i] < 3){

                if (grades[i] < 38){

                    grades[i] = grades[i];
                }

                else{

                    grades[i] = n;
                }
            }
        }

        return grades;
    }

    public static void main(String[]args){

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] grades = new int[n];

        for (int i = 0; i < n; i++){

            grades[i] = in.nextInt();
        }

        int [] result = solve(grades);

        for (int i = 0; i < result.length; i++){

            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println();
    }

}

