//Print the Elements of Secondary Diagonal Matrix

package javaProblems;

/**
 * ElementsofSecondaryDiagonalMatrix
 * 
 * 
 */
public class ElementsofSecondaryDiagonalMatrix {

    public static void main(String[] args) {

        int[][] a = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i == a.length- j-1) {
                    sum += a[i][j];
                }
            }
        }
        System.out.println("Sum of Secondary Diagonal Matrix is: " + sum);
    }
}

/**
 * 
Core logic:
 rowNo == noOfRows - colNo -1

Output:

Sum of Secondary Diagonal Matrix is: 15

 */