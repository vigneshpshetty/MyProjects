//Verify Whether The Given Matrix Is Identity Matrix Or Not

package javaProblems;

public class WhetherTheGivenMatrixIsIdentityMatrixOrNot {
    public static void main(String[] args) {

    
        int[][] a = { { 1, 0, 0 },
                { 0, 1, 0 },
                { 0, 0, 1 } };
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i == j && a[i][j]!=1) {
                    System.out.println("The Given Matrix Is not Identity Matrix!");
                    System.exit(0);
                }else if (i != j && a[i][j] ==1) {
                    System.out.println("The Given Matrix Is not Identity Matrix!");
                    System.exit(0);
                }
            }
        }
        System.out.println("The Given Matrix Is Identity Matrix!");
    }
}

/**
Output:

The Given Matrix Is Identity Matrix!

 */