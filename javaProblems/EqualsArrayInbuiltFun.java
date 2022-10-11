package javaProblems;

import java.util.Arrays;

public class EqualsArrayInbuiltFun {
    public static void main(String[] args) {
        
        int a[] = {10,20,10,40,30,20,50,10,20};
        int b[] = {10,20,10,40,30,20,50,10,20};

        if(Arrays.equals(a,b)){
            System.out.println("Arrays are Equal..");
        }else{
            System.out.println("Arrays are not Equal !!");
        }

    }
}

/*Output
 * 
 * Arrays are Equal..
 */