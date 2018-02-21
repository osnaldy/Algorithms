import java.util.Scanner;

public class BonAppetit {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int numberOfItems = in.nextInt();
        int kthAnnaItem = in.nextInt();
        int[] costOfItem = new int[numberOfItems];

        int total = 0;
        int actualPrice;

        for (int i = 0; i < costOfItem.length; i++){
            costOfItem[i] = in.nextInt();
        }

        for (int i = 0; i < costOfItem.length; i++){
            if (kthAnnaItem == i){
                continue;
            }
            total+=costOfItem[i];
        }

        int costAnna = in.nextInt();
        actualPrice = costAnna - (total/2);
        if (actualPrice > 0){
            System.out.println(actualPrice);
        }
        else {

            System.out.println("Bon Appetit");
        }

    }
}
