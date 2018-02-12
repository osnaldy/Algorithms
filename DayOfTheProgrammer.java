import java.util.Scanner;

/*Marie invented a Time Machine and wants to test it by time-traveling to visit Russia on the Day of the Programmer (the 256th day of the year)
during a year in the inclusive range from 1700 to 2700.*/

/*Given a year, y, find the date of the 256th day of that year according to the official Russian calendar during that year.
Then print it in the format dd.mm.yyyy, where dd is the two-digit day, mm is the two-digit month, and yyyy is y.*/

public class DayOfTheProgrammer {

    static String solve(int year) {

        String holdVale;
        int feb = 0;
        int[] daysArray = {31, feb, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int dayHolder = 0;
        int month = 0;
        int totalSum = 0;
        int dayOfTheProgrammer = 256;

        if (year == 1918){

            daysArray[1] = 15;
        }

        else if ((year <= 1917) && (year%4 == 0) || ((year%400 == 0) || ((year%4 ==0) && (year%100 != 0)))){

            daysArray[1] = 29;
        }

        else {

            daysArray[1] = 28;
        }

            for (int i = 0; i < daysArray.length; i++) {

                if (daysArray[i] + totalSum <= dayOfTheProgrammer) {

                    totalSum += daysArray[i];
                    month++;
                    dayHolder = daysArray[i];
                }
            }

        if (dayOfTheProgrammer % totalSum != 0) {

            month++;
            dayHolder = dayOfTheProgrammer % totalSum;
        }

        if (month < 10 && dayHolder < 10){

            holdVale = "0" + dayHolder + "." + "0" +  month + "." + year;
        }

        else if (month < 10){

            holdVale = dayHolder + "." + "0" +  month + "." + year;
        }

        else if (dayHolder < 10){

            holdVale = "0" + dayHolder + "." +  month + "." + year;
        }

        else {

            holdVale = dayHolder + "." +  month + "." + year;
        }

        return holdVale;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = solve(year);
        System.out.println(result);
    }

}