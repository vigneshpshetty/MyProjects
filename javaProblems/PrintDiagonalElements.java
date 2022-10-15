//WAP to print elements along with principal diagonal matrix

package javaProblems;

/**
 * PrintDiagonalElements
 */
public class PrintDiagonalElements {

    public static void main(String[] args) {

        int [][] a = {{1,2,3},
                        {4,5,6},
                        {7,8,9}};
        System.out.println("principal diagonal matrix is: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(i == j){
                    System.out.print(a[i][j]+" ");
                }else{
                    System.out.print(0+ " ");
                }
            }
            System.out.println();
        }
    }
}

/**Output
 * 
 * principal diagonal matrix is: 
 * 1 0 0 
   0 5 0
   0 0 9
 */