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

public class Factorial {

    public static void main(String[] args) {

        int[] a = {2,4};
        int[] b = {16,32,96};
        int min = a[0];
        int max = b[b.length-1];
        int count = 0;

        for (int i=min; i<=max; i++){

            if (hasFactor(i,a) && isFactor(i,b)){
                count++;
            }
        }

        System.out.println(count);

    }

    static boolean hasFactor(int num, int[] array){

        for (int i=0; i<array.length; i++){

            if (num%array[i] != 0){

                return false;
            }
        }
        return true;
    }

    static boolean isFactor(int num, int[] array){

        for (int i=0; i<array.length; i++){

            if (array[i]%num != 0){

                return false;
            }
        }
        return true;
    }

}
