/*Consider two sets of positive integers, A and B. We say that a positive integer, x , is between sets A and B if the following conditions are satisfied:

All elements in x are factors of .
x is a factor of all elements in .
In other words, some  is between  and  if that value of  satisfies  for every  in  and also satisfies  for every  in . For example, if  and , then our possible  values are and .

Given A and B, find and print the number of integers (i.e., possible 's) that are between the two sets.

Input Format

The first line contains two space-separated integers describing the respective values of N (the number of elements in set A) and B (the number of elements in set B).
The second line contains  distinct space-separated integers describing A.
The third line contains  distinct space-separated integers describing B.
*/

import java.util.Scanner;

public class TwoSets {

    static int gcd(int a, int b){

        if (a == 0)
            return b;
        return gcd(b%a, a);
    }

    static int findGCD(int[] array, int n){

        int result = array[0];

        for (int i = 1; i < n; i++)
            result = gcd(array[i], result);
        return result;
    }

    static int lcm(int a, int b){

        return a * (b / gcd(a, b));
    }

    static int findLCM(int[] array, int n){

        int result = array[0];

        for (int i = 1; i < n; i++)
            result = lcm(array[i], result);
        return result;
    }

    static int getTotalX(int[] a, int[] b){

        int count = 0;

        int n1 = a.length;
        int n2 = b.length;

        int startPoint = findLCM(a, n1);
        int endPoint = findGCD(b, n2);

        for (int i = startPoint, j = 2; i <= endPoint; i = startPoint * j, j++){

            if (endPoint % i == 0){

                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int[] a = new int[n];
        int[] b = new int[m];

        for (int i = 0; i < a.length; i++){

            a[i] = in.nextInt();
        }

        for (int i = 0; i < b.length; i++){

            b[i] = in.nextInt();
        }

        int total = getTotalX(a, b);
        System.out.println(total);
        in.close();
    }
}
