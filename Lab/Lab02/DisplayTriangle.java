package Lab02;

import java.util.Scanner;

public class DisplayTriangle {
    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please input the number of rows: ");
        int iNum = keyboard.nextInt();
        for (int i = 1; i <= iNum; i++) {
            System.out.println(" ".repeat(iNum - i) + "*".repeat(i * 2 - 1));
        }
    }
}
