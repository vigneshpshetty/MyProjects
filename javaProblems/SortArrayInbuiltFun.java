package javaProblems;
import java.util.Arrays;

public class SortArrayInbuiltFun {
    public static void main(String[] args) {
        
        int a[] = {10,20,10,40,30,20,50,10,20};
        Arrays.sort(a);

        for(int i = 0; i<a.length ; i++){
            System.out.print(a[i]+ " ");
        }
    }
}

/*
 * output
 * 
 * 10 10 10 20 20 20 30 40 50 
 */
