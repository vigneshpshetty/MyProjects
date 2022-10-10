// WAP to count the frequency of number

package javaProblems;

public class CountOfEachNumber {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 8, 3, 2, 2, 2, 5, 1 };

        for (int i = 0; i <= arr.length - 1; i++) {
            int x = arr[i];
            if(x == -1) continue;
            int count = 0;
            for (int j = 0; j <= arr.length - 1; j++) {
                if (arr[j] == x ) {
                    count ++;
                    arr[j]=-1; 
                }

            }     
            System.out.println("Frequency of "+x+" is : "+ count);
        }
    }
}
