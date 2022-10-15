package javaProblems;

public class TwoDArraySumofAlllAndClass {
    public static void main(String[] args) {

        int a[][] = { { 10, 20, 30, 40, 50 },
                { 10, 20, 30, 40, 50 },
                { 10, 20, 30, 40, 50 },
                { 10, 20, 30, 40, 50 } };
        int totalSum = 0;
        for (int i = 0; i < a.length; i++) {
            int classSum = 0;
            for (int j = 0; j < a[i].length; j++) {
                totalSum += a[i][j];
                classSum+= a[i][j];
            }
            System.out.println("Class Sum is equal to : " + classSum);
        }
        System.out.println("Total sum of Array: " + totalSum);

    }
}

/*output
 * 
 * Class Sum is equal to : 150
    Class Sum is equal to : 150
    Class Sum is equal to : 150
    Class Sum is equal to : 150
    Total sum of Array: 600
 */