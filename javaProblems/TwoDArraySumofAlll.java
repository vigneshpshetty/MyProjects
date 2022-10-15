package javaProblems;
public class TwoDArraySumofAlll {
    public static void main(String[] args) {
        
        int a[][] = {{10,20,30,40,50},
                      {10,20,30,40,50},
                      {10,20,30,40,50},
                      {10,20,30,40,50}};
        int totalSum = 0;
        for(int i = 0;i < a.length; i++){
            for(int j = 0; j<a[i].length;j ++){
                totalSum+=a[i][j];
            }
        }
        System.out.println("Total sum of Array: "+totalSum);

    }
}


/*Output
 * 
 * Total sum of Array: 600
 */