import java.util.Scanner;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate() {
        this.day = 22;
        this.month = 4;
        this.year = 2023;
    }

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public MyDate(String date) {
        String[] dateArray = date.split("/");
        this.day = Integer.parseInt(dateArray[0]);
        this.month = Integer.parseInt(dateArray[1]);
        this.year = Integer.parseInt(dateArray[2]);
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day < 1 || day > 31) {
            System.out.println("Invalid day");
            return;
        } else {
            this.day = day;
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            System.out.println("Invalid month");
            return;
        } else {
            this.month = month;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void accept() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter date: ");
        String date = keyboard.nextLine();
        String[] dateArray = date.split("/");
        this.day = Integer.parseInt(dateArray[0]);
        this.month = Integer.parseInt(dateArray[1]);
        this.year = Integer.parseInt(dateArray[2]);
    }

    public void print() {
        System.out.println("Date: " + this.day + "/" + this.month + "/" + this.year);
    }
}
