package javaProblems;

public class TwoDArraySubof2Array {
    public static void main(String[] args) {

        int a[][] = { { 1, 2, 3 }, { 1, 2, 3 }, { 1, 2, 3 } };
        int b[][] = { { 1, 2, 3 }, { 1, 2, 3 }, { 1, 2, 3 } };
        int c[][] = new int[3][3];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                c[i][j] = a[i][j] - b[i][j];
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/*output
 * 
 * 0 0 0 
   0 0 0 
   0 0 0 
 */