package javaProblems;

public class TwoDArrayTranspose {
    public static void main(String[] args) {
        
        int a[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };
        int b[][] = new int[3][3];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                b[i][j]=a[j][i];
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/*output
 * 
 * 1 2 3 
   1 2 3 
   1 2 3 
 */