import java.util.Scanner;

public class TimeConversion {

    static String timeConversion(String s){

        String stringHolder[] = s.split(":");
        String extension = stringHolder[2].substring(2);
        int holder = Integer.parseInt(stringHolder[0]);

        if (extension.equals("AM")){

            if (Integer.parseInt(stringHolder[0]) == 12) {

                s = "00"+":"+stringHolder[1]+":"+stringHolder[2].substring(0,2);
            }

            else {

                s = stringHolder[0]+":"+stringHolder[1]+":"+stringHolder[2].substring(0,2);
            }

        }

        else {
            if (holder < 12) {
                s = (holder + 12) + ":" + stringHolder[1] + ":" + stringHolder[2].substring(0, 2);
            }

            else {

                s = holder + ":" + stringHolder[1] + ":" + stringHolder[2].substring(0, 2);
            }
        }

        return s;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
