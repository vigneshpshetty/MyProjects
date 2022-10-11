package javaProblems;
import java.util.Arrays;;

public class BinarySearchOfArrayInbuiltFun {
    public static void main(String[] args) {
        
        int a[] = {10,10, 10, 20, 20, 20, 30, 40, 50 };

        int index = Arrays.binarySearch(a,30);

        if(index>0){
            System.out.println("Element found at "+ index+ " Index!");
        }
    }
}

/*Output
 * 
 * Element found at 6 Index!
 */