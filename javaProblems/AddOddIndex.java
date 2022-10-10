package javaProblems;

public class AddOddIndex {

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                sum += arr[i];
                // System.out.println(arr[i]);
            }
        }
        System.out.println(sum);
    }
}
