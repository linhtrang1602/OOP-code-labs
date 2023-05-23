package Lab02;

import java.util.Scanner;

public class SortNumericArray {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please input the number of elements: ");
        int iNum = keyboard.nextInt();
        int[] iArray = new int[iNum];
        int iSum = 0;
        for (int i = 0; i < iNum; i++) {
            System.out.println("Please input the " + (i + 1) + "th element: ");
            iArray[i] = keyboard.nextInt();
            iSum += iArray[i];
        }
        for (int i = 0; i < iNum - 1; i++) {
            for (int j = 0; j < iNum - i - 1; j++) {
                if (iArray[j] > iArray[j + 1]) {
                    int iTemp = iArray[j];
                    iArray[j] = iArray[j + 1];
                    iArray[j + 1] = iTemp;
                }
            }
        }
        System.out.println("The sorted array is: ");
        for (int i = 0; i < iNum; i++) {
            System.out.print(iArray[i] + " ");
        }
        System.out.println();
        System.out.println("The sum is: " + iSum);
        System.out.println("The average is: " + (double)iSum / iNum);
    }
}
