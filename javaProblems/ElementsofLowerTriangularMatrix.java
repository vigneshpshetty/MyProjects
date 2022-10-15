//Print the Elements of Lower Triangular Matrix
package javaProblems;

public class ElementsofLowerTriangularMatrix {

    public static void main(String[] args) {

        int[][] a = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };

        System.out.println("Elements of Lower Triangular Matrix is: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i >= j) {
                    System.out.print(a[i][j] + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }
}


/**
Output

Elements of Lower Triangular Matrix is: 
1 0 0 
4 5 0 
7 8 9 

*/