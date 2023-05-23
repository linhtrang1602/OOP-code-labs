package Lab02;

import java.util.Scanner;

public class DaysOfMonth {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please input the month: ");
        int iMonth = keyboard.nextInt();
        while(iMonth < 1 || iMonth > 12) {
            System.out.println("Invalid month. Please input again: ");
            iMonth = keyboard.nextInt();
        }
        System.out.println("Please input the year: ");
        int iYear = keyboard.nextInt();
        while(iYear < 1) {
            System.out.println("Invalid year. Please input again: ");
            iYear = keyboard.nextInt();
        }
        int iDays = 0;
        switch(iMonth) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                iDays = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                iDays = 30;
                break;
            case 2:
                if (iYear % 4 == 0 && iYear % 100 != 0 || iYear % 400 == 0) {
                    iDays = 29;
                } else {
                    iDays = 28;
                }
                break;
        }
        System.out.println("There are " + iDays + " days in " + iMonth + "/" + iYear);
    }
}
