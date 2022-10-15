//Print the Elements of Upper Triangular Matrix
package javaProblems;

/**
 * ElementsofUpperTriangularMatrix
 */
public class ElementsofUpperTriangularMatrix {

    public static void main(String[] args) {

        int [][] a = {{1,2,3},
                        {4,5,6},
                        {7,8,9}};

        
        System.out.println("Elements of Upper Triangular Matrix is: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(i <= j){
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
 * 
 * Elements of Upper Triangular Matrix is: 
   1 2 3 
   0 5 6 
   0 0 9 
 */