package javaProblems;

import java.util.Arrays;
public class CopyOfArrayInbuiltFun {
    public static void main(String[] args) {
        
        int arr[] = {10,20,10,40,30,20,50,10,20};
        int x[] = Arrays.copyOf(arr,9);

        for(int i = 0; i<x.length ; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}

/*output
 * 
 * 10 20 10 40 30 20 50 10 20 
 */