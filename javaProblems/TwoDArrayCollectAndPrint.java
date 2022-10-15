package javaProblems;
import java.util.*;

public class TwoDArrayCollectAndPrint {
    public static void main(String[] args) {
        
        int a[][] = new int[4][5];
        Scanner sc =  new Scanner(System.in);

        for(int i = 0;i < a.length; i++){
            for(int j = 0; j<a[i].length;j ++){
                System.out.print("Enter class "+ i+" Student "+j+" marks: ");
                a[i][j]= sc.nextInt();
            }
        }

        for(int i = 0;i < a.length; i++){
            for(int j = 0; j<a[i].length;j ++){
                System.out.print(a[i][j]+ " ");
                
            }
            System.out.println();
        }
        sc.close();
    }
}


/*Output
 * 
 *  10 20 30 40 50
    10 20 30 40 50
    10 20 30 40 50
    10 20 30 40 50
 */