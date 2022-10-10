package javaProblems;

public class AddEvenAndOddIndex {
    public static void main(String[] args) {
        int evenSum = 0;
        int oddSum = 0;
        int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                oddSum += arr[i];
            } else  {
                evenSum += arr[i];
            }
        }
        System.out.println("Even Sum= "+  evenSum);
        System.out.println("Odd Sum= "+ oddSum);
    }
}
